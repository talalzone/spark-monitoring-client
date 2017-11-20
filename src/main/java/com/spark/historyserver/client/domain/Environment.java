package com.spark.historyserver.client.domain;

import javafx.util.Pair;

import java.util.List;
import java.util.Map;

/**
 * Created by Talal Ahmed on 14/10/2017
 */
public class Environment {

    private Map<String, String> runtime;
    private List<List<String>> sparkProperties;
    private List<List<String>> systemProperties;
    private List<List<String>> classpathEntries;

    public Map<String, String> getRuntime() {
        return runtime;
    }

    public void setRuntime(Map<String, String> runtime) {
        this.runtime = runtime;
    }

    public List<List<String>> getSparkProperties() {
        return sparkProperties;
    }

    public void setSparkProperties(List<List<String>> sparkProperties) {
        this.sparkProperties = sparkProperties;
    }

    public List<List<String>> getSystemProperties() {
        return systemProperties;
    }

    public void setSystemProperties(List<List<String>> systemProperties) {
        this.systemProperties = systemProperties;
    }

    public List<List<String>> getClasspathEntries() {
        return classpathEntries;
    }

    public void setClasspathEntries(List<List<String>> classpathEntries) {
        this.classpathEntries = classpathEntries;
    }

    @Override
    public String toString() {
        return "Environment{" +
                "runtime=" + runtime +
                ", sparkProperties=" + sparkProperties +
                ", systemProperties=" + systemProperties +
                ", classpathEntries=" + classpathEntries +
                '}';
    }
}

