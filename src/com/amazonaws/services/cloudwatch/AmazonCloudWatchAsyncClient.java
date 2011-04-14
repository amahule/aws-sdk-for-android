/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cloudwatch;
            
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;

import com.amazonaws.services.cloudwatch.model.*;


/**
 * Client for accessing AmazonCloudWatch.  All calls made
 * using this client are non-blocking and will immediately return a Java Future.
 * Callers must use the Future object to determine when the service call has actually
 * completed.
 *  
 */       
public class AmazonCloudWatchAsyncClient extends AmazonCloudWatchClient
        implements AmazonCloudWatchAsync { 

    /**
     * Executor service for executing asynchronous requests.
     */
    private ExecutorService executorService;

    
    /**
     * Constructs a new asynchronous client to invoke service methods on 
     * AmazonCloudWatch using the specified AWS account credentials.
     * Default client settings will be used, and a default cached thread pool will be 
     * created for executing the asynchronous tasks.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     * 
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     */                                      
    public AmazonCloudWatchAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCloudWatch using the specified AWS account credentials
     * and executor service.  Default client settings will be used.
     * 
     * <p> 
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     * 
     * @param awsCredentials 
     *            The AWS credentials (access key ID and secret key) to use
     *            when authenticating with AWS services.
     * @param executorService
     *            The executor service by which all asynchronous requests will
     *            be executed.
     */
    public AmazonCloudWatchAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {
        super(awsCredentials);
        this.executorService = executorService;
    }
     
    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCloudWatch using the specified AWS account credentials,
     * executor service, and client configuration options.
     * 
     * <p> 
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     * 
     * @param awsCredentials 
     *            The AWS credentials (access key ID and secret key) to use
     *            when authenticating with AWS services.
     * @param clientConfiguration
     *            Client configuration options (ex: max retry limit, proxy
     *            settings, etc).
     * @param executorService
     *            The executor service by which all asynchronous requests will
     *            be executed.
     */
    public AmazonCloudWatchAsyncClient(AWSCredentials awsCredentials,
                ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }
     
    /**
     * Returns the executor service used by this async client to execute
     * requests.
     *   
     * @return The executor service used by this async client to execute
     *         requests.
     */
    public ExecutorService getExecutorService() {
        return executorService;
    }
            
    /**
     *
     * @param putMetricAlarmRequest Container for the necessary parameters to
     *           execute the PutMetricAlarm operation on AmazonCloudWatch.
     * 
     * @return A Java Future object containing the response from the
     *         PutMetricAlarm service method, as returned by AmazonCloudWatch.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudWatch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> putMetricAlarmAsync(final PutMetricAlarmRequest putMetricAlarmRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                putMetricAlarm(putMetricAlarmRequest);
                return null;
		    }
		});
    }
    
    /**
     *
     * @param listMetricsRequest Container for the necessary parameters to
     *           execute the ListMetrics operation on AmazonCloudWatch.
     * 
     * @return A Java Future object containing the response from the
     *         ListMetrics service method, as returned by AmazonCloudWatch.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudWatch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListMetricsResult> listMetricsAsync(final ListMetricsRequest listMetricsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListMetricsResult>() {
            public ListMetricsResult call() throws Exception {
                return listMetrics(listMetricsRequest);
		    }
		});
    }
    
    /**
     *
     * @param getMetricStatisticsRequest Container for the necessary
     *           parameters to execute the GetMetricStatistics operation on
     *           AmazonCloudWatch.
     * 
     * @return A Java Future object containing the response from the
     *         GetMetricStatistics service method, as returned by AmazonCloudWatch.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudWatch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetMetricStatisticsResult> getMetricStatisticsAsync(final GetMetricStatisticsRequest getMetricStatisticsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetMetricStatisticsResult>() {
            public GetMetricStatisticsResult call() throws Exception {
                return getMetricStatistics(getMetricStatisticsRequest);
		    }
		});
    }
    
    /**
     *
     * @param disableAlarmActionsRequest Container for the necessary
     *           parameters to execute the DisableAlarmActions operation on
     *           AmazonCloudWatch.
     * 
     * @return A Java Future object containing the response from the
     *         DisableAlarmActions service method, as returned by AmazonCloudWatch.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudWatch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> disableAlarmActionsAsync(final DisableAlarmActionsRequest disableAlarmActionsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                disableAlarmActions(disableAlarmActionsRequest);
                return null;
		    }
		});
    }
    
    /**
     *
     * @param describeAlarmsRequest Container for the necessary parameters to
     *           execute the DescribeAlarms operation on AmazonCloudWatch.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeAlarms service method, as returned by AmazonCloudWatch.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudWatch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeAlarmsResult> describeAlarmsAsync(final DescribeAlarmsRequest describeAlarmsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeAlarmsResult>() {
            public DescribeAlarmsResult call() throws Exception {
                return describeAlarms(describeAlarmsRequest);
		    }
		});
    }
    
    /**
     *
     * @param describeAlarmsForMetricRequest Container for the necessary
     *           parameters to execute the DescribeAlarmsForMetric operation on
     *           AmazonCloudWatch.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeAlarmsForMetric service method, as returned by
     *         AmazonCloudWatch.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudWatch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeAlarmsForMetricResult> describeAlarmsForMetricAsync(final DescribeAlarmsForMetricRequest describeAlarmsForMetricRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeAlarmsForMetricResult>() {
            public DescribeAlarmsForMetricResult call() throws Exception {
                return describeAlarmsForMetric(describeAlarmsForMetricRequest);
		    }
		});
    }
    
    /**
     *
     * @param describeAlarmHistoryRequest Container for the necessary
     *           parameters to execute the DescribeAlarmHistory operation on
     *           AmazonCloudWatch.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeAlarmHistory service method, as returned by AmazonCloudWatch.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudWatch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeAlarmHistoryResult> describeAlarmHistoryAsync(final DescribeAlarmHistoryRequest describeAlarmHistoryRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeAlarmHistoryResult>() {
            public DescribeAlarmHistoryResult call() throws Exception {
                return describeAlarmHistory(describeAlarmHistoryRequest);
		    }
		});
    }
    
    /**
     *
     * @param enableAlarmActionsRequest Container for the necessary
     *           parameters to execute the EnableAlarmActions operation on
     *           AmazonCloudWatch.
     * 
     * @return A Java Future object containing the response from the
     *         EnableAlarmActions service method, as returned by AmazonCloudWatch.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudWatch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> enableAlarmActionsAsync(final EnableAlarmActionsRequest enableAlarmActionsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                enableAlarmActions(enableAlarmActionsRequest);
                return null;
		    }
		});
    }
    
    /**
     *
     * @param deleteAlarmsRequest Container for the necessary parameters to
     *           execute the DeleteAlarms operation on AmazonCloudWatch.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteAlarms service method, as returned by AmazonCloudWatch.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudWatch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteAlarmsAsync(final DeleteAlarmsRequest deleteAlarmsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteAlarms(deleteAlarmsRequest);
                return null;
		    }
		});
    }
    
    /**
     *
     * @param setAlarmStateRequest Container for the necessary parameters to
     *           execute the SetAlarmState operation on AmazonCloudWatch.
     * 
     * @return A Java Future object containing the response from the
     *         SetAlarmState service method, as returned by AmazonCloudWatch.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudWatch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> setAlarmStateAsync(final SetAlarmStateRequest setAlarmStateRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                setAlarmState(setAlarmStateRequest);
                return null;
		    }
		});
    }
    
}
        