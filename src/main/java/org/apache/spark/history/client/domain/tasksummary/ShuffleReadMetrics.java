
package org.apache.spark.history.client.domain.tasksummary;

import java.util.List;

/**
 * Created by Talal Ahmed on 12/10/2017
 */
public class ShuffleReadMetrics {

    private List<Double> remoteBlocksFetched;
    private List<Double> localBlocksFetched;
    private List<Double> fetchWaitTime;
    private List<Double> remoteBytesRead;
    private List<Double> localBytesRead;
    private List<Double> recordsRead;

    public List<Double> getRemoteBlocksFetched() {
        return remoteBlocksFetched;
    }

    public void setRemoteBlocksFetched(List<Double> remoteBlocksFetched) {
        this.remoteBlocksFetched = remoteBlocksFetched;
    }

    public List<Double> getLocalBlocksFetched() {
        return localBlocksFetched;
    }

    public void setLocalBlocksFetched(List<Double> localBlocksFetched) {
        this.localBlocksFetched = localBlocksFetched;
    }

    public List<Double> getFetchWaitTime() {
        return fetchWaitTime;
    }

    public void setFetchWaitTime(List<Double> fetchWaitTime) {
        this.fetchWaitTime = fetchWaitTime;
    }

    public List<Double> getRemoteBytesRead() {
        return remoteBytesRead;
    }

    public void setRemoteBytesRead(List<Double> remoteBytesRead) {
        this.remoteBytesRead = remoteBytesRead;
    }

    public List<Double> getLocalBytesRead() {
        return localBytesRead;
    }

    public void setLocalBytesRead(List<Double> localBytesRead) {
        this.localBytesRead = localBytesRead;
    }

    public List<Double> getRecordsRead() {
        return recordsRead;
    }

    public void setRecordsRead(List<Double> recordsRead) {
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
