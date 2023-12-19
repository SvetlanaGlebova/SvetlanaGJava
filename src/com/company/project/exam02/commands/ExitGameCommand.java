package com.company.project.exam02.commands;

import com.company.project.exam02.Game;

public class ExitGameCommand implements Command {
    Game game;

    public ExitGameCommand(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.exit();

    }
}
