package Code.src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderDemo {
    public static void main(String[] args) {
        String line; // beacuse it store line by line 
        try(BufferedReader bf = new BufferedReader(new FileReader("../data/bufferreaddemo.txt"));){
            // Buffer reader use file reader to read it file then store it in buffer pool and gives the read data 
            // it is fatsyt that is why we use
            while ((line = bf.readLine()) != null) {
                System.out.println(line);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
