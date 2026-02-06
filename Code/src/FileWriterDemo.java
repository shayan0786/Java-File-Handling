package Code.src;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) {
        try(FileWriter fw = new FileWriter("../data/filewriterdemo.txt");){
            fw.write("File Writer");
            fw.write("File Writer is the java class used top write character into txt file . it is ");
            fw.write("Program → FileWriter → File");
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
