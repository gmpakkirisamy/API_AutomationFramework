# API_AutomationFramework

## Project Overview
API_AutomationFramework is designed to automate API testing using various libraries and tools. This framework aims to provide a robust and scalable solution for testing RESTful APIs.

## Dependencies
The project uses the following dependencies:

- **Rest Assured**: For API testing
  ```xml
  <dependency>
    <groupId>io.rest-assured</groupId>
    <artifactId>rest-assured</artifactId>
    <version>5.5.1</version>
    <scope>test</scope>
  </dependency>
TestNG: For test execution and reporting

<dependency>
  <groupId>org.testng</groupId>
  <artifactId>testng</artifactId>
  <version>7.11.0</version>
  <scope>test</scope>
</dependency>
Allure TestNG: For generating test reports

<dependency>
  <groupId>io.qameta.allure</groupId>
  <artifactId>allure-testng</artifactId>
  <version>2.29.1</version>
</dependency>
AssertJ: For fluent assertions

<dependency>
  <groupId>org.assertj</groupId>
  <artifactId>assertj-core</artifactId>
  <version>3.27.3</version>
  <scope>test</scope>
</dependency>
Gson: For JSON parsing

<dependency>
  <groupId>com.google.code.gson</groupId>
  <artifactId>gson</artifactId>
  <version>2.12.1</version>
</dependency>
Jackson Databind: For JSON data binding

<dependency>
  <groupId>com.fasterxml.jackson.core</groupId>
  <artifactId>jackson-databind</artifactId>
  <version>2.18.3</version>
</dependency>
Jackson Annotations: For JSON annotations

<dependency>
  <groupId>com.fasterxml.jackson.core</groupId>
  <artifactId>jackson-annotations</artifactId>
  <version>2.18.3</version>
</dependency>
JSON Schema Validator: For validating JSON schemas

<dependency>
  <groupId>io.rest-assured</groupId>
  <artifactId>json-schema-validator</artifactId>
  <version>5.5.1</version>
  <scope>test</scope>
</dependency>
Log4j: For logging

<dependency>
  <groupId>org.apache.logging.log4j</groupId>
  <artifactId>log4j-core</artifactId>
  <version>2.24.0</version>
</dependency>
Apache POI: For working with Microsoft Office documents

<dependency>
  <groupId>org.apache.poi</groupId>
  <artifactId>poi</artifactId>
  <version>5.2.3</version>
</dependency>
Apache POI OOXML: For working with OOXML formats

<dependency>
  <groupId>org.apache.poi</groupId>
  <artifactId>poi-ooxml</artifactId>
  <version>5.2.3</version>
</dependency>
Getting Started
To get started with the API_AutomationFramework, follow these steps:

Clone the repository:

git clone <repository-url>
Navigate to the project directory:

cd API_AutomationFramework
Build the project using Maven:

mvn clean install
Run the tests:

mvn test
Usage
Add your test cases in the src/test/java directory.
Configure your API endpoints and test data in the src/main/resources directory.
Use the provided libraries and dependencies to write and execute your tests.
Contributing
If you would like to contribute to this project, please fork the repository and submit a pull request.

License
This project is licensed under the MIT License.

Contact
For any questions or inquiries, please contact [gmpakkirisamy@gmail.com].