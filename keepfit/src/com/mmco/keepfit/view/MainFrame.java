package com.mmco.keepfit.view;

import javax.swing.*;

/**
 * Created by Mircea on 12/21/2014.
 */
public class MainFrame {

    public final static String FRAME_NAME = "mainFrame";
    public final static String FRAME_LABEL = "Keep Fit";

    public static void createAndShowGUI() {
        JFrame frame = new JFrame(FRAME_NAME);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel(FRAME_LABEL);
        frame.getContentPane().add(label);

        frame.pack();
        frame.setVisible(true);
    }
}
