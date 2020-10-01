/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcpserver;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author 
 */
public class TCPServer {

    public static void main(String argv[]) throws Exception {
        String input;
        String output;

        ServerSocket welcomeSocket = new ServerSocket(6001);

        while (true) {
            Socket connectionSocket = welcomeSocket.accept();
            BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
            DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());
            input = inFromClient.readLine();
            output = input.toUpperCase() + '\n';
            outToClient.writeBytes(output);
        }
    }
}
