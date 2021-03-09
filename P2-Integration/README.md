To generate the CalculatorService WSDL from ma.aui.sse.csc3374.rpc.provider.Calculator class:\
wsgen -cp build/classes/java/main/ -d build/classes/java/main/ -r src/main/resources/ ma.aui.sse.csc3374.rpc.provider.Calculator

To generate the Java stub from CalculatorService.wsdl:\
wsimport -p ma.aui.sse.csc3374.rpc.consumer.stub -d build/classes/java/main/ src/main/resources/CalculatorService.wsdl
