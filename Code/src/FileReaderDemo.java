package Code.src;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) {

        try (FileReader fr = new FileReader("../data/filereaddemo.txt")) {

            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char)ch);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
