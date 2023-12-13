package com.company.project.multithreading;

import java.io.Serializable;

public class Message implements Serializable {
    String content;

    public Message(String input) {
    }

    public String getContent() {
        return content;
    }
}
