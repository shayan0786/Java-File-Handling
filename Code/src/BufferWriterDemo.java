package Code.src;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterDemo {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("../data/bufferwriterdemo.txt"))){
            bw.write("Buffer Reader");
            bw.newLine();
            bw.write("Buffer Reader is the java class that read the input stream from the file using the buffer");
            bw.newLine();
            bw.write("This read line by line instead of character by character");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
