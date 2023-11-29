package com.company.project.lesson24;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class XORInputStream extends FilterInputStream {
final private int key = 42;
@Override
public int read() throws IOException {
  int data = super.read();
   if (data != -1) {
       return data^key;
   }
   else {
   return -1;
   }
}
@Override
public int read(byte[] b, int off, int len) throws IOException {
  int bytesRead = super.read(b, off, len);
  if (bytesRead != 1) {
      for (int i = off; i < off + bytesRead; i++) {
          b[i]^= key;
      }
  }
  return bytesRead;
}
    protected XORInputStream(InputStream in) {
        super(in);
    }
}
