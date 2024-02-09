# Swagger to Java Models Generator

## Description

The Swagger to Java Models Generator is a Java tool that takes a Swagger JSON file as input and generates Java models. 
It simplifies the process of creating Java classes based on your Swagger API definition.

## Table of Contents

- [Installation](#installation)
- [Usage](#usage)
- [Features](#features)
- [Contributing](#contributing)
- [License](#license)

## Installation

1. Clone the repository:

    ```bash
    git clone https://github.com/your-username/swagger-to-java-models.git
    cd swagger-to-java-models
    ```

2. Build the project with Maven:

    ```bash
    mvn clean install
    ```

## Usage

To generate Java models from a Swagger JSON file, add the following dependency to your Maven project:

```xml
<dependency>
    <groupId>com.example</groupId>
    <artifactId>swagger-to-java-models</artifactId>
    <version>1.0.0</version> <!-- Replace with the actual version -->
</dependency>
