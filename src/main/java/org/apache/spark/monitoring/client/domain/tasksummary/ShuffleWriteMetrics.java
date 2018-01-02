
package org.apache.spark.monitoring.client.domain.tasksummary;

import java.util.List;

/**
 * Created by Talal Ahmed on 12/10/2017
 */
public class ShuffleWriteMetrics {

    private List<Double> bytesWritten;
    private List<Double> writeTime;
    private List<Double> recordsWritten;

    public List<Double> getBytesWritten() {
        return bytesWritten;
    }

    public void setBytesWritten(List<Double> bytesWritten) {
        this.bytesWritten = bytesWritten;
    }

    public List<Double> getWriteTime() {
        return writeTime;
    }

    public void setWriteTime(List<Double> writeTime) {
        this.writeTime = writeTime;
    }

    public List<Double> getRecordsWritten() {
        return recordsWritten;
    }

    public void setRecordsWritten(List<Double> recordsWritten) {
        this.recordsWritten = recordsWritten;
    }

    @Override
    public String toString() {
        return "ShuffleWriteMetrics{" +
                "bytesWritten=" + bytesWritten +
                ", writeTime=" + writeTime +
                ", recordsWritten=" + recordsWritten +
                '}';
    }
}
