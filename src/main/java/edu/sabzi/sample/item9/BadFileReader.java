package edu.sabzi.sample.item9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BadFileReader {

    public static String readFirstLine(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));

        try {
            return br.readLine();
        } finally {
            br.close(); // ❌ If br.readLine() throws AND close() throws → second exception hides first
        }
    }
}
