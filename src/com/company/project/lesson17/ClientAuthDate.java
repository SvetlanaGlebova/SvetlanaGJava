package com.company.project.lesson17;

import java.util.Objects;
public class ClientAuthDate {
    public enum Role {
        USER, ADMIN, MODERATOR
    }
    private String userName;
    private String password;

    private Role role;

    public ClientAuthDate(String userName, password, Role role) {
        this.userName = userName;
        this.password = password;
        this.role = role;
    }
}
