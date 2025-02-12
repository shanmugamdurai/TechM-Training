package SerializationAndDeserialization;

import java.io.IOException;

public class Main {
     public static void main(String[] args) throws IOException {
       SerAndDeser sd = new SerAndDeser();
       sd.serializeMethod();
       sd.deserializeMethod();
   }
}
