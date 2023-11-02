package com.company.project.coursework;

import java.time.LocalDateTime;
import java.util.Date;

public class Abonement {
    protected User user;
    protected boolean isUseFull;
    protected boolean towelInclude;
    private TypeAbonement type;

    private final LocalDateTime createAt;
    private LocalDateTime closeAt;

    protected Abonement(User user, boolean towelInclude, LocalDateTime closeAt, TypeAbonement type) {
        this.user = user;
        this.towelInclude = towelInclude;
        this.isUseFull = true;
        this.closeAt = closeAt;
        this.type = type;
        this.createAt = LocalDateTime.now();
    }

    public User getUser() {
        return user;
    }

    public boolean isUseFull() {
        return isUseFull;
    }

    public void setUseFull(boolean useFull) {
        isUseFull = useFull;
    }

    public boolean isTowelInclude() {
        return towelInclude;
    }

    public void setTowelInclude(boolean towelInclude) {
        this.towelInclude = towelInclude;
    }

    public LocalDateTime getCloseAt() {
        return closeAt;
    }

    public void setCloseAt(LocalDateTime closeAt) {
        this.closeAt = closeAt;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public TypeAbonement getType() {
        return type;
    }

    public void setType(TypeAbonement type) {
        this.type = type;
    }
}

