/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio146;

import groupableHeader.GroupableHeaderExample;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author Luciano
 */
public class Ejercicio146 {

    /**
     * @param args the command line arguments
     */
    /*
    public static void main(String[] args) {
        new Pantalla().setVisible(true);
    }
     */

    public static void main(String[] args) {
        GroupableHeaderExample frame = new GroupableHeaderExample();
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        frame.setVisible(true);
    }

}
