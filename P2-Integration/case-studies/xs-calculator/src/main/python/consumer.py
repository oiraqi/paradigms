from zeep import Client
calculator = Client('src/main//resources/CalculatorService.wsdl').service
x, y = 7.0, 5.0
result = calculator.add(x, y)
print(str(x) + ' + ' + str(y) + ' = ' + str(result))

result = calculator.subtract(x, y)
print(str(x) + ' - ' + str(y) + ' = ' + str(result))

result = calculator.multiply(x, y)
print(str(x) + ' x ' + str(y) + ' = ' + str(result))

result = calculator.divide(x, y)
print(str(x) + ' : ' + str(y) + ' = ' + str(result))

result = calculator.computeAll(x, y)
print(result)
