
package com.spark.historyserver.client.domain;


/**
 * Created by Talal Ahmed on 12/10/2017
 */
public class ExecutorSummary {

    private Driver driver;

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "ExecutorSummary{" +
                "driver=" + driver +
                '}';
    }
}
