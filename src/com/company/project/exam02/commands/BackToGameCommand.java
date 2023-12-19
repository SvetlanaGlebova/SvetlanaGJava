package com.company.project.exam02.commands;

import com.company.project.exam02.Game;

public class BackToGameCommand implements Command {
    Game game;

    public BackToGameCommand(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.back();

    }
}
