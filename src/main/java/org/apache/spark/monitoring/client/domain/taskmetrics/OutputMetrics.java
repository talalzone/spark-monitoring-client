
package org.apache.spark.monitoring.client.domain.taskmetrics;


/**
 * Created by Talal Ahmed on 12/10/2017
 */
public class OutputMetrics {

    private Long bytesWritten;
    private Long recordsWritten;

    public Long getBytesWritten() {
        return bytesWritten;
    }

    public void setBytesWritten(Long bytesWritten) {
        this.bytesWritten = bytesWritten;
    }

    public Long getRecordsWritten() {
        return recordsWritten;
    }

    public void setRecordsWritten(Long recordsWritten) {
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
