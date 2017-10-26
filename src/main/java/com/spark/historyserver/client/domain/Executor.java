package com.spark.historyserver.client.domain;

/**
 * Created by Talal Ahmed on 14/10/2017
 */
public class Executor {
    private String id;
    private String hostPort;
    private Boolean isActive;
    private Long rddBlocks;
    private Long memoryUsed;
    private Long diskUsed;
    private Long totalCores;
    private Long maxTasks;
    private Long activeTasks;
    private Long failedTasks;
    private Long completedTasks;
    private Long totalTasks;
    private Long totalDuration;
    private Long totalGCTime;
    private Long totalInputBytes;
    private Long totalShuffleRead;
    private Long totalShuffleWrite;
    private Boolean isBlacklisted;
    private Long maxMemory;
    private ExecutorLogs executorLogs;
    private MemoryMetrics memoryMetrics;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHostPort() {
        return hostPort;
    }

    public void setHostPort(String hostPort) {
        this.hostPort = hostPort;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Long getRddBlocks() {
        return rddBlocks;
    }

    public void setRddBlocks(Long rddBlocks) {
        this.rddBlocks = rddBlocks;
    }

    public Long getMemoryUsed() {
        return memoryUsed;
    }

    public void setMemoryUsed(Long memoryUsed) {
        this.memoryUsed = memoryUsed;
    }

    public Long getDiskUsed() {
        return diskUsed;
    }

    public void setDiskUsed(Long diskUsed) {
        this.diskUsed = diskUsed;
    }

    public Long getTotalCores() {
        return totalCores;
    }

    public void setTotalCores(Long totalCores) {
        this.totalCores = totalCores;
    }

    public Long getMaxTasks() {
        return maxTasks;
    }

    public void setMaxTasks(Long maxTasks) {
        this.maxTasks = maxTasks;
    }

    public Long getActiveTasks() {
        return activeTasks;
    }

    public void setActiveTasks(Long activeTasks) {
        this.activeTasks = activeTasks;
    }

    public Long getFailedTasks() {
        return failedTasks;
    }

    public void setFailedTasks(Long failedTasks) {
        this.failedTasks = failedTasks;
    }

    public Long getCompletedTasks() {
        return completedTasks;
    }

    public void setCompletedTasks(Long completedTasks) {
        this.completedTasks = completedTasks;
    }

    public Long getTotalTasks() {
        return totalTasks;
    }

    public void setTotalTasks(Long totalTasks) {
        this.totalTasks = totalTasks;
    }

    public Long getTotalDuration() {
        return totalDuration;
    }

    public void setTotalDuration(Long totalDuration) {
        this.totalDuration = totalDuration;
    }

    public Long getTotalGCTime() {
        return totalGCTime;
    }

    public void setTotalGCTime(Long totalGCTime) {
        this.totalGCTime = totalGCTime;
    }

    public Long getTotalInputBytes() {
        return totalInputBytes;
    }

    public void setTotalInputBytes(Long totalInputBytes) {
        this.totalInputBytes = totalInputBytes;
    }

    public Long getTotalShuffleRead() {
        return totalShuffleRead;
    }

    public void setTotalShuffleRead(Long totalShuffleRead) {
        this.totalShuffleRead = totalShuffleRead;
    }

    public Long getTotalShuffleWrite() {
        return totalShuffleWrite;
    }

    public void setTotalShuffleWrite(Long totalShuffleWrite) {
        this.totalShuffleWrite = totalShuffleWrite;
    }

    public Boolean getIsBlacklisted() {
        return isBlacklisted;
    }

    public void setIsBlacklisted(Boolean isBlacklisted) {
        this.isBlacklisted = isBlacklisted;
    }

    public Long getMaxMemory() {
        return maxMemory;
    }

    public void setMaxMemory(Long maxMemory) {
        this.maxMemory = maxMemory;
    }

    public ExecutorLogs getExecutorLogs() {
        return executorLogs;
    }

    public void setExecutorLogs(ExecutorLogs executorLogs) {
        this.executorLogs = executorLogs;
    }

    public MemoryMetrics getMemoryMetrics() {
        return memoryMetrics;
    }

    public void setMemoryMetrics(MemoryMetrics memoryMetrics) {
        this.memoryMetrics = memoryMetrics;
    }

    @Override
    public String toString() {
        return "Executor{" +
                "id='" + id + '\'' +
                ", hostPort='" + hostPort + '\'' +
                ", isActive=" + isActive +
                ", rddBlocks=" + rddBlocks +
                ", memoryUsed=" + memoryUsed +
                ", diskUsed=" + diskUsed +
                ", totalCores=" + totalCores +
                ", maxTasks=" + maxTasks +
                ", activeTasks=" + activeTasks +
                ", failedTasks=" + failedTasks +
                ", completedTasks=" + completedTasks +
                ", totalTasks=" + totalTasks +
                ", totalDuration=" + totalDuration +
                ", totalGCTime=" + totalGCTime +
                ", totalInputBytes=" + totalInputBytes +
                ", totalShuffleRead=" + totalShuffleRead +
                ", totalShuffleWrite=" + totalShuffleWrite +
                ", isBlacklisted=" + isBlacklisted +
                ", maxMemory=" + maxMemory +
                ", executorLogs=" + executorLogs +
                ", memoryMetrics=" + memoryMetrics +
                '}';
    }
}
