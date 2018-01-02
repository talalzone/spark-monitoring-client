
package org.apache.spark.monitoring.client.domain.tasksummary;


import java.util.List;

/**
 * Created by Talal Ahmed on 12/10/2017
 */
public class InputMetrics {

    private List<Double> bytesRead;
    private List<Double> recordsRead;

    public List<Double> getBytesRead() {
        return bytesRead;
    }

    public void setBytesRead(List<Double> bytesRead) {
        this.bytesRead = bytesRead;
    }

    public List<Double> getRecordsRead() {
        return recordsRead;
    }

    public void setRecordsRead(List<Double> recordsRead) {
        this.recordsRead = recordsRead;
    }

    @Override
    public String toString() {
        return "InputMetrics{" +
                "bytesRead=" + bytesRead +
                ", recordsRead=" + recordsRead +
                '}';
    }
}
