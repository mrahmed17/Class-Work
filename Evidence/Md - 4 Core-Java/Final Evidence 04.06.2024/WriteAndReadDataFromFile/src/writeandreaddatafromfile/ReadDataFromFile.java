package writeandreaddatafromfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataFromFile {

    public static void main(String[] args) {

        try ( BufferedReader reader = new BufferedReader(new FileReader("output.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Read from file: " + line);
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }
}
