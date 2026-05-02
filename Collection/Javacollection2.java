
import java.util.*;

public class Javacollection2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
         // List for storing books
        List<String> books = new ArrayList<>();
        books.add("Java Programming");
        books.add("Data Structures");
        
        // Set for storing unique authors
        Set<String> authors = new HashSet<>();
        authors.add("Dr. Smith");
        authors.add("Jack"); // Duplicate, will not be added
        
        // Queue for managing borrow requests
        var borrowQueue = new LinkedList<String>();
        borrowQueue.add("Student1");
        borrowQueue.add("Student2");
        
        // Map for Book ID and Book Name
        Map<Integer, String> bookRecords = new HashMap<>();
        bookRecords.put(101, "Java Programming");
        bookRecords.put(102, "Data Structures");
        
        // Printing all
        System.out.println("Books: " + books);
        System.out.println("Authors: " + authors);
        System.out.println("Borrow Queue: " + borrowQueue);
        System.out.println("Book with ID 101: " + bookRecords);
    }
}
