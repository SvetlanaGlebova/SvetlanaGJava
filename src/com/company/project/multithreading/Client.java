package com.company.project.multithreading;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    String serverIP = "127.0.0.1";
    int serverPort = 8888;
    public void start() throws IOException {
        try (Socket socket = new Socket(serverIP, serverPort)) {
            System.out.println("Connected to Server");
            ConnectionService connectionService = new ConnectionService(socket);
            Thread serverListener = new Thread(()-> listenToServer(connectionService));
            serverListener.start();

            Scanner scanner = new Scanner(System.in);
            String input;
            do {
                System.out.println("Enter message (type 'exit' to quit");
                input = scanner.nextLine();
                Message message = new Message(input);

                connectionService.sendMessage(message);
            }while (!input.equalsIgnoreCase("exit"));

            serverListenerThread.interrupt();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void listenToServer(ConnectionService connectionService) {
        try {
            while (true) {
                Message message = (Message) connectionService.getInputStream().readObject();
                System.out.println("Received message from server: " + message.getContent());
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Thread(()-> new Server().start()).start();
        new Thread(()-> new Client().start().start());
    }
}
