package org.apache.spark.history.client.domain;

import java.util.List;

/**
 * Created by Talal Ahmed on 13/10/2017
 */
public class Application {

    private String id;
    private String name;
    private List<Attempt> attempts;

    public Application() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Attempt> getAttempts() {
        return attempts;
    }

    public void setAttempts(List<Attempt> attempts) {
        this.attempts = attempts;
    }

    @Override
    public String toString() {
        return "Application{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", attempts=" + attempts +
                '}';
    }
}
