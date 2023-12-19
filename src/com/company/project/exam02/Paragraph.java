package com.company.project.exam02;

import java.util.Map;

public class Paragraph {
    String id;
    String text;
Map<String, String> options;

    @Override
    public String toString() {
        return text;
    }

    public Paragraph(String id, String text, Map<String, String> options) {
        this.id = id;
        this.text = text;
        this.options = options;
    }

}
