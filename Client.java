/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;
import java.io.*;
import java.net.*;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String buff;
        Socket s;
        try {
            s = new Socket("172.16.2.136",4550);
            BufferedReader b = new BufferedReader(new InputStreamReader(s.getInputStream()));
           Scanner in =new Scanner(System.in);
            PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
            System.out.println("Connection Established");
            System.out.println("Enter the data");
            buff = in.next();
            System.out.println(buff+"-Message");
            pw.println(buff);
            buff=b.readLine();
            System.out.println(buff);
            System.out.print("Echo Received");
            
        }
        catch (IOException e){
            System.out.print(e);
        }
    }
    
}
