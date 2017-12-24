package org.apache.spark.history.client.domain;

import java.util.List;

/**
 * Created by Talal Ahmed on 14/10/2017
 */
public class TaskSummary {

    private List<Double> quantiles = null;
    private List<Double> executorDeserializeTime = null;
    private List<Double> executorDeserializeCpuTime = null;
    private List<Double> executorRunTime = null;
    private List<Double> executorCpuTime = null;
    private List<Double> resultSize = null;
    private List<Double> jvmGcTime = null;
    private List<Double> resultSerializationTime = null;
    private List<Double> memoryBytesSpilled = null;
    private List<Double> diskBytesSpilled = null;
    private InputMetrics inputMetrics;
    private OutputMetrics outputMetrics;
    private ShuffleReadMetrics shuffleReadMetrics;
    private ShuffleWriteMetrics shuffleWriteMetrics;

    public List<Double> getQuantiles() {
        return quantiles;
    }

    public void setQuantiles(List<Double> quantiles) {
        this.quantiles = quantiles;
    }

    public List<Double> getExecutorDeserializeTime() {
        return executorDeserializeTime;
    }

    public void setExecutorDeserializeTime(List<Double> executorDeserializeTime) {
        this.executorDeserializeTime = executorDeserializeTime;
    }

    public List<Double> getExecutorDeserializeCpuTime() {
        return executorDeserializeCpuTime;
    }

    public void setExecutorDeserializeCpuTime(List<Double> executorDeserializeCpuTime) {
        this.executorDeserializeCpuTime = executorDeserializeCpuTime;
    }

    public List<Double> getExecutorRunTime() {
        return executorRunTime;
    }

    public void setExecutorRunTime(List<Double> executorRunTime) {
        this.executorRunTime = executorRunTime;
    }

    public List<Double> getExecutorCpuTime() {
        return executorCpuTime;
    }

    public void setExecutorCpuTime(List<Double> executorCpuTime) {
        this.executorCpuTime = executorCpuTime;
    }

    public List<Double> getResultSize() {
        return resultSize;
    }

    public void setResultSize(List<Double> resultSize) {
        this.resultSize = resultSize;
    }

    public List<Double> getJvmGcTime() {
        return jvmGcTime;
    }

    public void setJvmGcTime(List<Double> jvmGcTime) {
        this.jvmGcTime = jvmGcTime;
    }

    public List<Double> getResultSerializationTime() {
        return resultSerializationTime;
    }

    public void setResultSerializationTime(List<Double> resultSerializationTime) {
        this.resultSerializationTime = resultSerializationTime;
    }

    public List<Double> getMemoryBytesSpilled() {
        return memoryBytesSpilled;
    }

    public void setMemoryBytesSpilled(List<Double> memoryBytesSpilled) {
        this.memoryBytesSpilled = memoryBytesSpilled;
    }

    public List<Double> getDiskBytesSpilled() {
        return diskBytesSpilled;
    }

    public void setDiskBytesSpilled(List<Double> diskBytesSpilled) {
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
        return "TaskSummary{" +
                "quantiles=" + quantiles +
                ", executorDeserializeTime=" + executorDeserializeTime +
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
