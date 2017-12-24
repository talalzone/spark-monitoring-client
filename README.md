# Spark History Server Client

A Restful Java client written with retrofit for Spark Monitoring API.

## Getting Started
**Supported Spark Version: 2.2.0**

### Usage

Using Spark Client with default base URL i.e, http://127.0.0.1:18080/api/v1/:

```
// Create client
SparkClient client = SparkClient.createDefaultClient();

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

Using Spark Client Builder:

```
SparkClient client = new SparkClient.Builder()
        .setBaseUrl("http://127.0.0.1:18080/api/v1/") // History Server Url
        .addConverterFactory(MoshiConverterFactory.create()) // Or other providers
        .get();
```

Using SparkRestService:
```
// Create client //
...

SparkClient client = SparkClient.createDefaultClient();

...

// Get SparkRestService via client
SparkRestService restService = client.getRestService();

// Make API calls
Call<List<Application>> getAppsCall = this.restService.getApplications();
Response<List<Application>> getAppsResponse = getAppsCall.execute();
List<Application> applicationList = getAppsResponse.body(); 
```

For further details see SparkClientTest and SparkRestServiceTest

### Installing

```
git clone https://github.com/rubrician/spark-history-client.git
cd spark-history-client
mvn clean install
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
