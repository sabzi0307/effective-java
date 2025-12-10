package edu.sabzi.sample.item9;

public class Item9Demo {

    public static void main(String[] args) {

        // Demonstrate try-with-resources
        try {
            String line = GoodFileReader.readFirstLine("demo.txt");
            System.out.println("First line: " + line);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Demonstrate multiple resources
        try {
            MultiCopy.copy("demo.txt", "demo_copy.txt");
            System.out.println("File copied successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
