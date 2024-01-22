/*
 * Xero AppStore API
 * These endpoints are for Xero Partners to interact with the App Store Billing platform
 *
 * The version of the OpenAPI document: 2.40.3
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.api.client;

import com.fasterxml.jackson.core.type.TypeReference;
import com.google.api.client.auth.oauth2.BearerToken;
import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpContent;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpMethods;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpResponseException;
import com.google.api.client.http.HttpTransport;
import com.xero.api.ApiClient;
import com.xero.api.XeroApiExceptionHandler;
import com.xero.models.appstore.CreateUsageRecord;
import com.xero.models.appstore.Subscription;
import com.xero.models.appstore.UpdateUsageRecord;
import com.xero.models.appstore.UsageRecord;
import com.xero.models.appstore.UsageRecordsList;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.ws.rs.core.UriBuilder;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** AppStoreApi has methods for interacting with all endpoints in the API set */
public class AppStoreApi {
  private ApiClient apiClient;
  private static AppStoreApi instance = null;
  private String userAgent = "Default";
  private String version = "4.30.1";
  static final Logger logger = LoggerFactory.getLogger(AppStoreApi.class);

  /** AppStoreApi */
  public AppStoreApi() {
    this(new ApiClient());
  }

  /**
   * AppStoreApi getInstance
   *
   * @param apiClient ApiClient pass into the new instance of this class
   * @return instance of this class
   */
  public static AppStoreApi getInstance(ApiClient apiClient) {
    if (instance == null) {
      instance = new AppStoreApi(apiClient);
    }
    return instance;
  }

