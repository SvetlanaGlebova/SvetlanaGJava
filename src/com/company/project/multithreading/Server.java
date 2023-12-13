package com.company.project.multithreading;

import com.company.project.lesson29.Executors;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;

public class Server {
    private static final int PORT = 8888;
    private final CopyOnWriteArraySet<ConnectionService> activeConnection = new CopyOnWriteArraySet<>();
    private final ExecutorService executorService = Executors.newFixedThreadPool(10);
    
    public void start() throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Server started. Listening on port" + PORT);
            while (true) {
                Socket clientSocket = serverSocket.accept();
                ConnectionService connectionService = new ConnectionService(clientSocket);
                activeConnection.add(connectionService);
            }
            catch(IOException e) {
                e.printStackTrance();
            }
        }
        public void broadcastMessage(Message Message message;
        message) {
            for (ConnectionService connectionService : activeConnection) {
                try {
                    connectionService.sendMessage(message);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
