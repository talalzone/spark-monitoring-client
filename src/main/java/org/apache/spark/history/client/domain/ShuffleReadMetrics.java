
package org.apache.spark.history.client.domain;

/**
 * Created by Talal Ahmed on 12/10/2017
 */
public class ShuffleReadMetrics {

    private Long remoteBlocksFetched;
    private Long localBlocksFetched;
    private Long fetchWaitTime;
    private Long remoteBytesRead;
    private Long localBytesRead;
    private Long recordsRead;

    public Long getRemoteBlocksFetched() {
        return remoteBlocksFetched;
    }

    public void setRemoteBlocksFetched(Long remoteBlocksFetched) {
        this.remoteBlocksFetched = remoteBlocksFetched;
    }

    public Long getLocalBlocksFetched() {
        return localBlocksFetched;
    }

    public void setLocalBlocksFetched(Long localBlocksFetched) {
        this.localBlocksFetched = localBlocksFetched;
    }

    public Long getFetchWaitTime() {
        return fetchWaitTime;
    }

    public void setFetchWaitTime(Long fetchWaitTime) {
        this.fetchWaitTime = fetchWaitTime;
    }

    public Long getRemoteBytesRead() {
        return remoteBytesRead;
    }

    public void setRemoteBytesRead(Long remoteBytesRead) {
        this.remoteBytesRead = remoteBytesRead;
    }

    public Long getLocalBytesRead() {
        return localBytesRead;
    }

    public void setLocalBytesRead(Long localBytesRead) {
        this.localBytesRead = localBytesRead;
    }

    public Long getRecordsRead() {
        return recordsRead;
    }

    public void setRecordsRead(Long recordsRead) {
        this.recordsRead = recordsRead;
    }

    @Override
    public String toString() {
        return "ShuffleReadMetrics{" +
                "remoteBlocksFetched=" + remoteBlocksFetched +
                ", localBlocksFetched=" + localBlocksFetched +
                ", fetchWaitTime=" + fetchWaitTime +
                ", remoteBytesRead=" + remoteBytesRead +
                ", localBytesRead=" + localBytesRead +
                ", recordsRead=" + recordsRead +
                '}';
    }
}
