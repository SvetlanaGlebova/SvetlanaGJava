package com.company.project.coursework;

import java.util.ArrayList;
import java.util.List;

public class Fitness {
    private List<Abonement> abonements;

    public Fitness() {
        this.abonements = new ArrayList<>();
    }
    public void addAbonement(Abonement abonement) {
     abonements.add(abonement);
    }
}
