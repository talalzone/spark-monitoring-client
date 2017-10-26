package com.spark.historyserver.client.domain;

import java.util.List;

/**
 * Created by Talal Ahmed on 14/10/2017
 */
public class Stage {

    private String status;
    private Integer stageId;
    private Integer attemptId;
    private Long numActiveTasks;
    private Long numCompleteTasks;
    private Long numFailedTasks;
    private Long executorRunTime;
    private Long executorCpuTime;
    private String submissionTime;
    private String firstTaskLaunchedTime;
    private String completionTime;
    private Long inputBytes;
    private Long inputRecords;
    private Long outputBytes;
    private Long outputRecords;
    private Long shuffleReadBytes;
    private Long shuffleReadRecords;
    private Long shuffleWriteBytes;
    private Long shuffleWriteRecords;
    private Long memoryBytesSpilled;
    private Long diskBytesSpilled;
    private String name;
    private String details;
    private String schedulingPool;
    private List<AccumulatorUpdate> accumulatorUpdates = null;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getStageId() {
        return stageId;
    }

    public void setStageId(Integer stageId) {
        this.stageId = stageId;
    }

    public Integer getAttemptId() {
        return attemptId;
    }

    public void setAttemptId(Integer attemptId) {
        this.attemptId = attemptId;
    }

    public Long getNumActiveTasks() {
        return numActiveTasks;
    }

    public void setNumActiveTasks(Long numActiveTasks) {
        this.numActiveTasks = numActiveTasks;
    }

    public Long getNumCompleteTasks() {
        return numCompleteTasks;
    }

    public void setNumCompleteTasks(Long numCompleteTasks) {
        this.numCompleteTasks = numCompleteTasks;
    }

    public Long getNumFailedTasks() {
        return numFailedTasks;
    }

    public void setNumFailedTasks(Long numFailedTasks) {
        this.numFailedTasks = numFailedTasks;
    }

    public Long getExecutorRunTime() {
        return executorRunTime;
    }

    public void setExecutorRunTime(Long executorRunTime) {
        this.executorRunTime = executorRunTime;
    }

    public Long getExecutorCpuTime() {
        return executorCpuTime;
    }

    public void setExecutorCpuTime(Long executorCpuTime) {
        this.executorCpuTime = executorCpuTime;
    }

    public String getSubmissionTime() {
        return submissionTime;
    }

    public void setSubmissionTime(String submissionTime) {
        this.submissionTime = submissionTime;
    }

    public String getFirstTaskLaunchedTime() {
        return firstTaskLaunchedTime;
    }

    public void setFirstTaskLaunchedTime(String firstTaskLaunchedTime) {
        this.firstTaskLaunchedTime = firstTaskLaunchedTime;
    }

    public String getCompletionTime() {
        return completionTime;
    }

    public void setCompletionTime(String completionTime) {
        this.completionTime = completionTime;
    }

    public Long getInputBytes() {
        return inputBytes;
    }

    public void setInputBytes(Long inputBytes) {
        this.inputBytes = inputBytes;
    }

    public Long getInputRecords() {
        return inputRecords;
    }

    public void setInputRecords(Long inputRecords) {
        this.inputRecords = inputRecords;
    }

    public Long getOutputBytes() {
        return outputBytes;
    }

    public void setOutputBytes(Long outputBytes) {
        this.outputBytes = outputBytes;
    }

    public Long getOutputRecords() {
        return outputRecords;
    }

    public void setOutputRecords(Long outputRecords) {
        this.outputRecords = outputRecords;
    }

    public Long getShuffleReadBytes() {
        return shuffleReadBytes;
    }

    public void setShuffleReadBytes(Long shuffleReadBytes) {
        this.shuffleReadBytes = shuffleReadBytes;
    }

    public Long getShuffleReadRecords() {
        return shuffleReadRecords;
    }

    public void setShuffleReadRecords(Long shuffleReadRecords) {
        this.shuffleReadRecords = shuffleReadRecords;
    }

    public Long getShuffleWriteBytes() {
        return shuffleWriteBytes;
    }

    public void setShuffleWriteBytes(Long shuffleWriteBytes) {
        this.shuffleWriteBytes = shuffleWriteBytes;
    }

    public Long getShuffleWriteRecords() {
        return shuffleWriteRecords;
    }

    public void setShuffleWriteRecords(Long shuffleWriteRecords) {
        this.shuffleWriteRecords = shuffleWriteRecords;
    }

    public Long getMemoryBytesSpilled() {
        return memoryBytesSpilled;
    }

    public void setMemoryBytesSpilled(Long memoryBytesSpilled) {
        this.memoryBytesSpilled = memoryBytesSpilled;
    }

    public Long getDiskBytesSpilled() {
        return diskBytesSpilled;
    }

    public void setDiskBytesSpilled(Long diskBytesSpilled) {
        this.diskBytesSpilled = diskBytesSpilled;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getSchedulingPool() {
        return schedulingPool;
    }

    public void setSchedulingPool(String schedulingPool) {
        this.schedulingPool = schedulingPool;
    }

    public List<AccumulatorUpdate> getAccumulatorUpdates() {
        return accumulatorUpdates;
    }

    public void setAccumulatorUpdates(List<AccumulatorUpdate> accumulatorUpdates) {
        this.accumulatorUpdates = accumulatorUpdates;
    }

    @Override
    public String toString() {
        return "Stage{" +
                "status='" + status + '\'' +
                ", stageId=" + stageId +
                ", attemptId=" + attemptId +
                ", numActiveTasks=" + numActiveTasks +
                ", numCompleteTasks=" + numCompleteTasks +
                ", numFailedTasks=" + numFailedTasks +
                ", executorRunTime=" + executorRunTime +
                ", executorCpuTime=" + executorCpuTime +
                ", submissionTime='" + submissionTime + '\'' +
                ", firstTaskLaunchedTime='" + firstTaskLaunchedTime + '\'' +
                ", completionTime='" + completionTime + '\'' +
                ", inputBytes=" + inputBytes +
                ", inputRecords=" + inputRecords +
                ", outputBytes=" + outputBytes +
                ", outputRecords=" + outputRecords +
                ", shuffleReadBytes=" + shuffleReadBytes +
                ", shuffleReadRecords=" + shuffleReadRecords +
                ", shuffleWriteBytes=" + shuffleWriteBytes +
                ", shuffleWriteRecords=" + shuffleWriteRecords +
                ", memoryBytesSpilled=" + memoryBytesSpilled +
                ", diskBytesSpilled=" + diskBytesSpilled +
                ", name='" + name + '\'' +
                ", details='" + details + '\'' +
                ", schedulingPool='" + schedulingPool + '\'' +
                ", accumulatorUpdates=" + accumulatorUpdates +
                '}';
    }
}
