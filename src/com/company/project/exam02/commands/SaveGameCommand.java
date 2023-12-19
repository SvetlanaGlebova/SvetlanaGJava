package com.company.project.exam02.commands;

import com.company.project.exam02.Game;

public class SaveGameCommand implements Command {
    Game game;

    public SaveGameCommand(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.saveGameState();
        
    }
}
