package com.mmco.keepfit.view;

import com.mmco.keepfit.view.menu.MenuUtils;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Mircea on 12/21/2014.
 */
public class MainFrame {

    public final static String FRAME_NAME = "Keep Fit";
    public static MenuUtils menuUtils = new MenuUtils();
    public static final int HORIZONTAL_DIMMENSION = 800;//somthing dynamic in the future
    public static final int VERTICAL_DIMENSION = 600;


    public static void createAndShowGUI() {
        JFrame frame = new JFrame(FRAME_NAME);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setPreferredSize(new Dimension(HORIZONTAL_DIMMENSION, VERTICAL_DIMENSION));


        JMenuBar menuBar = menuUtils.createMenuBar();
        menuBar.add(menuUtils.createMenuWithSubmenus(MenuUtils.MenuNames.FILE.toString(), MenuUtils.MenuNames.NEW.toString(), MenuUtils.MenuNames.RESET.toString()));

        frame.setJMenuBar(menuBar);

        frame.pack();
        frame.setVisible(true);
    }
}
