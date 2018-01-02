
package org.apache.spark.monitoring.client.domain.taskmetrics;

/**
 * Created by Talal Ahmed on 12/10/2017
 */
public class ShuffleWriteMetrics {

    private Long bytesWritten;
    private Long writeTime;
    private Long recordsWritten;

    public Long getBytesWritten() {
        return bytesWritten;
    }

    public void setBytesWritten(Long bytesWritten) {
        this.bytesWritten = bytesWritten;
    }

    public Long getWriteTime() {
        return writeTime;
    }

    public void setWriteTime(Long writeTime) {
        this.writeTime = writeTime;
    }

    public Long getRecordsWritten() {
        return recordsWritten;
    }

    public void setRecordsWritten(Long recordsWritten) {
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
