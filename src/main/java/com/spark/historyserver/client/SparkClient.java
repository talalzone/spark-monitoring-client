package com.spark.historyserver.client;

import com.spark.historyserver.client.domain.*;
import com.spark.historyserver.client.util.RestUtils;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * Created by Talal Ahmed on 14/10/2017
 */
public class SparkClient {

    private SparkRestService service;

    private SparkClient(SparkRestService service) {
        this.service = service;
    }

    public Optional<List<Application>> getApplications() {
        return tryGet(service.getApplications());
    }

    public Optional<List<Application>> getApplications(String status) {
        return tryGet(service.getApplications(status));
    }

    public Optional<List<Application>> getApplications(Map<String, Object> params) {
        return tryGet(service.getApplications(params));
    }

    public Optional<List<Job>> getJobs(String appId) {
        return tryGet(service.getJobs(appId));
    }

    public Optional<List<Job>> getJobs(String appId, String status) {
        return tryGet(service.getJobs(appId, status));
    }

    public Optional<JobInfo> getJob(String appId, Integer jobId) {
        return tryGet(service.getJob(appId, jobId));
    }

    public Optional<List<Stage>> getStages(String appId) {
        return tryGet(service.getStages(appId));
    }

    public Optional<List<StageInfo>> getStage(String appId, Integer stageId) {
        return tryGet(service.getStage(appId, stageId));
    }

    public Optional<List<Task>> getStageAttemptTaskList(String appId, Integer stageId, Integer attemptId) {
        return tryGet(service.getStageAttemptTaskList(appId, stageId, attemptId));
    }

    public Optional<TaskSummary> getStageAttemptTaskSummary(String appId, Integer stageId, Integer attemptId) {
        return tryGet(service.getStageAttemptTaskSummary(appId, stageId, attemptId));
    }

    public Optional<TaskSummary> getStageAttemptTaskSummary(String appId, Integer stageId, Integer attemptId, String quantiles) {
        return tryGet(service.getStageAttemptTaskSummary(appId, stageId, attemptId, quantiles));
    }

    public Optional<StageInfo> getStageAttemptDetails(String appId, Integer stageId, Integer attemptId) {
        return tryGet(service.getStageAttemptDetails(appId, stageId, attemptId));
    }

    public Optional<List<Executor>> getActiveExecutors(String appId) {
        return tryGet(service.getActiveExecutors(appId));
    }

    public Optional<List<Executor>> getAllExecutors(String appId) {
        return tryGet(service.getAllExecutors(appId));
    }

    public Optional<List<String>> getApplicationLogs(String appId) {
        Optional<ResponseBody> responseBody = tryGet(service.getApplicationLogs(appId));
        if (!responseBody.isPresent()) return Optional.empty();

        return RestUtils.unZip(responseBody.get());
    }

    public Optional<List<String>> getApplicationLogs(String appId, Integer attempId) {
        Optional<ResponseBody> responseBody = tryGet(service.getApplicationLogs(appId, attempId));
        if (!responseBody.isPresent()) return Optional.empty();

        return RestUtils.unZip(responseBody.get());
    }

    public static SparkClient createWithDefaults() {
        return new SparkClient.WrapperBuilder().buildDefault();
    }

    private <T> Optional<T> tryGet(Call<T> call) {
        T result = null;
        try {
            result = call.execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Optional.ofNullable(result);
    }

    public static final class WrapperBuilder {

        private Retrofit.Builder builder;

        public WrapperBuilder() {
            builder = new Retrofit.Builder();
        }

        public WrapperBuilder baseUrl(String baseUrl) {
            this.builder.baseUrl(baseUrl);
            return this;
        }

        public WrapperBuilder addConverterFactory(Converter.Factory factory) {
            this.builder.addConverterFactory(factory);
            return this;
        }

        public SparkClient buildDefault() {
            SparkRestService sparkRestService = this.baseUrl(SparkRestService.BASE_URL)
                    .addConverterFactory(MoshiConverterFactory.create())
                    .build();

            return new SparkClient(sparkRestService);
        }

        private SparkRestService build() {
            return this.builder.build().create(SparkRestService.class);
        }
    }
}
