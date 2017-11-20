package com.spark.historyserver.client.test;

import com.spark.historyserver.client.SparkClient;
import com.spark.historyserver.client.SparkRestService;
import com.spark.historyserver.client.domain.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

/**
 * Created by Talal Ahmed on 12/10/2017
 */
public class SparkRestServiceTest {

//    private static final Logger LOG = org.slf4j.LoggerFactory.getLogger(SparkRestServiceTest.class);

    private SparkRestService sparkRestService;
    private SparkClient client;

    @BeforeClass
    public void setUp() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(SparkRestService.BASE_URL)
                .addConverterFactory(MoshiConverterFactory.create())
                .build();

        sparkRestService = retrofit.create(SparkRestService.class);
        client = SparkClient.createWithDefaults();
    }

    @AfterClass
    public void tearDown() {
        sparkRestService = null;
    }

    @Test
    public void testSparkClient() throws IOException {
        Optional<List<Application>> applications = client.getApplications();
        System.out.println(applications.get());
    }

    @Test
    public void testGetAppLogs() throws IOException {
        Optional<List<String>> appLogs = client.getApplicationLogs("local-1507745948104");
        System.out.println(appLogs.get());

        Optional<List<String>> appLogsWithAttemptId = client.getApplicationLogs("local-1507745948104", 0);
        System.out.println(appLogsWithAttemptId.get() );
    }

    @Test
    public void testGetApplications() throws IOException {
        Call<List<Application>> listCall = sparkRestService.getApplications();
        Response<List<Application>> response = listCall.execute();
        System.out.println(response.body());
    }

    @Test
    public void testGetCompletedApplications() throws IOException {
        Call<List<Application>> listCall = sparkRestService.getApplications("completed");
        Response<List<Application>> response = listCall.execute();
        System.out.println(response.body());
    }

    @Test
    public void testGetJobs() throws IOException {
        Call<List<Job>> listCall = sparkRestService.getJobs("local-1507745948104", "succeeded");
        Response<List<Job>> response = listCall.execute();
        System.out.println(response.body());
    }

    @Test
    public void testGetJob() throws IOException {
        Call<JobInfo> listCall = sparkRestService.getJob("local-1507745948104", 0);
        Response<JobInfo> response = listCall.execute();
        System.out.println(response.body());
    }

    @Test
    public void testGetStages() throws IOException {
        Call<List<Stage>> listCall = sparkRestService.getStages("local-1507745948104");
        Response<List<Stage>> response = listCall.execute();
        System.out.println(response.body());
    }

    @Test
    public void testGetStage() throws IOException {
        Call<List<StageInfo>> listCall = sparkRestService.getStage("local-1507745948104", 1);
        Response<List<StageInfo>> response = listCall.execute();
        System.out.println(response.body().get(0));
    }

    @Test
    public void testGetStageAttemptTaskList() throws IOException {
        Call<List<Task>> listCall = sparkRestService.getStageAttemptTaskList("local-1507745948104", 1, 0);
        Response<List<Task>> response = listCall.execute();
        System.out.println(response.body());
    }

    @Test
    public void testGetApplicationActiveExecutors() throws IOException {
        Call<List<Executor>> listCall = sparkRestService.getActiveExecutors("local-1507745948104");
        Response<List<Executor>> response = listCall.execute();
        System.out.println(response.body());
    }

    @Test
    public void testGetApplicationEnviroment() {
        Optional<Environment> applicationEnvironment = client.getApplicationEnvironment("local-1511137904520");
        System.out.println(applicationEnvironment.get());
    }

}

