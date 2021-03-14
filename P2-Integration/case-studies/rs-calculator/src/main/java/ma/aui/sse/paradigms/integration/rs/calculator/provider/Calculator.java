package ma.aui.sse.paradigms.integration.rs.calculator.provider;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class Calculator {

    @GetMapping("/additions")
    public double add(double x, double y) {
        return x + y;
    }

    @GetMapping("/subtractions")
    public double subtract(double x, double y) {
        return x - y;
    }

    @GetMapping("/multiplications")
    public double multiply(double x, double y) {
        return x * y;
    }

    @GetMapping("/divisions")
    public double divide(double x, double y) {
        return x / y;
    }

    @GetMapping(path = "/all", produces = "application/json")
    public Result computeAll(double x, double y) {
        return new Result(x + y, x - y, x * y, x / y);
    }
    
}