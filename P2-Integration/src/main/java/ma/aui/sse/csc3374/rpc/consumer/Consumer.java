package ma.aui.sse.csc3374.rpc.consumer;

import ma.aui.sse.csc3374.rpc.consumer.stub.*;

public class Consumer {
    
    public static void main(String[] args) {

        CalculatorService service = new CalculatorService();

        // calculator is just a proxy, a stub object -- No business implementation
        // It's a fake object giving the impression and luxury to the the consumer
        // that it's using the remote business (real) implementation as if it were local
        Calculator calculator = service.getCalculatorPort();

        double x = 7.0, y = 5.0, result;

        // Remote calls (as if they were local!)
        // No sockets, no protocol, no hassle!
        // All is hidden behind the scenes
        result = calculator.add(x, y);
        System.out.println(x + " + " + y + " = " + result);

        result = calculator.subtract(x, y);
        System.out.println(x + " - " + y + " = " + result);

        result = calculator.multiply(x, y);
        System.out.println(x + " x " + y + " = " + result);

        result = calculator.divide(x, y);
        System.out.println(x + " : " + y + " = " + result);

    }
}