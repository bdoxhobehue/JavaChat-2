package ru.geekbrains.java.client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.ArrayList;

/**
 * Created by admin on 11/11/2016.
 */
class Content extends JPanel {
    private JPanel jPanelNorth = new JPanel();
    private JPanel jPanelCenter = new JPanel();
    private JPanel jPanelSouth = new JPanel();

    private JTextField jLoginField = new JTextField("Login");
    private JTextField jPasswordField = new JTextField("Password");
    private JButton jAuthButton = new JButton("Send");

    private JTextArea jTextArea = new JTextArea();

    private JTextField jTextField = new JTextField("Enter message");
    private JButton jButton = new JButton("Send");

    public Content() {
        super();
        this.setLayout(new BorderLayout());

        ArrayList<JTextField> listOfFields = new ArrayList<JTextField>();
        listOfFields.add(jLoginField);
        listOfFields.add(jPasswordField);
        listOfFields.add(jTextField);

        for(JTextField i : listOfFields){
            i.addFocusListener(new FocusListener() {
                @Override
                public void focusGained(FocusEvent e) {
                    i.setText("");
                }

                @Override
                public void focusLost(FocusEvent e) {

                }
            });
        }

        jPanelNorth.setLayout(new GridLayout(1, 3));
        jPanelNorth.add(jLoginField);
        jPanelNorth.add(jPasswordField);
        jPanelNorth.add(jAuthButton);

        jTextArea.setEditable(false);
        jPanelCenter.add(jTextArea);

        jPanelSouth.setLayout(new GridLayout(1, 2));
        jPanelSouth.add(jTextField);
        jPanelSouth.add(jButton);

        add(jPanelNorth,BorderLayout.NORTH);
        add(jPanelCenter,BorderLayout.CENTER);
        add(jPanelSouth, BorderLayout.SOUTH);




    }



}