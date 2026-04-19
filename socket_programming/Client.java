import java.net.*;
import java.io.*;

public class Client{
    public static void main (String[] args) throws IOException{
        Socket socket = new Socket("127.0.0.1",5000);

        System.out.println("Connected to server");

        DataInputStream input = new DataInputStream(socket.getInputStream());
        DataOutputStream output = new DataOutputStream(socket.getOutputStream());
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));

        String message="";
        String reply ="";
        while(!message.equals("over")) {
            System.out.print("Client: ");
            // Reading message from console
            message = reader.readLine();
            // Sending message to the server
            output.writeUTF(message);

            // Read from server
            reply = input.readUTF();
            System.out.println("Server: " + reply);

        }


        socket.close();
    }
}