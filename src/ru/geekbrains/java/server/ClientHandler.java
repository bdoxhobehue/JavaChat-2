package ru.geekbrains.java.server;


import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by admin on 11/11/2016.
 */
class ClientHandler implements Runnable {
    private Scanner inputMessage;
    private PrintWriter outputMessage;

    public ClientHandler(Socket socket) {
        try {
            this.inputMessage = new Scanner(socket.getInputStream());
            this.outputMessage = new PrintWriter(socket.getOutputStream());
        } catch (IOException e){
            System.out.println(e);
        }
    }

    @Override
    public void run() {
        while (true) {
            String tempMessage="";
            if (inputMessage.hasNext()){
                tempMessage=inputMessage.next();
                System.out.println(tempMessage);
            }
        }
    }
}
