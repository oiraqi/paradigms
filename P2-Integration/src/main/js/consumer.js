let soap = require('soap');
let url = '../resources/CalculatorService.wsdl';
let args = { args0: 7.0, args1: 5.0 };

soap.createClient(url, function(err, calculator) {
    calculator.add(args, function(er, result) {
        console.log(result);
    });

    calculator.subtract(args, function(er, result) {
        console.log(result);
    });

    calculator.multiply(args, function(er, result) {
        console.log(result);
    });

    calculator.divide(args, function(er, result) {
        console.log(result);
    });

    calculator.computeAll(args, function(er, result) {
        console.log(result);
    });
});

/*soap.createClientAsync(url).then((calculator) => {
    return calculator.multiply(args);
}).then((result) => {
    console.log(result);
});*/