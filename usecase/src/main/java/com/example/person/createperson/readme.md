In this package we have all the relevant information related to the create person use case which 
the business needs to be executed.

# Model
Here we have 3 types of classes:

## Request
The request objects for which are the input to our use case. These clearly tell the consumers what data is required 
and how it looks.

## Response
The response objects for which are the output of our use case. These clearly tell the consumers what data is optional
and how it looks.

## Use Case Specific
These are classes which the use case uses within the implementation class. These exist to provide a very clear and concise data view.
It tells us that when executing this use case, this data will be present and this data not. This avoids cases where 
unnecessary data is exposed in a use case and you never now if it is actually present or not.

It also allows this use case to decouple itself from the overall domain object.

# Use Case Adapter
This class is responsible for dealing with the implementation details for which the use case does not care about.
You need to retrieve/create data, then the adapter deals with this. It aims to serve the use case for it's data operations.

# Use Case Imp
This is the core business logic. It only deals with its own models and does not care about the implementation details such as getting and creating data.
It delegates these tasks to the adapter class.
