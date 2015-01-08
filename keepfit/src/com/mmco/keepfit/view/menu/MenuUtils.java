package com.mmco.keepfit.view.menu;

import javax.swing.*;
import java.util.List;
import java.util.Map;

/**
 * Created by MIRCEA on 12/23/2014.
 */
public class MenuUtils {


    public JMenuBar createMenuBar() {
        return new JMenuBar();
    }

    public JMenu createMenuWithSubmenus(String menuName, String... subMenus) {
        JMenu menu = new JMenu(menuName);
        for (String subMenu : subMenus) {
            menu.add(new JMenuItem(subMenu));
        }
        return menu;
    }

    public JMenu createMenuWithSubmenusAndImages(String menuName, Map<String, String> subMenu2ImageMap) {
        JMenu menu = new JMenu(menuName);
        for (String subMenu : subMenu2ImageMap.keySet()) {
            JMenuItem menuItem = new JMenuItem(subMenu);
            menuItem.setIcon(new ImageIcon(subMenu2ImageMap.get(subMenu)));
            menu.add(menuItem);
        }
        return menu;
    }


    public enum MenuNames {
        FILE, EDIT, ABOUT, NEW, RESET;
    }
}
