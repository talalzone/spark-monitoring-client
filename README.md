# Spark Monitoring API Client

Java Client for [Spark Monitoring API](https://spark.apache.org/docs/latest/monitoring.html) written with [Retrofit](http://square.github.io/retrofit/).

## Getting Started
Tested with Spark V2.2.0

### Usage

Spark Client with default history server i.e, http://127.0.0.1:18080/api/v1/:
```
// Create client
SparkClient client = SparkClient.createHistoryClient();

// Get all completed applications
Optional<List<Application>> applications = client.getApplications(SparkRestService.APPLICATION_STATUS_COMPLETED);
List<Application> applicationList = applications.get()

// Get application Id at first index
String appId = applicationList.get(0).getId()     
        
// Get Jobs against application   
Optional<List<Job>> jobs = this.client.getJobs(appId);

// Get Stages against application
Optional<List<Stage>> stages = this.client.getStages(appId);
   
```

Creating SparkClient using Builder:
```
SparkClient client = new SparkClient.Builder()
        .setBaseUrl("http://127.0.0.1:18080/api/v1/") // History Server Url
        .addConverterFactory(MoshiConverterFactory.create()) // For other converters see Retrofit
        .get();
```

Using SparkRestService:
```
// Create client //
...

SparkClient client = SparkClient.createHistoryClient();

...

// Get SparkRestService via client
SparkRestService restService = client.getRestService();


// Make API calls
Call<List<Application>> getAppsCall = restService.getApplications();
Response<List<Application>> getAppsResponse = getAppsCall.execute();
List<Application> applicationList = getAppsResponse.body(); 
```

For further details see SparkClientTest and SparkRestServiceTest

### Install

**Repository**
```
git clone https://github.com/talal830/spark-monitoring-client.git
cd spark-monitoring-client
mvn clean install
```
**Dependency**
```
<dependency>
    <groupId>org.apache.spark</groupId>
    <artifactId>spark-monitoring-client</artifactId>
    <version>2.2.0</version>
</dependency>
```

## Built With

* [Retrofit](http://square.github.io/retrofit/) - A type-safe HTTP client for Android and Java 

## TODO
Add streaming calls:
* /applications/[app-id]/streaming/statistics
* /applications/[app-id]/streaming/receivers
* /applications/[app-id]/streaming/receivers/[stream-id]
* /applications/[app-id]/streaming/batches
* /applications/[app-id]/streaming/batches/[batch-id]
* /applications/[app-id]/streaming/batches/[batch-id]
* /applications/[app-id]/streaming/batches/[batch-id]/operations/[outputOp-id]

## License

This project is licensed under the MIT License
