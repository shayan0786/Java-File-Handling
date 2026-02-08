package Code.src;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class ObjectOutputStreamDemo {
    public static void main(String[] args) {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("../data/student.dat"))){
                Student s = new Student(52, "Shayan", 52);
                oos.writeObject(s);
                System.out.println("Object created");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
