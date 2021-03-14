# swagger_client.CalculatorApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add**](CalculatorApi.md#add) | **GET** /calculator/additions | 
[**compute_all**](CalculatorApi.md#compute_all) | **GET** /calculator/all | 
[**divide**](CalculatorApi.md#divide) | **GET** /calculator/divisions | 
[**multiply**](CalculatorApi.md#multiply) | **GET** /calculator/multiplications | 
[**subtract**](CalculatorApi.md#subtract) | **GET** /calculator/subtractions | 

# **add**
> float add(x, y)



### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.CalculatorApi()
x = 1.2 # float | 
y = 1.2 # float | 

try:
    api_response = api_instance.add(x, y)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CalculatorApi->add: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **x** | **float**|  | 
 **y** | **float**|  | 

### Return type

**float**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **compute_all**
> Result compute_all(x, y)



### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.CalculatorApi()
x = 1.2 # float | 
y = 1.2 # float | 

try:
    api_response = api_instance.compute_all(x, y)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CalculatorApi->compute_all: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **x** | **float**|  | 
 **y** | **float**|  | 

### Return type

[**Result**](Result.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **divide**
> float divide(x, y)



### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.CalculatorApi()
x = 1.2 # float | 
y = 1.2 # float | 

try:
    api_response = api_instance.divide(x, y)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CalculatorApi->divide: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **x** | **float**|  | 
 **y** | **float**|  | 

### Return type

**float**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **multiply**
> float multiply(x, y)



### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.CalculatorApi()
x = 1.2 # float | 
y = 1.2 # float | 

try:
    api_response = api_instance.multiply(x, y)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CalculatorApi->multiply: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **x** | **float**|  | 
 **y** | **float**|  | 

### Return type

**float**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **subtract**
> float subtract(x, y)



### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.CalculatorApi()
x = 1.2 # float | 
y = 1.2 # float | 

try:
    api_response = api_instance.subtract(x, y)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CalculatorApi->subtract: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **x** | **float**|  | 
 **y** | **float**|  | 

### Return type

**float**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

