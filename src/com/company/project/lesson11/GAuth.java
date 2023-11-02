package com.company.project.lesson11;

public final class GAuth implements Auth {

    @Override
    public boolean login(String username, String password) {
        return false;
    }

    @Override
    public boolean logout() {
        return false;
    }
}

