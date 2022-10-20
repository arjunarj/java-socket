/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.net.*;
/**
 *
 * @author User
 */
public class Server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String buff;
        ServerSocket s;
        Socket in;
        try {
            s = new ServerSocket(4550);
            in = s.accept();
            BufferedReader b = new BufferedReader(new InputStreamReader(in.getInputStream()));
            PrintWriter pw = new PrintWriter(in.getOutputStream(),true);
            System.out.println("Connection Established");
            buff = b.readLine();
            System.out.println("client said "+buff);
//            buff = b.readLine();
            pw.println("From server");
            pw.println(buff);
        }
        catch (IOException e) {
            System.out.print(e);
        }
    }
    
}
