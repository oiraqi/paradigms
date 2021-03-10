let soap = require('soap');
let url = '../resources/CalculatorService.wsdl';
let args = { arg0: 7.0, arg1: 5.0 };

soap.createClient(url, (err, calculator) => {
    
    calculator.add(args, (er, result) => {
        console.log(args.arg0 + ' + ' + args.arg1 + ' = ' + result.return);
    });

    calculator.subtract(args, (er, result) => {
        console.log(args.arg0 + ' - ' + args.arg1 + ' = ' + result.return);
    });

    calculator.multiply(args, (er, result) => {
        console.log(args.arg0 + ' x ' + args.arg1 + ' = ' + result.return);
    });

    calculator.divide(args, (er, result) => {
        console.log(args.arg0 + ' : ' + args.arg1 + ' = ' + result.return);
    });

    calculator.computeAll(args, (er, result) => {
        console.log(result.return);
    });

});

/*soap.createClientAsync(url).then((calculator) => {
    return calculator.multiply(args);
}).then((result) => {
    console.log(result);
});*/