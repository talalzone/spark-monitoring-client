
package com.spark.historyserver.client.domain;


/**
 * Created by Talal Ahmed on 12/10/2017
 */
public class ExecutorSummary {

    private Long taskTime;
    private Long failedTasks;
    private Long succeededTasks;
    private Long inputBytes;
    private Long outputBytes;
    private Long shuffleRead;
    private Long shuffleWrite;
    private Long memoryBytesSpilled;
    private Long diskBytesSpilled;

    public Long getTaskTime() {
        return taskTime;
    }

    public void setTaskTime(Long taskTime) {
        this.taskTime = taskTime;
    }

    public Long getFailedTasks() {
        return failedTasks;
    }

    public void setFailedTasks(Long failedTasks) {
        this.failedTasks = failedTasks;
    }

    public Long getSucceededTasks() {
        return succeededTasks;
    }

    public void setSucceededTasks(Long succeededTasks) {
        this.succeededTasks = succeededTasks;
    }

    public Long getInputBytes() {
        return inputBytes;
    }

    public void setInputBytes(Long inputBytes) {
        this.inputBytes = inputBytes;
    }

    public Long getOutputBytes() {
        return outputBytes;
    }

    public void setOutputBytes(Long outputBytes) {
        this.outputBytes = outputBytes;
    }

    public Long getShuffleRead() {
        return shuffleRead;
    }

    public void setShuffleRead(Long shuffleRead) {
        this.shuffleRead = shuffleRead;
    }

    public Long getShuffleWrite() {
        return shuffleWrite;
    }

    public void setShuffleWrite(Long shuffleWrite) {
        this.shuffleWrite = shuffleWrite;
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

    @Override
    public String toString() {
        return "ExecutorSummary{" +
                "taskTime=" + taskTime +
                ", failedTasks=" + failedTasks +
                ", succeededTasks=" + succeededTasks +
                ", inputBytes=" + inputBytes +
                ", outputBytes=" + outputBytes +
                ", shuffleRead=" + shuffleRead +
                ", shuffleWrite=" + shuffleWrite +
                ", memoryBytesSpilled=" + memoryBytesSpilled +
                ", diskBytesSpilled=" + diskBytesSpilled +
                '}';
    }
}
