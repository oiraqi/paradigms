package ma.aui.sse.paradigms.integration.xs.calculator.provider;

import javax.xml.ws.Endpoint;

public class Provider {

    private static final String URL = "http://localhost:9000/calculator";

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        System.out.println("Publishing Calculator Service");
        Endpoint.publish(URL, calculator);
        System.out.println("Calculator Service Published");
    }
    
}