# BrokersApi

All URIs are relative to *https://red.genesis.vision/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBrokers**](BrokersApi.md#getBrokers) | **GET** v2.0/brokers | Get brokers for creating trading accounts
[**getBrokersDemo**](BrokersApi.md#getBrokersDemo) | **GET** v2.0/brokers/demo | Get brokers for creating demo trading accounts
[**getBrokersExternal**](BrokersApi.md#getBrokersExternal) | **GET** v2.0/brokers/external | Get brokers for creating external trading accounts
[**getBrokersForProgram**](BrokersApi.md#getBrokersForProgram) | **GET** v2.0/brokers/{programId} | Get brokers for program

<a name="getBrokers"></a>
# **getBrokers**
> BrokersInfo getBrokers()

Get brokers for creating trading accounts

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BrokersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

BrokersApi apiInstance = new BrokersApi();
try {
    BrokersInfo result = apiInstance.getBrokers();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrokersApi#getBrokers");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**BrokersInfo**](BrokersInfo.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="getBrokersDemo"></a>
# **getBrokersDemo**
> BrokersInfo getBrokersDemo()

Get brokers for creating demo trading accounts

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BrokersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

BrokersApi apiInstance = new BrokersApi();
try {
    BrokersInfo result = apiInstance.getBrokersDemo();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrokersApi#getBrokersDemo");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**BrokersInfo**](BrokersInfo.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="getBrokersExternal"></a>
# **getBrokersExternal**
> BrokersInfo getBrokersExternal()

Get brokers for creating external trading accounts

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BrokersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

BrokersApi apiInstance = new BrokersApi();
try {
    BrokersInfo result = apiInstance.getBrokersExternal();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrokersApi#getBrokersExternal");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**BrokersInfo**](BrokersInfo.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="getBrokersForProgram"></a>
# **getBrokersForProgram**
> BrokersProgramInfo getBrokersForProgram(programId)

Get brokers for program

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BrokersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

BrokersApi apiInstance = new BrokersApi();
UUID programId = new UUID(); // UUID | 
try {
    BrokersProgramInfo result = apiInstance.getBrokersForProgram(programId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrokersApi#getBrokersForProgram");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | [**UUID**](.md)|  |

### Return type

[**BrokersProgramInfo**](BrokersProgramInfo.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

