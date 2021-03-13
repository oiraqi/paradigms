package ma.aui.sse.paradigms.integration.xs.consumer;

import ma.aui.sse.paradigms.integration.xs.consumer.stub.*;

public class Consumer {
    
    public static void main(String[] args) {

        // calculator is just a proxy, a stub object -- No business implementation
        // It's a fake object giving the impression and luxury to the the consumer
        // that it's using the remote business (real) implementation as if it were local
        Calculator calculator = new CalculatorService().getCalculatorPort();

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

        Result res = calculator.computeAll(x, y);
        System.out.println("Sum: " + res.getSum());
        System.out.println("Difference: " + res.getDifference());
        System.out.println("Product: " + res.getProduct());
        System.out.println("Ratio: " + res.getRatio());
    }
}