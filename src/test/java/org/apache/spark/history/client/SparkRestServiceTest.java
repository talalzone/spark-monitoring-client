package org.apache.spark.history.client;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import org.apache.spark.history.client.domain.*;
import org.apache.spark.history.client.sample.SparkPi;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by Talal Ahmed on 12/10/2017
 */
public class SparkRestServiceTest {

    private static final Logger LOG = Logger.getLogger(SparkRestServiceTest.class.getName());

    private SparkRestService restService;
    private String appId;

    @BeforeClass
    public void setUp() throws InterruptedException {
        SparkClient client = SparkClient.createDefaultClient();
        this.restService = client.getRestService();

        // Path to spark logs
        Config conf = ConfigFactory.load();
        String logsPath = conf.getString("spark-history-logs");

        // run test app
        SparkPi sparkPi = new SparkPi();
        sparkPi.setup(logsPath);
        sparkPi.run();

        // set test app id for queries
        this.appId = sparkPi.getAppId();
        LOG.info("AppId: " + appId);

        Thread.sleep(10000);
    }

    @AfterClass
    public void tearDown() {
        restService = null;
    }

    @Test(priority = 1)
    public void testGetApplications() throws IOException {
        Call<List<Application>> getAppCall = this.restService.getApplications();
        Response<List<Application>> getAppResponse = getAppCall.execute();

        Assert.assertTrue(getAppResponse.isSuccessful());
        Assert.assertNotNull(getAppResponse.body());
        Assert.assertTrue(getAppResponse.body().size() > 0);
    }

    @Test(priority = 2)
    public void testGetCompletedApplications() throws IOException {
        Call<List<Application>> getAppsCall = this.restService.getApplications(SparkRestService.APPLICATION_STATUS_COMPLETED);
        Response<List<Application>> getAppsResponse = getAppsCall.execute();

        Assert.assertTrue(getAppsResponse.isSuccessful());
        Assert.assertNotNull(getAppsResponse.body());
        Assert.assertTrue(getAppsResponse.body().size() > 0);
    }

    @Test(priority = 3)
    public void testGetApplication() throws IOException {
        Call<Application> getAppCall = this.restService.getApplication(this.appId);
        Response<Application> getAppResponse = getAppCall.execute();

        Assert.assertTrue(getAppResponse.isSuccessful());
        Assert.assertNotNull(getAppResponse.body());
    }

    @Test(priority = 4)
    public void testGetJobs() throws IOException {
        Call<List<Job>> getJobsCall = this.restService.getJobs(this.appId);
        Response<List<Job>> getJobsResponse = getJobsCall.execute();

        Assert.assertTrue(getJobsResponse.isSuccessful());
        Assert.assertNotNull(getJobsResponse.body());
        Assert.assertTrue(getJobsResponse.body().size() > 0);
    }

    @Test(priority = 5)
    public void testGetJob() throws IOException {
        Call<List<Job>> getJobsCall = this.restService.getJobs(this.appId);
        Response<List<Job>> getJobsResponse = getJobsCall.execute();

        Integer jobId = getJobsResponse.body().get(0).getJobId(); // get first
        Call<JobInfo> getJobCall = this.restService.getJob(this.appId, jobId);
        Response<JobInfo> getJobResponse = getJobCall.execute();

        Assert.assertTrue(getJobResponse.isSuccessful());
        Assert.assertNotNull(getJobResponse.body());
    }

    @Test(priority = 6)
    public void testGetStages() throws IOException {
        Call<List<Stage>> getStagesCall = this.restService.getStages(this.appId);
        Response<List<Stage>> getStagesResponse = getStagesCall.execute();

        Assert.assertTrue(getStagesResponse.isSuccessful());
        Assert.assertNotNull(getStagesResponse.body());
        Assert.assertTrue(getStagesResponse.body().size() > 0);
    }

    @Test(priority = 7)
    public void testGetStage() throws IOException {
        Call<List<Stage>> getStagesCall = this.restService.getStages(this.appId);
        Response<List<Stage>> getStagesResponse = getStagesCall.execute();

        Integer testStageId = getStagesResponse.body().get(0).getStageId();
        Call<List<StageInfo>> getStageCall = this.restService.getStage(this.appId, testStageId);
        Response<List<StageInfo>> getStageResponse = getStageCall.execute();

        Assert.assertTrue(getStageResponse.isSuccessful());
        Assert.assertNotNull(getStageResponse.body());
        Assert.assertTrue(getStageResponse.body().size() > 0);
    }

    @Test(priority = 8)
    public void testGetStageAttemptTaskList() throws IOException {
        Call<List<Stage>> getStagesCall = this.restService.getStages(this.appId);
        Response<List<Stage>> getStagesResponse = getStagesCall.execute();

        Integer testStageId = getStagesResponse.body().get(0).getStageId();
        Integer testAttemptId = getStagesResponse.body().get(0).getAttemptId();

        Call<List<Task>> getTaskListCall = this.restService.getStageAttemptTaskList(this.appId, testStageId, testAttemptId);
        Response<List<Task>> getTaskListResponse = getTaskListCall.execute();

        Assert.assertTrue(getTaskListResponse.isSuccessful());
        Assert.assertNotNull(getTaskListResponse.body());
        Assert.assertTrue(getTaskListResponse.body().size() > 0);
    }

    @Test(priority = 9)
    public void testGetActiveExecutors() throws IOException {
        Call<List<Executor>> getActiveExecutorsCall = this.restService.getActiveExecutors(this.appId);
        Response<List<Executor>> getActiveExecutorsResponse = getActiveExecutorsCall.execute();

        Assert.assertTrue(getActiveExecutorsResponse.isSuccessful());
        Assert.assertNotNull(getActiveExecutorsResponse.body());
        Assert.assertTrue(getActiveExecutorsResponse.body().size() > 0);
    }

    @Test(priority = 10)
    public void testGetApplicationEnvironment() throws IOException {
        Call<Environment> getAppEnvironmentCall = this.restService.getApplicationEnvironment(this.appId);
        Response<Environment> getAppEnvironmentResponse = getAppEnvironmentCall.execute();

        Assert.assertTrue(getAppEnvironmentResponse.isSuccessful());
        Assert.assertNotNull(getAppEnvironmentResponse.body());
    }

}

