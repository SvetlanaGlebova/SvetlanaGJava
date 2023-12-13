package com.company.project.multithreading;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ConnectionService implements Runnable {
    private final Socket socket;
    private final ObjectInputStream objectInputStream;
    private final ObjectOutputStream objectOutputStream;

    public ConnectionService(Socket socket) throws IOException {
        this.socket = socket;
        this.objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
        this.objectInputStream = new ObjectInputStream(socket.getInputStream());
    }

    @Override
    public void run() {
        try {
            while (true) {
                Message message = (Message) objectInputStream.readObject();
                System.out.println("Входящее сообщение: " + message.getContent());
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public void sendMessage(Message message) throws IOException {
        objectOutputStream.writeObject(message);
        objectOutputStream.flush();
    }

    public ObjectInput getInputStream() {
        return null;
    }
}
