package org.apache.spark.monitoring.client.domain;

import java.util.List;

/**
 * Created by Talal Ahmed on 14/10/2017
 */
public class Task {

    private Long taskId;
    private Long index;
    private Long attempt;
    private String launchTime;
    private Long duration;
    private String executorId;
    private String host;
    private String status;
    private String taskLocality;
    private Boolean speculative;
    private List<Object> accumulatorUpdates = null;
    private TaskMetrics taskMetrics;

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public Long getIndex() {
        return index;
    }

    public void setIndex(Long index) {
        this.index = index;
    }

    public Long getAttempt() {
        return attempt;
    }

    public void setAttempt(Long attempt) {
        this.attempt = attempt;
    }

    public String getLaunchTime() {
        return launchTime;
    }

    public void setLaunchTime(String launchTime) {
        this.launchTime = launchTime;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public String getExecutorId() {
        return executorId;
    }

    public void setExecutorId(String executorId) {
        this.executorId = executorId;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTaskLocality() {
        return taskLocality;
    }

    public void setTaskLocality(String taskLocality) {
        this.taskLocality = taskLocality;
    }

    public Boolean getSpeculative() {
        return speculative;
    }

    public void setSpeculative(Boolean speculative) {
        this.speculative = speculative;
    }

    public List<Object> getAccumulatorUpdates() {
        return accumulatorUpdates;
    }

    public void setAccumulatorUpdates(List<Object> accumulatorUpdates) {
        this.accumulatorUpdates = accumulatorUpdates;
    }

    public TaskMetrics getTaskMetrics() {
        return taskMetrics;
    }

    public void setTaskMetrics(TaskMetrics taskMetrics) {
        this.taskMetrics = taskMetrics;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskId=" + taskId +
                ", index=" + index +
                ", attempt=" + attempt +
                ", launchTime='" + launchTime + '\'' +
                ", duration=" + duration +
                ", executorId='" + executorId + '\'' +
                ", host='" + host + '\'' +
                ", status='" + status + '\'' +
                ", taskLocality='" + taskLocality + '\'' +
                ", speculative=" + speculative +
                ", accumulatorUpdates=" + accumulatorUpdates +
                ", taskMetrics=" + taskMetrics +
                '}';
    }
}
