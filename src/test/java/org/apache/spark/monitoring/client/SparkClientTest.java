package org.apache.spark.monitoring.client;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import org.apache.spark.monitoring.client.domain.*;
import org.apache.spark.monitoring.client.sample.SparkPi;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

/**
 * Created by Talal Ahmed on 24/12/2017
 */
public class SparkClientTest {

    private static final Logger LOG = Logger.getLogger(SparkClientTest.class.getName());

    private SparkClient client;
    private String appId;

    @BeforeClass
    public void setUp() throws InterruptedException {
        // client with default base url
        this.client = SparkClient.createHistoryClient();

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
        client = null;
    }

    @Test(priority = 1)
    public void testGetApplications() {
        Optional<List<Application>> applications = this.client.getApplications();

        Assert.assertTrue(applications.isPresent());
        Assert.assertTrue(applications.get().size() > 0);
    }

    @Test(priority = 2)
    public void testGetCompletedApplications() throws IOException {
        Optional<List<Application>> applications = this.client.getApplications(SparkRestService.APPLICATION_STATUS_COMPLETED);

        Assert.assertTrue(applications.isPresent());
        Assert.assertTrue(applications.get().size() > 0);
    }

    @Test(priority = 3)
    public void testGetApplication() {
        Optional<Application> application = this.client.getApplication(this.appId);

        Assert.assertTrue(application.isPresent());
        Assert.assertEquals(application.get().getId(), this.appId);
    }


    @Test(priority = 4)
    public void testGetJobs() {
        Optional<List<Job>> jobs = this.client.getJobs(this.appId);

        Assert.assertTrue(jobs.isPresent());
        Assert.assertTrue(jobs.get().size() > 0);
    }

    @Test(priority = 5)
    public void testGetJob() {
        List<Job> jobs = this.client.getJobs(this.appId).get();

        Integer testJobId = jobs.get(0).getJobId();
        Optional<Job> job = this.client.getJob(this.appId, testJobId);

        Assert.assertTrue(job.isPresent());
    }

    @Test(priority = 6)
    public void testGetStages() {
        Optional<List<Stage>> stages = this.client.getStages(this.appId);

        Assert.assertTrue(stages.isPresent());
        Assert.assertTrue(stages.get().size() > 0);
    }

    @Test(priority = 7)
    public void testGetStage() {
        List<Stage> stages = this.client.getStages(this.appId).get();

        Integer testStageId = stages.get(0).getStageId();// get first
        Optional<List<StageInfo>> stage = this.client.getStage(this.appId, testStageId);

        Assert.assertTrue(stage.isPresent());
        Assert.assertTrue(stage.get().size() > 0);
    }

    @Test(priority = 8)
    public void tesGetStageAttemptTaskSummary() {
        List<Stage> stages = this.client.getStages(this.appId).get();

        Integer testStageId = stages.get(0).getStageId();// get first
        StageInfo testStage = this.client.getStage(this.appId, testStageId).get().get(0);

        Optional<TaskSummary> stageAttemptTaskSummary = this.client.getStageAttemptTaskSummary(this.appId, testStage.getStageId(), testStage.getAttemptId());
        Assert.assertTrue(stageAttemptTaskSummary.isPresent());
    }

    @Test(priority = 9)
    public void testGetStageAttemptTaskList() {
        List<Stage> stages = this.client.getStages(this.appId).get();

        Integer testStageId = stages.get(0).getStageId();// get first
        StageInfo testStage = this.client.getStage(this.appId, testStageId).get().get(0);

        Optional<List<Task>> stageAttemptTaskList = this.client.getStageAttemptTaskList(this.appId, testStage.getStageId(), testStage.getAttemptId());
        Assert.assertTrue(stageAttemptTaskList.isPresent());
        Assert.assertTrue(stageAttemptTaskList.get().size() > 0);
    }

    @Test(priority = 10)
    public void testGetActiveExecutors() throws IOException {
        Optional<List<Executor>> activeExecutors = this.client.getActiveExecutors(this.appId);

        Assert.assertTrue(activeExecutors.isPresent());
        Assert.assertTrue(activeExecutors.get().size() > 0);
    }


    @Test(priority = 11)
    public void testGetAllExecutors() throws IOException {
        Optional<List<Executor>> activeExecutors = this.client.getAllExecutors(this.appId);

        Assert.assertTrue(activeExecutors.isPresent());
        Assert.assertTrue(activeExecutors.get().size() > 0);
    }

    @Test(priority = 12)
    public void testGetApplicationEnvironment() {
        Optional<Environment> appEnvironment = this.client.getApplicationEnvironment(this.appId);

        Assert.assertTrue(appEnvironment.isPresent());
    }

    @Test(priority = 13)
    public void testGetApplicationLogs() {
        Optional<List<String>> applicationLogs = this.client.getApplicationLogs(this.appId);

        Assert.assertTrue(applicationLogs.isPresent());
        Assert.assertTrue(applicationLogs.get().size() > 0);
    }
}
