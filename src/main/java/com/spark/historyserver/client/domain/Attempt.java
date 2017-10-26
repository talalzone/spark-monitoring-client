package com.spark.historyserver.client.domain;

/**
 * Created by Talal Ahmed on 14/10/2017
 */
public class Attempt {

    private String startTime;
    private String endTime;
    private String lastUpdated;
    private Integer duration;
    private String sparkUser;
    private Boolean completed;
    private Long startTimeEpoch;
    private Long endTimeEpoch;
    private Long lastUpdatedEpoch;

    public Attempt() {
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getSparkUser() {
        return sparkUser;
    }

    public void setSparkUser(String sparkUser) {
        this.sparkUser = sparkUser;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public Long getStartTimeEpoch() {
        return startTimeEpoch;
    }

    public void setStartTimeEpoch(Long startTimeEpoch) {
        this.startTimeEpoch = startTimeEpoch;
    }

    public Long getEndTimeEpoch() {
        return endTimeEpoch;
    }

    public void setEndTimeEpoch(Long endTimeEpoch) {
        this.endTimeEpoch = endTimeEpoch;
    }

    public Long getLastUpdatedEpoch() {
        return lastUpdatedEpoch;
    }

    public void setLastUpdatedEpoch(Long lastUpdatedEpoch) {
        this.lastUpdatedEpoch = lastUpdatedEpoch;
    }

    @Override
    public String toString() {
        return "Attempt{" +
                "startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", lastUpdated='" + lastUpdated + '\'' +
                ", duration=" + duration +
                ", sparkUser='" + sparkUser + '\'' +
                ", completed=" + completed +
                ", startTimeEpoch=" + startTimeEpoch +
                ", endTimeEpoch=" + endTimeEpoch +
                ", lastUpdatedEpoch=" + lastUpdatedEpoch +
                '}';
    }
}
