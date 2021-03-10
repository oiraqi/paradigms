package ma.aui.sse.paradigms.integration.rs.provider;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class Calculator {

    @GetMapping("/add")
    public double add(double x, double y) {
        return x + y;
    }

    @GetMapping("/subtract")
    public double subtract(double x, double y) {
        return x - y;
    }

    @GetMapping("/multiply")
    public double multiply(double x, double y) {
        return x * y;
    }

    @GetMapping("/divide")
    public double divide(double x, double y) {
        return x / y;
    }

    @GetMapping("/computeAll")
    public Result computeAll(double x, double y) {
        return new Result(x + y, x - y, x * y, x / y);
    }
    
}