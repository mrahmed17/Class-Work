package writeandreaddatafromfile;

import java.io.FileWriter;
import java.io.IOException;

public class WriteAndReadDataFromFile {

    public static void main(String[] args) {

        String content = "Hello, IsDB! Wish your Best of luck";

        try ( FileWriter writer = new FileWriter("output.txt")) {
            writer.write(content);
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }

    }

}
