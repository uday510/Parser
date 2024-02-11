package com.temelio;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
       try {

           // Swagger first JSON file path
            String swaggerJsonPath = null; // swagger.json file path goes here
            String outputFilePath = null; // output file path goes here

            // Read the swagger.json file and generate the models
            String swaggerJson = readSwaggerJson(swaggerJsonPath);

            // Parse the swagger.json and generate the models
            String models = generateJavaModels(swaggerJson);

            // Write the models to a file
           writeToFile(outputFilePath, models);

           System.out.println("Models generated successfully");

       } catch (IOException e) {
           System.err.println("Error: " + e.getMessage());
       }

    }
    /**
     * Reads the content of a JSON file and returns it as a string.
     *
     * @param filePath The path to the JSON file.
     * @return The content of the JSON file as a string.
     * @throws IOException If there is an issue reading the file.
     */
    private static String readSwaggerJson(String filePath) throws IOException {
        // Read the content of the JSON file and return it as a string
        return new String(Files.readAllBytes(new File(filePath).toPath()));
    }

    private static String generateJavaModels(String swaggerJson) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(swaggerJson);

        // Parse the swagger.json and generate the models
        StringBuilder models = new StringBuilder();

        String[] classes = null;

        // get the classes from the json

        if (jsonNode.get("definitions") != null) {
            // Get the class names from the definitions node, if it exists in the JSON
            classes = new String[jsonNode.get("definitions").size()];
            int i = 0;
            // Iterate through the class names and add them to the array
            for (Iterator<String> it = jsonNode.get("definitions").fieldNames(); it.hasNext(); i++) {
                classes[i] = it.next();
            }
        }

        // Generate package statement
        models.append("package com.temelio;\n\n");

        // Generate import statements
        models.append("import java.util.*;\n\n");
        // create base class
        models.append("public class Output {\n\n");

        // Generate models for each class
        for (String className : classes) {
            generateClassModels(jsonNode, className, models);
        }

        // Close the base class
        models.append("}\n");

        return models.toString();
    }

    private static void generateClassModels(JsonNode jsonNode, String className, StringBuilder models) {
        JsonNode definitionNode = jsonNode.get("definitions").path(className);

        // Check if the definition for the class is missing
        if (definitionNode.isMissingNode()) {
            System.err.println("Definition for Class " + className + " not found");
            return;
        }

        // Generate class declaration
        models.append("public static class ").append(className).append(" {\n");

        // Generate fields for each property
        JsonNode propertiesNode = definitionNode.path("properties");
        Iterator<Map.Entry<String, JsonNode>> properties = propertiesNode.fields();

        // Iterate through the properties
        while (properties.hasNext()) {
            Map.Entry<String, JsonNode> property = properties.next();
            String propertyName = property.getKey();

            // Check for reserved keywords ,
            if (isReservedKeyword(propertyName)) {
                propertyName = "_" + propertyName;
            }

            JsonNode propertyDetails = property.getValue();

            // Determine the type of the property
            String propertyType = determinePropertyType(propertyName, propertyDetails);

            // Generate the field declaration
            generateFieldDeclaration(models, propertyName, propertyType, propertyDetails);
        }


        // Generate default constructor
        models.append("\n    public ").append(className).append("() {}\n");

        // if class is empty then return
        if (propertiesNode.isEmpty()) {
            models.append("}\n\n");
            return;
        }
        // Generate constructor with all fields
        models.append("\n    public ").append(className).append("(");

        // Iterate through the properties
        Iterator<Map.Entry<String, JsonNode>> propertiesConstructor = propertiesNode.fields();

        while (propertiesConstructor.hasNext()) {
            Map.Entry<String, JsonNode> property = propertiesConstructor.next();
            String propertyName = property.getKey();

            // Check for reserved keywords ,
            if (isReservedKeyword(propertyName)) {
                propertyName = "_" + propertyName;
            }

            JsonNode propertyDetails = property.getValue();

            // Determine the type of the property
            String propertyType = determinePropertyType(propertyName, propertyDetails);

            // Generate the constructor parameters
            models.append(propertyType).append(" ").append(propertyName);

            // Add a comma if there are more parameters
            if (propertiesConstructor.hasNext()) {
                models.append(", ");
            }
        }

        // Close the constructor declaration
        models.append(") {\n");

        // Generate the constructor assignments
        propertiesConstructor = propertiesNode.fields();

        while (propertiesConstructor.hasNext()) {
            Map.Entry<String, JsonNode> property = propertiesConstructor.next();
            String propertyName = property.getKey();

            // Check for reserved keywords ,
            if (isReservedKeyword(propertyName)) {
                propertyName = "_" + propertyName;
            }

            // Generate the constructor body
            models.append("        this.").append(propertyName).append(" = ").append(propertyName).append(";\n");
        }

        // Close the constructor declaration
        models.append("    }\n");

        // Generate getters and setters for each property
        properties = propertiesNode.fields();

        // Iterate through the properties
        while (properties.hasNext()) {
            Map.Entry<String, JsonNode> property = properties.next();
            String propertyName = property.getKey();

            // Check for reserved keywords ,
            if (isReservedKeyword(propertyName)) {
                propertyName = "_" + propertyName;
            }

            JsonNode propertyDetails = property.getValue();

            // Determine the type of the property
            String propertyType = determinePropertyType(propertyName, propertyDetails);

            // Generate getter
            models.append("\n    public ").append(propertyType).append(" get")
                    .append(capitalize(propertyName)).append("() {\n")
                    .append("        return ").append(propertyName).append(";\n")
                    .append("    }\n");

            // Generate setter
            models.append("\n    public void set").append(capitalize(propertyName))
                    .append("(").append(propertyType).append(" ").append(propertyName).append(") {\n")
                    .append("        this.").append(propertyName).append(" = ").append(propertyName).append(";\n")
                    .append("    }\n");
        }

        // Close the class declaration
        models.append("}\n\n");
    }

    /**
     * Determines the type of the property based on the JSON schema.
     *
     * @param propertyDetails JSON node containing property details.
     * @return The type of the property.
     */
    private static String determinePropertyType(String propertyName, JsonNode propertyDetails) {
        // Check if the property is a reference type
        if (propertyDetails.has("$ref")) {
            String ref = propertyDetails.get("$ref").asText();
            return mapJsonSchemaTypeToJava(ref.substring(ref.lastIndexOf("/") + 1));
        }

        // Check if the property has a defined type
        if (propertyDetails.has("type")) {
            String propertyType = propertyDetails.get("type").asText();
            propertyType = mapJsonSchemaTypeToJava(propertyType);

            // Check for additional properties in the case of an Object type
            if (propertyType.equals("Object") && propertyDetails.has("additionalProperties")) {
                JsonNode additionalProperties = propertyDetails.get("additionalProperties");

                // Check if additional properties are of a reference type
                if (additionalProperties.has("$ref")) {
                    String ref = additionalProperties.get("$ref").asText();
                    return mapJsonSchemaTypeToJava(ref.substring(ref.lastIndexOf("/") + 1));
                }
            }

            // Check if the property is an array
            if (propertyType.equals("List") && propertyDetails.has("items")) {
                JsonNode itemsNode = propertyDetails.path("items");

                // Handle the case where the array items are of another class
                if (itemsNode.has("$ref")) {
                    String ref = itemsNode.get("$ref").asText();
                    return "List<" + mapJsonSchemaTypeToJava(ref.substring(ref.lastIndexOf("/") + 1)) + ">";
                } else if (itemsNode.has("type")) {
                    // Handle the case where the array items are of a primitive type
                    String itemType = itemsNode.get("type").asText();
                    return "List<" + mapJsonSchemaTypeToJava(itemType) + ">";
                }
            }

            // Check if the property is an enum
            if (propertyDetails.has("enum")) {
                return capitalize(propertyName);
            }

            return propertyType;
        }

        // Default to Object type if no type is specified
        return "Object";
    }

    /**
     * Generates the field declaration for a property and appends it to the StringBuilder.
     *
     * @param models           StringBuilder to append the field declaration.
     * @param propertyName     Name of the property.
     * @param propertyType     Type of the property.
     * @param propertyDetails  JSON node containing property details.
     */
    private static void generateFieldDeclaration(StringBuilder models, String propertyName, String propertyType, JsonNode propertyDetails) {
        // Check for array type
        if (propertyDetails.has("items")) {
            JsonNode itemsNode = propertyDetails.path("items");

            // Handle the case where the array items are of another class
            if (itemsNode.has("$ref")) {
                String ref = itemsNode.get("$ref").asText();
                String type = mapJsonSchemaTypeToJava(ref.substring(ref.lastIndexOf("/") + 1));
                propertyType = "List<" + type + ">";
            } else {
                // Handle the case where the array items are of a primitive type
                String type = itemsNode.get("type").asText();
                propertyType = "List<" + mapJsonSchemaTypeToJava(type) + ">";
            }
        }

        // Check for enum type
        boolean isEnumProperty = propertyDetails.has("enum");

        // Generate the field declaration
        if (isEnumProperty) {
            // Handle the case where the property is an enum
            generateEnumDeclaration(models, propertyName, propertyDetails);
        } else {
            // Handle the case where the property is not an enum
            models.append("    private ").append(propertyType).append(" ").append(propertyName).append(";\n");
        }
    }
    /**
     * Generates the enum declaration for a property and appends it to the StringBuilder.
     *
     * @param models          StringBuilder to append the enum declaration.
     * @param propertyName    Name of the enum property.
     * @param propertyDetails JSON node containing property details.
     */
    private static void generateEnumDeclaration(StringBuilder models, String propertyName, JsonNode propertyDetails) {
        // Handle the case where the property is an enum
        String enumType = capitalize(propertyName);
        models.append("    public enum ").append(enumType).append(" {\n");

        // Iterate through the enum values
        for (JsonNode enumValue : propertyDetails.get("enum")) {
            models.append("        ").append(enumValue.asText()).append(",\n");
        }

        // Close the enum declaration
        models.append("    }\n");

        // change the propertyType to enumType
        models.append("    private ").append(enumType).append(" ").append(propertyName).append(";\n");
    }
    /**
     * Maps JSON schema types to Java types.
     *
     * @param str JSON schema type to be mapped.
     * @return Corresponding Java type.
     */
    private static String mapJsonSchemaTypeToJava(String str) {
        // Use switch expression to map JSON schema types to Java types
        String javaType = switch (str) {
            case "string" -> "String";
            case "integer" -> "int";
            case "number" -> "double";
            case "boolean" -> "boolean";
            case "array" -> "List";
            default -> str;
        };

        // Special case for "object" type
        if (str.equals("object")) {
            return "Object";
        }

        return javaType;
    }

    /**
     * Writes content to a file at the specified filePath.
     *
     * @param filePath Path to the file where content should be written.
     * @param content  Content to be written to the file.
     * @throws IOException If an I/O error occurs while writing to the file.
     */
    private static void writeToFile(String filePath, String content) throws IOException {
        Path path = Paths.get(filePath);

        // Write content to the specified file path
        Files.write(path, content.getBytes());
    }

    /**
     * Capitalizes the first letter of a string.
     *
     * @param str The input string to be capitalized.
     * @return The string with the first letter capitalized.
     */
    private static String capitalize(String str) {
        // Capitalize the first letter using substring
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    /**
     * Checks for reserved keywords in Java.
     *
     * @param str The input string to be checked.
     * @return True if the string is a reserved keyword, false otherwise.
     */
    private static boolean isReservedKeyword(String str) {
        // Check if the string is a reserved keyword
        return str.equals("long") || str.equals("class")
                || str.equals("synchronized")
                || str.equals("default");
    }
}
