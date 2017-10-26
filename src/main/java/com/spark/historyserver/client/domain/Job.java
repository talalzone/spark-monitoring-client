package com.spark.historyserver.client.domain;

import java.util.List;

/**
 * Created by Talal Ahmed on 14/10/2017
 */
public class Job {

    private Integer jobId;
    private String name;
    private String submissionTime;
    private String completionTime;
    private List<Integer> stageIds = null;
    private String status;
    private Long numTasks;
    private Long numActiveTasks;
    private Long numCompletedTasks;
    private Long numSkippedTasks;
    private Long numFailedTasks;
    private Long numActiveStages;
    private Long numCompletedStages;
    private Long numSkippedStages;
    private Long numFailedStages;

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubmissionTime() {
        return submissionTime;
    }

    public void setSubmissionTime(String submissionTime) {
        this.submissionTime = submissionTime;
    }

    public String getCompletionTime() {
        return completionTime;
    }

    public void setCompletionTime(String completionTime) {
        this.completionTime = completionTime;
    }

    public List<Integer> getStageIds() {
        return stageIds;
    }

    public void setStageIds(List<Integer> stageIds) {
        this.stageIds = stageIds;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getNumTasks() {
        return numTasks;
    }

    public void setNumTasks(Long numTasks) {
        this.numTasks = numTasks;
    }

    public Long getNumActiveTasks() {
        return numActiveTasks;
    }

    public void setNumActiveTasks(Long numActiveTasks) {
        this.numActiveTasks = numActiveTasks;
    }

    public Long getNumCompletedTasks() {
        return numCompletedTasks;
    }

    public void setNumCompletedTasks(Long numCompletedTasks) {
        this.numCompletedTasks = numCompletedTasks;
    }

    public Long getNumSkippedTasks() {
        return numSkippedTasks;
    }

    public void setNumSkippedTasks(Long numSkippedTasks) {
        this.numSkippedTasks = numSkippedTasks;
    }

    public Long getNumFailedTasks() {
        return numFailedTasks;
    }

    public void setNumFailedTasks(Long numFailedTasks) {
        this.numFailedTasks = numFailedTasks;
    }

    public Long getNumActiveStages() {
        return numActiveStages;
    }

    public void setNumActiveStages(Long numActiveStages) {
        this.numActiveStages = numActiveStages;
    }

    public Long getNumCompletedStages() {
        return numCompletedStages;
    }

    public void setNumCompletedStages(Long numCompletedStages) {
        this.numCompletedStages = numCompletedStages;
    }

    public Long getNumSkippedStages() {
        return numSkippedStages;
    }

    public void setNumSkippedStages(Long numSkippedStages) {
        this.numSkippedStages = numSkippedStages;
    }

    public Long getNumFailedStages() {
        return numFailedStages;
    }

    public void setNumFailedStages(Long numFailedStages) {
        this.numFailedStages = numFailedStages;
    }

    @Override
    public String toString() {
        return "Job{" +
                "jobId=" + jobId +
                ", name='" + name + '\'' +
                ", submissionTime='" + submissionTime + '\'' +
                ", completionTime='" + completionTime + '\'' +
                ", stageIds=" + stageIds +
                ", status='" + status + '\'' +
                ", numTasks=" + numTasks +
                ", numActiveTasks=" + numActiveTasks +
                ", numCompletedTasks=" + numCompletedTasks +
                ", numSkippedTasks=" + numSkippedTasks +
                ", numFailedTasks=" + numFailedTasks +
                ", numActiveStages=" + numActiveStages +
                ", numCompletedStages=" + numCompletedStages +
                ", numSkippedStages=" + numSkippedStages +
                ", numFailedStages=" + numFailedStages +
                '}';
    }
}
