
package com.spark.historyserver.client.domain;

/**
 * Created by Talal Ahmed on 12/10/2017
 */
public class TaskMetrics {

    private Long executorDeserializeTime;
    private Long executorDeserializeCpuTime;
    private Long executorRunTime;
    private Long executorCpuTime;
    private Long resultSize;
    private Long jvmGcTime;
    private Long resultSerializationTime;
    private Long memoryBytesSpilled;
    private Long diskBytesSpilled;
    private InputMetrics inputMetrics;
    private OutputMetrics outputMetrics;
    private ShuffleReadMetrics shuffleReadMetrics;
    private ShuffleWriteMetrics shuffleWriteMetrics;

    public Long getExecutorDeserializeTime() {
        return executorDeserializeTime;
    }

    public void setExecutorDeserializeTime(Long executorDeserializeTime) {
        this.executorDeserializeTime = executorDeserializeTime;
    }

    public Long getExecutorDeserializeCpuTime() {
        return executorDeserializeCpuTime;
    }

    public void setExecutorDeserializeCpuTime(Long executorDeserializeCpuTime) {
        this.executorDeserializeCpuTime = executorDeserializeCpuTime;
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

    public Long getResultSize() {
        return resultSize;
    }

    public void setResultSize(Long resultSize) {
        this.resultSize = resultSize;
    }

    public Long getJvmGcTime() {
        return jvmGcTime;
    }

    public void setJvmGcTime(Long jvmGcTime) {
        this.jvmGcTime = jvmGcTime;
    }

    public Long getResultSerializationTime() {
        return resultSerializationTime;
    }

    public void setResultSerializationTime(Long resultSerializationTime) {
        this.resultSerializationTime = resultSerializationTime;
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

    public InputMetrics getInputMetrics() {
        return inputMetrics;
    }

    public void setInputMetrics(InputMetrics inputMetrics) {
        this.inputMetrics = inputMetrics;
    }

    public OutputMetrics getOutputMetrics() {
        return outputMetrics;
    }

    public void setOutputMetrics(OutputMetrics outputMetrics) {
        this.outputMetrics = outputMetrics;
    }

    public ShuffleReadMetrics getShuffleReadMetrics() {
        return shuffleReadMetrics;
    }

    public void setShuffleReadMetrics(ShuffleReadMetrics shuffleReadMetrics) {
        this.shuffleReadMetrics = shuffleReadMetrics;
    }

    public ShuffleWriteMetrics getShuffleWriteMetrics() {
        return shuffleWriteMetrics;
    }

    public void setShuffleWriteMetrics(ShuffleWriteMetrics shuffleWriteMetrics) {
        this.shuffleWriteMetrics = shuffleWriteMetrics;
    }

    @Override
    public String toString() {
        return "TaskMetrics{" +
                "executorDeserializeTime=" + executorDeserializeTime +
                ", executorDeserializeCpuTime=" + executorDeserializeCpuTime +
                ", executorRunTime=" + executorRunTime +
                ", executorCpuTime=" + executorCpuTime +
                ", resultSize=" + resultSize +
                ", jvmGcTime=" + jvmGcTime +
                ", resultSerializationTime=" + resultSerializationTime +
                ", memoryBytesSpilled=" + memoryBytesSpilled +
                ", diskBytesSpilled=" + diskBytesSpilled +
                ", inputMetrics=" + inputMetrics +
                ", outputMetrics=" + outputMetrics +
                ", shuffleReadMetrics=" + shuffleReadMetrics +
                ", shuffleWriteMetrics=" + shuffleWriteMetrics +
                '}';
    }
}
