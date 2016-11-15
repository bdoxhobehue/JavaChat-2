package ru.geekbrains.java.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;

/**
 * Created by admin on 11/12/2016.
 */
class ConnectionBroker extends Thread {
    public ConnectionBroker() {
    }

    @Override
    public void run() {
        super.run();
        int count = 0;
        LinkedList<Socket> sockets = new LinkedList<Socket>();
        while (true) {
            try (ServerSocket serverSocket = new ServerSocket(1111)) {
                sockets.add(serverSocket.accept());
                count++;
                System.out.println("Клиент подключен " + count);
                new Thread(new ClientHandler(sockets.getFirst())).start();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}
