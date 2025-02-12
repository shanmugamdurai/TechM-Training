package SerializationAndDeserialization;

import java.io.Serializable;

public class Employee implements Serializable {
    int Eno;
    String ename;
    transient String email;
    Employee(int Eno,String ename,String email) {
        this.Eno = Eno;
        this.ename = ename;
        this.email = email;


    }
}
