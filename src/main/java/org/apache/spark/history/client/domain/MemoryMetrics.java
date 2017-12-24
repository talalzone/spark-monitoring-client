package org.apache.spark.history.client.domain;

/**
 * Created by Talal Ahmed on 14/10/2017
 */
public class MemoryMetrics {

    private Long usedOnHeapStorageMemory;
    private Long usedOffHeapStorageMemory;
    private Long totalOnHeapStorageMemory;
    private Long totalOffHeapStorageMemory;

    public Long getUsedOnHeapStorageMemory() {
        return usedOnHeapStorageMemory;
    }

    public void setUsedOnHeapStorageMemory(Long usedOnHeapStorageMemory) {
        this.usedOnHeapStorageMemory = usedOnHeapStorageMemory;
    }

    public Long getUsedOffHeapStorageMemory() {
        return usedOffHeapStorageMemory;
    }

    public void setUsedOffHeapStorageMemory(Long usedOffHeapStorageMemory) {
        this.usedOffHeapStorageMemory = usedOffHeapStorageMemory;
    }

    public Long getTotalOnHeapStorageMemory() {
        return totalOnHeapStorageMemory;
    }

    public void setTotalOnHeapStorageMemory(Long totalOnHeapStorageMemory) {
        this.totalOnHeapStorageMemory = totalOnHeapStorageMemory;
    }

    public Long getTotalOffHeapStorageMemory() {
        return totalOffHeapStorageMemory;
    }

    public void setTotalOffHeapStorageMemory(Long totalOffHeapStorageMemory) {
        this.totalOffHeapStorageMemory = totalOffHeapStorageMemory;
    }

    @Override
    public String toString() {
        return "MemoryMetrics{" +
                "usedOnHeapStorageMemory=" + usedOnHeapStorageMemory +
                ", usedOffHeapStorageMemory=" + usedOffHeapStorageMemory +
                ", totalOnHeapStorageMemory=" + totalOnHeapStorageMemory +
                ", totalOffHeapStorageMemory=" + totalOffHeapStorageMemory +
                '}';
    }
}
