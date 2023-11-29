package com.company.project.lesson24;

import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

public class XOROutputStream extends FilterOutputStream {
    private final int key = 42;

    public XOROutputStream(ByteArrayOutputStream out) {
        super(out);
    }

    @Override
    public void write(int b) throws IOException {
        super.write(b ^ key);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        byte[] encrypted = new byte[len];
        for (int i = off; i < (off + len); i++) {
            encrypted[i - off] = (byte) (b[i] ^ key);
        }
        super.write(b, 0, len);
    }

}
