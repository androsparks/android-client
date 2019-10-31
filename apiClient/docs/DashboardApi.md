# DashboardApi

All URIs are relative to */api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAssets**](DashboardApi.md#getAssets) | **GET** v2.0/dashboard/assets | 
[**getChart**](DashboardApi.md#getChart) | **GET** v2.0/dashboard/chart | 
[**getInvestingDetails**](DashboardApi.md#getInvestingDetails) | **GET** v2.0/dashboard/investing | 
[**getPortfolio**](DashboardApi.md#getPortfolio) | **GET** v2.0/dashboard/portfolio | Money distribution in percents. Empty list if no money at all
[**getRecommendations**](DashboardApi.md#getRecommendations) | **GET** v2.0/dashboard/recommendations | Recommended assets to invest (programs, funds and signals). Funds in passed currency
[**getSummary**](DashboardApi.md#getSummary) | **GET** v2.0/dashboard/summary | 
[**getTradingDetails**](DashboardApi.md#getTradingDetails) | **GET** v2.0/dashboard/trading | 

<a name="getAssets"></a>
# **getAssets**
> DashboardAssets getAssets(authorization, topAssetsCount)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String authorization = "authorization_example"; // String | JWT access token
Integer topAssetsCount = 56; // Integer | 
try {
    DashboardAssets result = apiInstance.getAssets(authorization, topAssetsCount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#getAssets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| JWT access token |
 **topAssetsCount** | **Integer**|  | [optional]

### Return type

[**DashboardAssets**](DashboardAssets.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="getChart"></a>
# **getChart**
> Void getChart(authorization)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String authorization = "authorization_example"; // String | JWT access token
try {
    Void result = apiInstance.getChart(authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#getChart");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| JWT access token |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="getInvestingDetails"></a>
# **getInvestingDetails**
> DashboardInvestingDetails getInvestingDetails(authorization, currency)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String authorization = "authorization_example"; // String | JWT access token
String currency = "currency_example"; // String | 
try {
    DashboardInvestingDetails result = apiInstance.getInvestingDetails(authorization, currency);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#getInvestingDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| JWT access token |
 **currency** | **String**|  | [optional] [enum: Undefined, GVT, ETH, BTC, ADA, USDT, XRP, BCH, LTC, DOGE, BNB, USD, EUR]

### Return type

[**DashboardInvestingDetails**](DashboardInvestingDetails.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="getPortfolio"></a>
# **getPortfolio**
> DashboardPortfolio getPortfolio(authorization)

Money distribution in percents. Empty list if no money at all

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String authorization = "authorization_example"; // String | JWT access token
try {
    DashboardPortfolio result = apiInstance.getPortfolio(authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#getPortfolio");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| JWT access token |

### Return type

[**DashboardPortfolio**](DashboardPortfolio.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="getRecommendations"></a>
# **getRecommendations**
> DashboardRecommendations getRecommendations(authorization, currency)

Recommended assets to invest (programs, funds and signals). Funds in passed currency

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String authorization = "authorization_example"; // String | JWT access token
String currency = "currency_example"; // String | 
try {
    DashboardRecommendations result = apiInstance.getRecommendations(authorization, currency);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#getRecommendations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| JWT access token |
 **currency** | **String**|  | [optional] [enum: Undefined, GVT, ETH, BTC, ADA, USDT, XRP, BCH, LTC, DOGE, BNB, USD, EUR]

### Return type

[**DashboardRecommendations**](DashboardRecommendations.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="getSummary"></a>
# **getSummary**
> DashboardSummary getSummary(authorization, currency)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String authorization = "authorization_example"; // String | JWT access token
String currency = "currency_example"; // String | 
try {
    DashboardSummary result = apiInstance.getSummary(authorization, currency);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#getSummary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| JWT access token |
 **currency** | **String**|  | [optional] [enum: Undefined, GVT, ETH, BTC, ADA, USDT, XRP, BCH, LTC, DOGE, BNB, USD, EUR]

### Return type

[**DashboardSummary**](DashboardSummary.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="getTradingDetails"></a>
# **getTradingDetails**
> DashboardTradingDetails getTradingDetails(authorization, currency)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String authorization = "authorization_example"; // String | JWT access token
String currency = "currency_example"; // String | 
try {
    DashboardTradingDetails result = apiInstance.getTradingDetails(authorization, currency);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#getTradingDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| JWT access token |
 **currency** | **String**|  | [optional] [enum: Undefined, GVT, ETH, BTC, ADA, USDT, XRP, BCH, LTC, DOGE, BNB, USD, EUR]

### Return type

[**DashboardTradingDetails**](DashboardTradingDetails.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json
