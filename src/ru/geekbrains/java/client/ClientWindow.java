package ru.geekbrains.java.client;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.text.html.parser.ContentModel;
import java.awt.*;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;

/**
 * Created by admin on 11/11/2016.
 */
class ClientWindow extends JFrame {
    private JPanel container;

    public ClientWindow() throws HeadlessException {
        setTitle("Chat v1.0");
        setLayout(new BorderLayout());
        setSize(new Dimension(350, 500));
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setJMenuBar(new MenuBar());
        container = new Content();
        add(container);
        setVisible(true);
    }


}
