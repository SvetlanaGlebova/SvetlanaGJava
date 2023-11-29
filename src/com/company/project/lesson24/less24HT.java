package com.company.project.lesson24;

import java.io.*;

public class less24HT {
    public static void main(String[] args) throws IOException {
        byte[] data = "i love cats".getBytes(); //поток данных
        InputStream inputStream = new ByteArrayInputStream(data);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        InputStream inputStream1 = new XORInputStream(inputStream);
        OutputStream outputStream1 = new XOROutputStream(outputStream);

        byte[] buffer = new byte[1024];
        int byteRead;
        while ((byteRead = inputStream1.read(buffer)) != -1) {
            outputStream1.write(buffer, 0, byteRead);
        }
        byte[] encryptedData = outputStream.toByteArray();
        System.out.println(new String(encryptedData));
        InputStream decryptedInputStream = new ByteArrayInputStream(encryptedData);

// Создаем новый декорированный поток ввода с XOR-дешифрованием
        decryptedInputStream = new InputStream() {
            @Override
            public int read() throws IOException {
                return 0;
            }
        };

// Читаем данные из декорированного потока ввода (расшифрованные)
        while ((byteRead = decryptedInputStream.read(buffer)) != -1) {
            System.out.print(new String(buffer, 0, byteRead));


        }
    }
}
