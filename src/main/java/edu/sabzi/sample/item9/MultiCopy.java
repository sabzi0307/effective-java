package edu.sabzi.sample.item9;

import java.io.*;

public class MultiCopy {

    public static void copy(String src, String dest) throws IOException {
        try (InputStream in = new FileInputStream(src);
             OutputStream out = new FileOutputStream(dest)) {

            byte[] buffer = new byte[4096];
            int n;

            while ((n = in.read(buffer)) > 0) {
                out.write(buffer, 0, n);
            }
        }
    }
}
