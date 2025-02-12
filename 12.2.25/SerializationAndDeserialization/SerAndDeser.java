package SerializationAndDeserialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerAndDeser {
     public void serializeMethod() throws IOException {
        try {
            Employee e1 = new Employee(123,"ravi","ravi@123");
            FileOutputStream fout = new FileOutputStream("e.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(e1);
            out.flush();
            out.close();
            System.out.println("success");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void deserializeMethod() throws IOException {
        try{
            ObjectInputStream in=new ObjectInputStream(new FileInputStream("e.txt"));
            Employee ee=(Employee)in.readObject();
            System.out.println(ee.Eno+" "+ee.ename);
            in.close();
        }catch(Exception e){System.out.println(e);}
    }
}
