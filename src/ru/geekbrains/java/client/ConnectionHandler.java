package ru.geekbrains.java.client;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by admin on 11/12/2016.
 */
class ConnectionHandler {

    private Scanner inputMessage;
    private PrintWriter outputMessage;

    public ConnectionHandler() {
        try (Socket socket = new Socket("localhost", 1111);) {
            System.out.println("Клиент подключен к серверу");

            this.inputMessage = new Scanner(socket.getInputStream());
            this.outputMessage = new PrintWriter(socket.getOutputStream());


            while (true) {
                while (inputMessage.hasNext()){
                    System.out.println(inputMessage.next());
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
