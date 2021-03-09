package ma.aui.sse.csc3374.rpc.provider;

import javax.xml.ws.Endpoint;

public class Provider {

    private static final String URL = "http://localhost:9000/calculator";

    public static void main(String[] args) throws Exception {

        Calculator calculator = new Calculator();
        System.out.println("Publishing Calculator Service");
        Endpoint.publish(URL, calculator);
        System.out.println("Calculator Service Published");

        while(true) { // Keep it alive
            System.out.println("Waiting...");
            Thread.sleep(60 * 1000);
        }
    }
}