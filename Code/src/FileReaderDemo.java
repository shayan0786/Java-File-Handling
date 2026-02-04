package Code.src;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

    public static void main(String[] args) throws IOException {

        try {

            FileReader fr = new FileReader("Code/data/filereaddemo.txt");

            int ch;

            while ((ch = fr.read()) != -1) {

                System.out.print((char) ch);

            }

            fr.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
