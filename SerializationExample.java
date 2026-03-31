import java.io.*;

class Student implements Serializable {
    int id;
    String name ;
    transient String cgpa; // not serialized
    Student(int id, String name, String cgpa){
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
}

public class SerializationExample {
     public static  void main(String[] args)
     {
         try
     {
         Student st1= new Student(120, "ABC", "3.5");
         //Serialization
         FileOutputStream file = new FileOutputStream("student.txt"); //file creation
         ObjectOutputStream out = new ObjectOutputStream(file); // write

         out.writeObject(st1);
         out.close();
         file.close();
         System.out.println("Object Serialization created");
         //Deserialization

         FileInputStream receivedFile= new FileInputStream("student.txt");
         ObjectInputStream in= new ObjectInputStream(receivedFile);
         Student st2= (Student) in.readObject();

         in.close();
         receivedFile.close();

         System.out.println("--------Deserialized-------");
         System.out.println("ID= "+ st2.id);
         System.out.println("name= "+st2.name);
         System.out.println("password= "+st2.cgpa);

     } catch (Exception e) {
         throw new RuntimeException(e);
     }

     }
}
