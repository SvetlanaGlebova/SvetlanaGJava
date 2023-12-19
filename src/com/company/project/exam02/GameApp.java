package com.company.project.exam02;

import com.company.project.exam02.commands.*;

import java.util.Scanner;

public class GameApp {
    public static void start() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введите Ваш никнейм");
            String username = scanner.nextLine();
            System.out.println("Ваш никнейм:" + username);

            Game game = new Game(username);
            Command backToGameCommand = new BackToGameCommand(game);
            Command exitGameCommand = new ExitGameCommand(game);
            Command loadGameCommand = new LoadGameCommand(game);
            Command saveGameCommand = new SaveGameCommand(game);
            Command startGameCommand = new StartGameCommand(game);

            while (true) {

                System.out.println("Пожалуйста, выберите действие");
                System.out.println("1. Start Game");
                System.out.println("2. Save Game");
                System.out.println("3. Load Game");
                System.out.println("4. Back Game");
                System.out.println("5. Exit Game");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        startGameCommand.execute();
                        break;
                    case 2:
                        saveGameCommand.execute();
                        break;
                    case 3:
                        loadGameCommand.execute();
                        break;
                    case 4:
                        backToGameCommand.execute();
                        break;
                    case 5:
                        exitGameCommand.execute();
                        break;
                    default:
                        System.out.println("Некорректный выбор. Попробуйте еще раз.");
                }
            }
        } finally {
            scanner.close();

        }
    }
}

