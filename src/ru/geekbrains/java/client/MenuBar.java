package ru.geekbrains.java.client;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by admin on 11/11/2016.
 */
class MenuBar extends JMenuBar {
    public MenuBar() {
        JMenu mFile = new JMenu("File");
        JMenuItem mFileExit = new JMenuItem("Exit");
        mFileExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        mFile.add(mFileExit);

        JMenu mSettings = new JMenu("Settings");
        JMenuItem mNetSet = new JMenuItem("Network Settings");
        mSettings.add(mNetSet);

        JMenu mHelp = new JMenu("Help");
        JMenuItem mAbout = new JMenuItem("About");
        mHelp.add(mAbout);


        this.add(mFile);
        this.add(mSettings);
        this.add(mHelp);
    }
}
