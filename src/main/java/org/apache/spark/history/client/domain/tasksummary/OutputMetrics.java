
package org.apache.spark.history.client.domain.tasksummary;


import java.util.List;

/**
 * Created by Talal Ahmed on 12/10/2017
 */
public class OutputMetrics {

    private List<Double> bytesWritten;
    private List<Double> recordsWritten;

    public List<Double> getBytesWritten() {
        return bytesWritten;
    }

    public void setBytesWritten(List<Double> bytesWritten) {
        this.bytesWritten = bytesWritten;
    }

    public List<Double> getRecordsWritten() {
        return recordsWritten;
    }

    public void setRecordsWritten(List<Double> recordsWritten) {
        this.recordsWritten = recordsWritten;
    }

    @Override
    public String toString() {
        return "OutputMetrics{" +
                "bytesWritten=" + bytesWritten +
                ", recordsWritten=" + recordsWritten +
                '}';
    }
}
