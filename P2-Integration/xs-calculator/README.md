# Case Study: XML/SOAP Calculator Web Service

## Technolgies
- Service definition language: WSDL
- Protocol: SOAP over HTTP
- Provider programming language: Java (JAX-WS API)
- Consumer programming languages: Java, Python (Zeep module), JavScript (Soap module)

## Development Process (Java-first)
### Implement the Java provider
- Write the calculator service business implementation: ma.aui.sse.paradigms.integration.xs.provider.Calculator
- Mark it as an XML/SOAP web service through the JAX-WS @WebService annotation
- Write Result data transfer object (DTO): ma.aui.sse.paradigms.integration.xs.provider.Result
- Write the Provider main class that creates an instance of the calculator business implementation and publishes it as a web service under `http://localhost:9000/calculator` using JAX-WS Endpoint class: ma.aui.sse.paradigms.integration.xs.provider.Provoder

### Generate WSDL and Java server stub code
- Comment out (if not already done) the import and the code inside ma.aui.sse.csc3374.rpc.consumer.Consumer
- Build the code:
  - **./gradlew build**
- Generate the CalculatorService WSDL, as well as skeleton code, from ma.aui.sse.csc3374.rpc.provider.Calculator class:
  - **wsgen -wsdl -cp build/classes/java/main/ -d build/classes/java/main/ -r src/main/resources/ ma.aui.sse.paradigms.integration.xs.provider.Calculator**
- Change the service location url within the generated src/main/resources/CalculatorService.wsdl (<soap:address location="REPLACE_WITH_ACTUAL_URL"/>) to: http://localhost:9000/calculator

### Generate Java consumer stub code
Generate the Java stub code from CalculatorService.wsdl:
- **wsimport -p ma.aui.sse.paradigms.integration.xs.consumer.stub -d build/classes/java/main/ src/main/resources/CalculatorService.wsdl**

### Rebuild
- Uncomment the import and the code inside ma.aui.sse.csc3374.rpc.consumer.Consumer
- Rebuild the code:
  - **./gradlew build**

### Run the Java provider
- **./gradlew run**

### Run the Java consumer
- Change the mainClassName under build.gradle to ma.aui.sse.csc3374.rpc.consumer.Consumer
- **./gradlew run**

### Run the Python consumer
- pip install zeep
- python src/main/python/consumer.py

### Run the JS consumer
- npm install soap
- node src/main/js/consumer.js
