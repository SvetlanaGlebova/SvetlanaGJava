package com.company.project.coursework;

import java.time.LocalDateTime;

public enum TypeAbonement {

    ECONOM("Econom", LocalDateTime.of(2023, 1, 1, 14, 0), LocalDateTime.of(2023, 1, 1, 22, 0), "Zone A"),
    MEDIUM("Medium", LocalDateTime.of(2023, 1, 1, 19, 0), LocalDateTime.of(2023, 1, 1, 20, 0), "Zone B"),
    VIP("VIP", LocalDateTime.of(2023, 1, 1, 24, 0), LocalDateTime.of(2023, 1, 1, 23, 59), "All Zones");
    private LocalDateTime currentDateTime;
    private String name;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String allowedZones;

    TypeAbonement(String name, LocalDateTime startTime, LocalDateTime endTime, String allowedZones) {
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
        this.allowedZones = allowedZones;
        this.currentDateTime = LocalDateTime.now();
    }

    public LocalDateTime getCurrentDateTime() {
        return currentDateTime;
    }
    public int getYear(){
        return getCurrentDateTime().getYear();
    }
    public void setCurrentDateTime(LocalDateTime currentDateTime) {
        this.currentDateTime = currentDateTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public String getAllowedZones() {
        return allowedZones;
    }

    public void setAllowedZones(String allowedZones) {
        this.allowedZones = allowedZones;
    }
}
