package com.company.project.lesson27.homework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Proccesor implements Runnable {
    private String fileName;
    private static int messageCount;

    public Proccesor(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] strings = line.split("::");
                if (strings.length == 3) {
                    int priority = Integer.parseInt(strings[1]);

                    if (priority >= 7) {
                        synchronized (Proccesor.class) {
                            messageCount ++;
                        }
                        System.out.println(line);
                    }
                }
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        ;

        System.out.println("file: " + fileName + ",messageCount =" + messageCount);
    }
}
