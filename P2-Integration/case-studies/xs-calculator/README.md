# Case Study: XML/SOAP Calculator Web Service

## Technolgies
- Service definition language: WSDL
- Protocol: SOAP over HTTP
- Provider programming language: Java (JAX-WS API)
- Consumer programming languages: Java, Python (Zeep module), JavaScript (Soap module)

## Development Process (Java-first)
### Develop the Java provider
- Write the calculator service business implementation: ma.aui.sse.paradigms.integration.xs.calculator.provider.Calculator
- Mark it as an XML/SOAP web service through the JAX-WS @WebService annotation
- Write Result data transfer object (DTO): ma.aui.sse.paradigms.integration.xs.calculator.provider.Result
- Write the Provider main class that creates an instance of the calculator business implementation and publishes it as a web service under `http://localhost:9000/calculator` using JAX-WS Endpoint class: ma.aui.sse.paradigms.integration.xs.provider.Provider

### Generate WSDL and Java server stub code
- Build the code:
  - **./gradlew build**
- Generate the CalculatorService WSDL, as well as skeleton code, from ma.aui.sse.paradigms.integration.xs.provider.Calculator class:
  - **wsgen -wsdl -cp build/classes/java/main/ -d build/classes/java/main/ -r src/main/resources/ ma.aui.sse.paradigms.integration.xs.provider.Calculator**
- Change the service location url within the generated src/main/resources/CalculatorService.wsdl (<soap:address location="REPLACE_WITH_ACTUAL_URL"/>) to: `http://localhost:9000/calculator`

### Run the Java provider
- **./gradlew run**

### Develop and run the Python consumer
- Install Zeep package using pip:
  - pip install zeep
- Write src/main/python/consumer.py. As python is a dynamic language, client stub code is generated dynamically
- run the consumer:
  - python src/main/python/consumer.py

### Run the JS consumer
- Install Soap module using NPM:
  - npm install soap
- Write src/main/js/consumer.js. As JavaScript is a dynamic language, client stub code is generated dynamically
- Run the consumer:
  - node src/main/js/consumer.js

### Develop the Java consumer
- Generate the Java stub code from CalculatorService.wsdl:
  - **wsimport -p ma.aui.sse.paradigms.integration.xs.consumer.stub -d build/classes/java/main/ src/main/resources/CalculatorService.wsdl**
- Write the Java consumer: ma.aui.sse.paradigms.integration.xs.consumer.Consumer.java
- Rebuild the code:
  - **./gradlew build**

### Run the Java consumer
- Change the mainClassName under build.gradle to ma.aui.sse.paradigms.integration.xs..consumer.Consumer
- **./gradlew run**
