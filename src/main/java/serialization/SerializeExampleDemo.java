package serialization;

import java.io.*;

public class SerializeExampleDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SerializeExample serializeExample = new SerializeExample(40);

        ObjectOutput oo = new ObjectOutputStream(new FileOutputStream("SerializeExample.ser"));
        oo.writeObject(serializeExample);

        ObjectInput oi = new ObjectInputStream(new FileInputStream("SerializeExample.ser"));
        SerializeExample readSerializeExample = (SerializeExample)oi.readObject();

        System.out.println(serializeExample.hashCode());
        System.out.println(readSerializeExample.hashCode());

        System.out.println(serializeExample.y+" "+serializeExample.x);

        System.out.println(readSerializeExample.y+" "+readSerializeExample.x);





    }
}
