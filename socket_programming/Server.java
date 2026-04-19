import java.awt.desktop.SystemEventListener;
import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Server {
    public static void main(String args[]) throws IOException{
        ServerSocket ss = new ServerSocket(5000);
        System.out.println("Waiting for Client.......!");
        Socket socket= ss.accept();
        System.out.println("Client found");

        DataInputStream input = new DataInputStream(socket.getInputStream());
        DataOutputStream output = new DataOutputStream(socket.getOutputStream());
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));

        String message="";
        String reply ="";
        while(!message.equals("over")) {
            message = input.readUTF();
            System.out.println("Client: "+ message);

            System.out.println("Server: ");
            reply=reader.readLine();
            output.writeUTF(reply);
        }

        socket.close();
        ss.close();
    }
}