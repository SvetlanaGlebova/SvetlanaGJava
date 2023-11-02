package com.company.project.lesson11;

class FormAuth extends AppAuth{}
public /*final*/ /*sealed*/ non-sealed class AppAuth implements Auth /*permits FormAuth, TokenAuth*/{
    Auth auth;
    @Override
    public boolean login(String username, String password) {
        auth = new AppAuth();
        return false;
    }

    @Override
    public boolean logout() {
        return false;
    }
}
