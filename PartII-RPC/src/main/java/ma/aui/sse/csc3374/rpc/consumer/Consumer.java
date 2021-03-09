package ma.aui.sse.csc3374.rpc.consumer;

import ma.aui.sse.csc3374.rpc.consumer.stub.*;

public class Consumer {
    
    public static void main(String[] args) {

        CalculatorService service = new CalculatorService();
        Calculator calculator = service.getCalculatorPort();

        double x = 7.0, y = 5.0;

        System.out.println(x + " + " + y + " = " + calculator.add(x, y));
        System.out.println(x + " - " + y + " = " + calculator.subtract(x, y));
        System.out.println(x + " x " + y + " = " + calculator.multiply(x, y));
        System.out.println(x + " : " + y + " = " + calculator.divide(x, y));

    }
}