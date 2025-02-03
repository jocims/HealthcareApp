package com.example.healthcareapp.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class WorkBase {

    private int workBaseId;
    private int workBaseNumber;
    private String location;
    private LocalDate createdAt;
    private LocalDate updatedAt;

    public WorkBase(int workBaseId, int workBaseNumber, String location, LocalDate createdAt, LocalDate updatedAt) {
        this.workBaseId = workBaseId;
        this.workBaseNumber = workBaseNumber;
        this.location = location;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public int getWorkBaseId() {
        return workBaseId;
    }

    public void setWorkBaseId(int workBaseId) {
        this.workBaseId = workBaseId;
    }

    public int getWorkBaseNumber() {
        return workBaseNumber;
    }

    public void setWorkBaseNumber(int workBaseNumber) {
        this.workBaseNumber = workBaseNumber;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "WorkBase{" +
                "workBaseId=" + workBaseId +
                ", workBaseNumber=" + workBaseNumber +
                ", location='" + location + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
