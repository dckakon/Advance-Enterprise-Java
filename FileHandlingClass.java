import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;

public class FileHandlingClass {

    public static void main(String[] args){

            File myFile= new File("myfile.doc");
            File dir= new File("MyFolder");

       try {
           myFile.createNewFile();
           dir.mkdir();

           FileWriter myWriter = new FileWriter("myFile.doc");
           myWriter.write("hello everyone");
           myWriter.close();

           Scanner myReader = new Scanner(myFile);
           String data = myReader.nextLine();

           myFile.delete();
           System.out.println(data);

       } catch (IOException e) {
           System.out.print("An error occurred");
       }



    }
}