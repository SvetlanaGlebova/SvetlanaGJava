package com.company.project.exam02.commands;

import com.company.project.exam02.Game;

import java.io.File;
import java.util.Scanner;

public class LoadGameCommand implements Command {
    Game game;

    public LoadGameCommand(Game game) {

        this.game = game;
    }

    @Override
    public void execute() {
        game.loadGameState();


    }
}