  /**
   * AppStoreApi
   *
   * @param apiClient ApiClient pass into the new instance of this class
   */
  public AppStoreApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * get ApiClient
   *
   * @return apiClient the current ApiClient
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * set ApiClient
   *
   * @param apiClient ApiClient pass into the new instance of this class
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * set user agent
   *
   * @param userAgent string to override the user agent
   */
  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }

  /**
   * get user agent
   *
   * @return String of user agent
   */
  public String getUserAgent() {
    return this.userAgent + " [Xero-Java-" + this.version + "]";
  }

  /**
   * Retrieves a subscription for a given subscriptionId
   *
   * <p><b>200</b> - Success - return response of unique Subscription object
   *
   * <p><b>404</b> - When a failure occurs in the endpoint
   *
   * @param subscriptionId Unique identifier for Subscription object
   * @param accessToken Authorization token for user set in header of each request
   * @return Subscription
   * @throws IOException if an error occurs while attempting to invoke the API *
   */
  public Subscription getSubscription(String accessToken, UUID subscriptionId) throws IOException {
    try {
      TypeReference<Subscription> typeRef = new TypeReference<Subscription>() {};
      HttpResponse response = getSubscriptionForHttpResponse(accessToken, subscriptionId);
      return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    } catch (HttpResponseException e) {
      if (logger.isDebugEnabled()) {
        logger.debug(
            "------------------ HttpResponseException "
                + e.getStatusCode()
                + " : getSubscription -------------------");
        logger.debug(e.toString());
      }
      XeroApiExceptionHandler handler = new XeroApiExceptionHandler();
      handler.execute(e);
    } catch (IOException ioe) {
      throw ioe;
    }
    return null;
  }

  /**
   * Retrieves a subscription for a given subscriptionId
   *
   * <p><b>200</b> - Success - return response of unique Subscription object
   *
   * <p><b>404</b> - When a failure occurs in the endpoint
   *
   * @param subscriptionId Unique identifier for Subscription object
   * @param accessToken Authorization token for user set in header of each request
   * @return HttpResponse
   * @throws IOException if an error occurs while attempting to invoke the API
   */
  public HttpResponse getSubscriptionForHttpResponse(String accessToken, UUID subscriptionId)
      throws IOException {
    // verify the required parameter 'subscriptionId' is set
    if (subscriptionId == null) {
      throw new IllegalArgumentException(
          "Missing the required parameter 'subscriptionId' when calling getSubscription");
    }
    if (accessToken == null) {
      throw new IllegalArgumentException(
          "Missing the required parameter 'accessToken' when calling getSubscription");
    }
    HttpHeaders headers = new HttpHeaders();
    headers.setAccept("application/json");
    headers.setUserAgent(this.getUserAgent());
    // create a map of path variables
    final Map<String, Object> uriVariables = new HashMap<String, Object>();
    uriVariables.put("subscriptionId", subscriptionId);

    UriBuilder uriBuilder =
        UriBuilder.fromUri(apiClient.getBasePath() + "/subscriptions/{subscriptionId}");
    String url = uriBuilder.buildFromMap(uriVariables).toString();
    GenericUrl genericUrl = new GenericUrl(url);
    if (logger.isDebugEnabled()) {
      logger.debug("GET " + genericUrl.toString());
    }

    HttpContent content = null;
    Credential credential =
        new Credential(BearerToken.authorizationHeaderAccessMethod()).setAccessToken(accessToken);
    HttpTransport transport = apiClient.getHttpTransport();
    HttpRequestFactory requestFactory = transport.createRequestFactory(credential);
    return requestFactory
        .buildRequest(HttpMethods.GET, genericUrl, content)
        .setHeaders(headers)
        .setConnectTimeout(apiClient.getConnectionTimeout())
        .setReadTimeout(apiClient.getReadTimeout())
        .execute();
  }

  /**
   * Gets all usage records related to the subscription
   *
   * <p><b>200</b> - Success - return a list of all usage record submitted against this subscription
   * for this subscription period
   *
   * <p><b>404</b> - When a failure occurs in the endpoint
   *
   * @param subscriptionId Unique identifier for Subscription object
   * @param accessToken Authorization token for user set in header of each request
   * @return UsageRecordsList
   * @throws IOException if an error occurs while attempting to invoke the API *
   */
  public UsageRecordsList getUsageRecords(String accessToken, UUID subscriptionId)
      throws IOException {
    try {
      TypeReference<UsageRecordsList> typeRef = new TypeReference<UsageRecordsList>() {};
      HttpResponse response = getUsageRecordsForHttpResponse(accessToken, subscriptionId);
      return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    } catch (HttpResponseException e) {
      if (logger.isDebugEnabled()) {
        logger.debug(
            "------------------ HttpResponseException "
                + e.getStatusCode()
                + " : getUsageRecords -------------------");
        logger.debug(e.toString());
      }
      XeroApiExceptionHandler handler = new XeroApiExceptionHandler();
      handler.execute(e);
    } catch (IOException ioe) {
      throw ioe;
    }
    return null;
  }

  /**
   * Gets all usage records related to the subscription
   *
   * <p><b>200</b> - Success - return a list of all usage record submitted against this subscription
   * for this subscription period
   *
   * <p><b>404</b> - When a failure occurs in the endpoint
   *
   * @param subscriptionId Unique identifier for Subscription object
   * @param accessToken Authorization token for user set in header of each request
   * @return HttpResponse
   * @throws IOException if an error occurs while attempting to invoke the API
   */
  public HttpResponse getUsageRecordsForHttpResponse(String accessToken, UUID subscriptionId)
      throws IOException {
    // verify the required parameter 'subscriptionId' is set
    if (subscriptionId == null) {
      throw new IllegalArgumentException(
          "Missing the required parameter 'subscriptionId' when calling getUsageRecords");
    }
    if (accessToken == null) {
      throw new IllegalArgumentException(
          "Missing the required parameter 'accessToken' when calling getUsageRecords");
    }
    HttpHeaders headers = new HttpHeaders();
    headers.setAccept("application/json");
    headers.setUserAgent(this.getUserAgent());
    // create a map of path variables
    final Map<String, Object> uriVariables = new HashMap<String, Object>();
    uriVariables.put("subscriptionId", subscriptionId);

    UriBuilder uriBuilder =
        UriBuilder.fromUri(
            apiClient.getBasePath() + "/subscriptions/{subscriptionId}/usage-records");
    String url = uriBuilder.buildFromMap(uriVariables).toString();
    GenericUrl genericUrl = new GenericUrl(url);
    if (logger.isDebugEnabled()) {
      logger.debug("GET " + genericUrl.toString());
    }

    HttpContent content = null;
    Credential credential =
        new Credential(BearerToken.authorizationHeaderAccessMethod()).setAccessToken(accessToken);
    HttpTransport transport = apiClient.getHttpTransport();
    HttpRequestFactory requestFactory = transport.createRequestFactory(credential);
    return requestFactory
        .buildRequest(HttpMethods.GET, genericUrl, content)
        .setHeaders(headers)
        .setConnectTimeout(apiClient.getConnectionTimeout())
        .setReadTimeout(apiClient.getReadTimeout())
        .execute();
  }

  /**
   * Send metered usage belonging to this subscription and subscription item
   *
   * <p><b>200</b> - Success - return response of the record submitted
   *
   * <p><b>404</b> - When a failure occurs in the endpoint
   *
   * @param subscriptionId Unique identifier for Subscription object
   * @param subscriptionItemId The unique identifier of the subscriptionItem
   * @param createUsageRecord Contains the quantity for the usage record to create
   * @param idempotencyKey This allows you to safely retry requests without the risk of duplicate
   *     processing. 128 character max.
   * @param accessToken Authorization token for user set in header of each request
   * @return UsageRecord
   * @throws IOException if an error occurs while attempting to invoke the API *
   */
  public UsageRecord postUsageRecords(
      String accessToken,
      UUID subscriptionId,
      UUID subscriptionItemId,
      CreateUsageRecord createUsageRecord,
      String idempotencyKey)
      throws IOException {
    try {
      TypeReference<UsageRecord> typeRef = new TypeReference<UsageRecord>() {};
      HttpResponse response =
          postUsageRecordsForHttpResponse(
              accessToken, subscriptionId, subscriptionItemId, createUsageRecord, idempotencyKey);
      return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    } catch (HttpResponseException e) {
      if (logger.isDebugEnabled()) {
        logger.debug(
            "------------------ HttpResponseException "
                + e.getStatusCode()
                + " : postUsageRecords -------------------");
        logger.debug(e.toString());
      }
      XeroApiExceptionHandler handler = new XeroApiExceptionHandler();
      handler.execute(e);
    } catch (IOException ioe) {
      throw ioe;
    }
    return null;
  }

  /**
   * Send metered usage belonging to this subscription and subscription item
   *
   * <p><b>200</b> - Success - return response of the record submitted
   *
   * <p><b>404</b> - When a failure occurs in the endpoint
   *
   * @param subscriptionId Unique identifier for Subscription object
   * @param subscriptionItemId The unique identifier of the subscriptionItem
   * @param createUsageRecord Contains the quantity for the usage record to create
   * @param idempotencyKey This allows you to safely retry requests without the risk of duplicate
   *     processing. 128 character max.
   * @param accessToken Authorization token for user set in header of each request
   * @return HttpResponse
   * @throws IOException if an error occurs while attempting to invoke the API
   */
  public HttpResponse postUsageRecordsForHttpResponse(
      String accessToken,
      UUID subscriptionId,
      UUID subscriptionItemId,
      CreateUsageRecord createUsageRecord,
      String idempotencyKey)
      throws IOException {
    // verify the required parameter 'subscriptionId' is set
    if (subscriptionId == null) {
      throw new IllegalArgumentException(
          "Missing the required parameter 'subscriptionId' when calling postUsageRecords");
    } // verify the required parameter 'subscriptionItemId' is set
    if (subscriptionItemId == null) {
      throw new IllegalArgumentException(
          "Missing the required parameter 'subscriptionItemId' when calling postUsageRecords");
    } // verify the required parameter 'createUsageRecord' is set
    if (createUsageRecord == null) {
      throw new IllegalArgumentException(
          "Missing the required parameter 'createUsageRecord' when calling postUsageRecords");
    }
    if (accessToken == null) {
      throw new IllegalArgumentException(
          "Missing the required parameter 'accessToken' when calling postUsageRecords");
    }
    HttpHeaders headers = new HttpHeaders();
    headers.set("Idempotency-Key", idempotencyKey);
    headers.setAccept("application/json");
    headers.setUserAgent(this.getUserAgent());
    // create a map of path variables
    final Map<String, Object> uriVariables = new HashMap<String, Object>();
    uriVariables.put("subscriptionId", subscriptionId);
    uriVariables.put("subscriptionItemId", subscriptionItemId);

    UriBuilder uriBuilder =
        UriBuilder.fromUri(
            apiClient.getBasePath()
                + "/subscriptions/{subscriptionId}/items/{subscriptionItemId}/usage-records");
    String url = uriBuilder.buildFromMap(uriVariables).toString();
    GenericUrl genericUrl = new GenericUrl(url);
    if (logger.isDebugEnabled()) {
      logger.debug("POST " + genericUrl.toString());
    }

    HttpContent content = null;
    content = apiClient.new JacksonJsonHttpContent(createUsageRecord);

    Credential credential =
        new Credential(BearerToken.authorizationHeaderAccessMethod()).setAccessToken(accessToken);
    HttpTransport transport = apiClient.getHttpTransport();
    HttpRequestFactory requestFactory = transport.createRequestFactory(credential);
    return requestFactory
        .buildRequest(HttpMethods.POST, genericUrl, content)
        .setHeaders(headers)
        .setConnectTimeout(apiClient.getConnectionTimeout())
        .setReadTimeout(apiClient.getReadTimeout())
        .execute();
  }

  /**
   * Update and existing metered usage belonging to this subscription and subscription item
   *
   * <p><b>200</b> - Success - return response of the modified record
   *
   * <p><b>404</b> - When a failure occurs in the endpoint
   *
   * @param subscriptionId Unique identifier for Subscription object
   * @param subscriptionItemId The unique identifier of the subscriptionItem
   * @param usageRecordId The unique identifier of the usage record
   * @param updateUsageRecord Contains the quantity for the usage record to update
   * @param idempotencyKey This allows you to safely retry requests without the risk of duplicate
   *     processing. 128 character max.
   * @param accessToken Authorization token for user set in header of each request
   * @return UsageRecord
   * @throws IOException if an error occurs while attempting to invoke the API *
   */
  public UsageRecord putUsageRecords(
      String accessToken,
      UUID subscriptionId,
      UUID subscriptionItemId,
      UUID usageRecordId,
      UpdateUsageRecord updateUsageRecord,
      String idempotencyKey)
      throws IOException {
    try {
      TypeReference<UsageRecord> typeRef = new TypeReference<UsageRecord>() {};
      HttpResponse response =
          putUsageRecordsForHttpResponse(
              accessToken,
              subscriptionId,
              subscriptionItemId,
              usageRecordId,
              updateUsageRecord,
              idempotencyKey);
      return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    } catch (HttpResponseException e) {
      if (logger.isDebugEnabled()) {
        logger.debug(
            "------------------ HttpResponseException "
                + e.getStatusCode()
                + " : putUsageRecords -------------------");
        logger.debug(e.toString());
      }
      XeroApiExceptionHandler handler = new XeroApiExceptionHandler();
      handler.execute(e);
    } catch (IOException ioe) {
      throw ioe;
    }
    return null;
  }

  /**
   * Update and existing metered usage belonging to this subscription and subscription item
   *
   * <p><b>200</b> - Success - return response of the modified record
   *
   * <p><b>404</b> - When a failure occurs in the endpoint
   *
   * @param subscriptionId Unique identifier for Subscription object
   * @param subscriptionItemId The unique identifier of the subscriptionItem
   * @param usageRecordId The unique identifier of the usage record
   * @param updateUsageRecord Contains the quantity for the usage record to update
   * @param idempotencyKey This allows you to safely retry requests without the risk of duplicate
   *     processing. 128 character max.
   * @param accessToken Authorization token for user set in header of each request
   * @return HttpResponse
   * @throws IOException if an error occurs while attempting to invoke the API
   */
  public HttpResponse putUsageRecordsForHttpResponse(
      String accessToken,
      UUID subscriptionId,
      UUID subscriptionItemId,
      UUID usageRecordId,
      UpdateUsageRecord updateUsageRecord,
      String idempotencyKey)
      throws IOException {
    // verify the required parameter 'subscriptionId' is set
    if (subscriptionId == null) {
      throw new IllegalArgumentException(
          "Missing the required parameter 'subscriptionId' when calling putUsageRecords");
    } // verify the required parameter 'subscriptionItemId' is set
    if (subscriptionItemId == null) {
      throw new IllegalArgumentException(
          "Missing the required parameter 'subscriptionItemId' when calling putUsageRecords");
    } // verify the required parameter 'usageRecordId' is set
    if (usageRecordId == null) {
      throw new IllegalArgumentException(
          "Missing the required parameter 'usageRecordId' when calling putUsageRecords");
    } // verify the required parameter 'updateUsageRecord' is set
    if (updateUsageRecord == null) {
      throw new IllegalArgumentException(
          "Missing the required parameter 'updateUsageRecord' when calling putUsageRecords");
    }
    if (accessToken == null) {
      throw new IllegalArgumentException(
          "Missing the required parameter 'accessToken' when calling putUsageRecords");
    }
    HttpHeaders headers = new HttpHeaders();
    headers.set("Idempotency-Key", idempotencyKey);
    headers.setAccept("application/json");
    headers.setUserAgent(this.getUserAgent());
    // create a map of path variables
    final Map<String, Object> uriVariables = new HashMap<String, Object>();
    uriVariables.put("subscriptionId", subscriptionId);
    uriVariables.put("subscriptionItemId", subscriptionItemId);
    uriVariables.put("usageRecordId", usageRecordId);

    UriBuilder uriBuilder =
        UriBuilder.fromUri(
            apiClient.getBasePath()
                + "/subscriptions/{subscriptionId}/items/{subscriptionItemId}/usage-records/{usageRecordId}");
    String url = uriBuilder.buildFromMap(uriVariables).toString();
    GenericUrl genericUrl = new GenericUrl(url);
    if (logger.isDebugEnabled()) {
      logger.debug("PUT " + genericUrl.toString());
    }

    HttpContent content = null;
    content = apiClient.new JacksonJsonHttpContent(updateUsageRecord);

    Credential credential =
        new Credential(BearerToken.authorizationHeaderAccessMethod()).setAccessToken(accessToken);
    HttpTransport transport = apiClient.getHttpTransport();
    HttpRequestFactory requestFactory = transport.createRequestFactory(credential);
    return requestFactory
        .buildRequest(HttpMethods.PUT, genericUrl, content)
        .setHeaders(headers)
        .setConnectTimeout(apiClient.getConnectionTimeout())
        .setReadTimeout(apiClient.getReadTimeout())
        .execute();
  }

  /**
   * convert intput to byte array
   *
   * @param is InputStream the server status code returned
   * @return byteArrayInputStream a ByteArrayInputStream
   * @throws IOException for failed or interrupted I/O operations
   */
  public ByteArrayInputStream convertInputToByteArray(InputStream is) throws IOException {
    byte[] bytes = IOUtils.toByteArray(is);
    try {
      // Process the input stream..
      ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
      return byteArrayInputStream;
    } finally {
      is.close();
    }
  }
}
