### Problem 1

Temelio has a backend rest API that is documented in swagger.json here: https://dev-backend.trytemelio.com/api/swagger.json. You can view a more user friendly version of the documentation with the swagger extension here: https://dev-backend.trytemelio.com/api/swagger

We want you to write a script to convert all the swagger.json models to typesafe local object models.

The script can be written in either Python, Java or Typescript. The script should take the swagger.json file as input and output the typesafe local models in either Python, Java or Typescript respectively.

For example, the model `NylasSyncRequest` can be represented in Python as something like this:

```python
from typing import List
from datetime import date
import uuid

class NylasSyncRequest:
    def __init__(self, start_date: date, user_ids: List[uuid.UUID]):
        self.start_date = start_date
        self.user_ids = user_ids
```

Once complete, name the script as `Soluton1` with the appropriate extension and be ready to discuss your solution and show the output of running the script. You cannot use any external libraries to do this conversion.
