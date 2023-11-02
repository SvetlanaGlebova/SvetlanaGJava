package com.company.project.lesson11;

public sealed interface Auth permits GAuth, AppAuth{
    boolean login(String authType) {
        Auth auth;
        if (authType.equals("github")){
            auth = new GAuth();
        } else {
            auth = new AppAuth();
        }
        return auth;
    }
}
