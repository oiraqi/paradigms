package ma.aui.sse.csc3374.rpc.provider;

import javax.jws.WebService;

@WebService
public class Calculator {

    public double add(double x, double y) {
        double result = x + y;
        log(x, y, result, "add", "+");
        return result;
    }

    public double subtract(double x, double y) {
        double result = x - y;
        log(x, y, result, "subtract", "-");
        return result;
    }

    public double multiply(double x, double y) {
        double result = x * y;
        log(x, y, result, "multiply", "x");
        return result;
    }

    public double divide(double x, double y) {
        double result = x / y;
        log(x, y, result, "divide", ":");
        return result;
    }

    private void log(double x, double y, double result, String method, String operator) {
        System.out.println(method + " method invoked: computing " + x + " " + operator + " " + y + " -> " + result);
    }
}