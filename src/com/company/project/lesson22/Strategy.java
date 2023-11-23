package com.company.project.lesson22;

public class Strategy {
    IAction<Unit> run = new Run();
    IAction<Unit> runFast = new RunFast();
    IAction<Unit> walk = new Walk();

    Unit tiger = new Unit(run);
    tiger.move();

    tiger.changeAction(walk);
    tiger.move();
    tiger.move();
    tiger.move();

}
