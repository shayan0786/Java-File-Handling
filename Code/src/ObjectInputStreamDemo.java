package Code.src;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo {
    public static void main(String[] args) {
        try(ObjectInputStream ois =  new ObjectInputStream(new FileInputStream("../data/student.dat"))){
            Student s1 = (Student)ois.readObject();
            System.out.println("ID: " + s1.id);
            System.out.println("Name: " + s1.name);
        }catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
