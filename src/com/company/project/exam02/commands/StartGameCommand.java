package com.company.project.exam02.commands;

import com.company.project.exam02.Game;

public class StartGameCommand implements Command {
    Game game;

    public StartGameCommand(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.start();

    }
}
