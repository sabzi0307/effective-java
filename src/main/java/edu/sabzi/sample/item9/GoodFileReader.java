package edu.sabzi.sample.item9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GoodFileReader {

    public static String readFirstLine(String path) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            return br.readLine();
        }
    }
}
