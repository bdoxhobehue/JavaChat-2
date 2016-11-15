package ru.geekbrains.java.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;

public class ServerMain {


    public static void main(String[] args) {
        ConnectionBroker connectionBroker = new ConnectionBroker();
        connectionBroker.start();



    }
}
