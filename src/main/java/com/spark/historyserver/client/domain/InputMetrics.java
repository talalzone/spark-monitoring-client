
package com.spark.historyserver.client.domain;


/**
 * Created by Talal Ahmed on 12/10/2017
 */
public class InputMetrics {

    private Long bytesRead;
    private Long recordsRead;

    public Long getBytesRead() {
        return bytesRead;
    }

    public void setBytesRead(Long bytesRead) {
        this.bytesRead = bytesRead;
    }

    public Long getRecordsRead() {
        return recordsRead;
    }

    public void setRecordsRead(Long recordsRead) {
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
