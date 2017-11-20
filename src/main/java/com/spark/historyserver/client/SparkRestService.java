package com.spark.historyserver.client;

import com.spark.historyserver.client.domain.*;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

import java.util.List;
import java.util.Map;

/**
 * Created by Talal Ahmed on 12/10/2017
 */
public interface SparkRestService {

    String BASE_URL = "http://127.0.0.1:18080/api/v1/";

    /**
     * A list of all applications
     *
     * @return
     */
    @GET("applications")
    Call<List<Application>> getApplications();

    /**
     * A list of all applications
     * <p>
     * ?status=[completed|running] list only applications in the chosen state.
     *
     * @return
     */
    @GET("applications")
    Call<List<Application>> getApplications(@Query("status") String status);

    /**
     * <A list of all applications.
     *<p>
     * ?status=[completed|running] list only applications in the chosen state.
     * ?minDate=[date] earliest start date/time to list.
     * ?maxDate=[date] latest start date/time to list.
     * ?minEndDate=[date] earliest end date/time to list.
     * ?maxEndDate=[date] latest end date/time to list.
     * ?limit=[limit] limits the number of applications listed.
     * Examples:
     * ?minDate=2015-02-10
     * ?minDate=2015-02-03T16:42:40.000GMT
     * ?maxDate=2015-02-11T20:41:30.000GMT
     * ?minEndDate=2015-02-12
     * ?minEndDate=2015-02-12T09:15:10.000GMT
     * ?maxEndDate=2015-02-14T16:30:45.000GMT
     * ?limit=10</p>
     *
     * @return
     */
    @GET("applications")
    Call<List<Application>> getApplications(@QueryMap Map<String, Object> params);

    /**
     * Get the given application
     * @param appId
     * @return
     */
    @GET("applications/{app-id}")
    Call<Application> getApplication(@Path("app-id") String appId);

    /**
     * A list of all jobs for a given application.
     *
     * @param appId
     * @return
     */
    @GET("applications/{app-id}/jobs")
    Call<List<Job>> getJobs(@Path("app-id") String appId);

    /**
     * A list of all jobs for a given application.
     * ?status=[running|succeeded|failed|unknown] list only jobs in the specific state.
     *
     * @param appId
     * @return
     */
    @GET("applications/{app-id}/jobs")
    Call<List<Job>> getJobs(@Path("app-id") String appId,
                            @Query("status") String status);

    /**
     * Details for the given job.
     *
     * @param appId
     * @param jobId
     * @return
     */
    @GET("applications/{app-id}/jobs/{job-id}")
    Call<JobInfo> getJob(@Path("app-id") String appId,
                         @Path("job-id") Integer jobId);

    /**
     * A list of all stages for a given application.
     *
     * @param appId
     * @return
     */
    @GET("applicatons/{app-id}/stages")
    Call<List<Stage>> getStages(@Path("app-id") String appId);

    /**
     * A list of all attempts for the given stage.
     *
     * @param appId
     * @param stageId
     * @return
     */
    @GET("applications/{app-id}/stages/{stage-id}")
    Call<List<StageInfo>> getStage(@Path("app-id") String appId,
                                   @Path("stage-id") Integer stageId);

    /**
     * Details for the given stage attempt.
     *
     * @param appId
     * @param stageId
     * @param attemptId
     * @return
     */
    @GET("applications/{app-id}/stages/{stage-id}/{stage-attempt-id}")
    Call<StageInfo> getStageAttemptDetails(@Path("app-id") String appId,
                                                 @Path("stage-id") Integer stageId,
                                                 @Path("stage-attempt-id") Integer attemptId);

    /**
     * Summary metrics of all tasks in the given stage attempt.
     * Example: ?quantiles=0.01,0.5,0.99
     *
     * @param appId
     * @param stageId
     * @param attemptId
     * @return
     */
    @GET("applications/{app-id}/stages/{stage-id}/{stage-attempt-id}/taskSummary")
    Call<TaskSummary> getStageAttemptTaskSummary(@Path("app-id") String appId,
                                                 @Path("stage-id") Integer stageId,
                                                 @Path("stage-attempt-id") Integer attemptId);

    /**
     * Summary metrics of all tasks in the given stage attempt.
     * ?quantiles summarize the metrics with the given quantiles.
     * Example: ?quantiles=0.01,0.5,0.99
     *
     * @param appId
     * @param stageId
     * @param attemptId
     * @return
     */
    @GET("applications/{app-id}/stages/{stage-id}/{stage-attempt-id}/taskSummary")
    Call<TaskSummary> getStageAttemptTaskSummary(@Path("app-id") String appId,
                                                 @Path("stage-id") Integer stageId,
                                                 @Path("stage-attempt-id") Integer attemptId,
                                                 @Query("quantiles") String quantiles);

    /**
     * A list of all tasks for the given stage attempt.
     * ?offset=[offset]&length=[len] list tasks in the given range.
     * ?sortBy=[runtime|-runtime] sort the tasks.
     * Example: ?offset=10&length=50&sortBy=runtime
     *
     * @param appId
     * @param stageId
     * @param attemptId
     * @return
     */
    @GET("applications/{app-id}/stages/{stage-id}/{stage-attempt-id}/taskList")
    Call<List<Task>> getStageAttemptTaskList(@Path("app-id") String appId,
                                             @Path("stage-id") Integer stageId,
                                             @Path("stage-attempt-id") Integer attemptId);

    /**
     * A list of all active executors for the given application.
     *
     * @param appId
     * @return
     */
    @GET("applications/{app-id}/executors")
    Call<List<Executor>> getActiveExecutors(@Path("app-id") String appId);

    /**
     * A list of all(active and dead) executors for the given application.
     *
     * @param appId
     * @return
     */
    @GET("applications/{app-id}/allexecutors")
    Call<List<Executor>> getAllExecutors(@Path("app-id") String appId);


    /**
     * A list of stored RDDs for the given application.
     *
     * @param appId
     * @return
     */
    @GET("applications/{app-id}/storage/rdd")
    Call<List<RDD>> getStorageRDDs(@Path("app-id") String appId);

    /**
     * Details for the storage status of a given RDD.
     *
     * @param appId
     * @return
     */
    @GET("applications/{app-id}/storage/rdd/{rdd-id}")
    Call<RDD> getStorageRDD(@Path("app-id") String appId,
                            @Path("rdd-id") Integer rddId);

    /**
     * Environment details of the given application.
     *
     * @param appId
     * @return
     */
    @GET("applications/{app-id}/environment")
    Call<Environment> getApplicationEnvironment(@Path("app-id") String appId);


    /**
     * Download the event logs for all attempts of the given application as files within a zip file.
     *
     * @param appId
     * @return
     */
    @GET("applications/{base-app-id}/logs")
    Call<ResponseBody> getApplicationLogs(@Path("base-app-id") String appId);


    /**
     * Download the event logs for a specific application attempt as a zip file.
     *
     * @param appId
     * @param attemptId
     * @return
     */
    @GET("applications/{base-app-id}/{attempt-id}/logs")
    Call<ResponseBody> getApplicationLogs(@Path("base-app-id") String appId,
                                          @Path("attempt-id") Integer attemptId);


    ///applications/[app-id]/streaming/statistics

    ///applications/[app-id]/streaming/receivers

    ///applications/[app-id]/streaming/receivers/[stream-id]

    ///applications/[app-id]/streaming/batches

    ///applications/[app-id]/streaming/batches/[batch-id]

    ///applications/[app-id]/streaming/batches/[batch-id]/operations

    ///applications/[app-id]/streaming/batches/[batch-id]/operations/[outputOp-id]
}

