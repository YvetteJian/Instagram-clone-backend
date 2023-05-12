package com.yvette.instagramclone.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.sql.Timestamp;

@Entity(name="Status")
public class Status {
    @Id
    @GeneratedValue
    private int id;
    private String statusId;
    private String userName;
    private String userId;
    private String path;
    private Timestamp timestamp;

    public Status() {
        super();
    }

    public Status(int id, String statusId, String userId, String path, Timestamp timestamp, String userName) {
        super();
        this.id = id;
        this.statusId = statusId;
        this.userId = userId;
        this.path = path;
        this.timestamp = timestamp;
        this.userName = userName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}
