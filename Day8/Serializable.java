import java.io.*;

// -------- Person Class (Serializable) --------
class Person implements Serializable {
    private static final long serialVersionUID = 1L;

    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// -------- Main Program --------
public class SerializationDemo {

    public static void main(String[] args) {

        Person p1 = new Person("John Doe", 25);
        String fileName = "person.ser";

        // -------- Serialization --------
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(p1);   // writing object
            oos.close();
            fos.close();

            System.out.println("Object Serialized Successfully!");

        } catch (IOException e) {
            System.out.println("Serialization Error: " + e.getMessage());
        }

        // -------- Deserialization --------
        try {
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);

            Person p2 = (Person) ois.readObject();  // reading object back
            ois.close();
            fis.close();

            // Print data of the deserialized object
            System.out.println("Deserialized Object Data:");
            System.out.println("Name: " + p2.name);
            System.out.println("Age: " + p2.age);

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization Error: " + e.getMessage());
        }
    }
}
