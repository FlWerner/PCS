/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package de.telekom.fw;

import de.telekom.fw.model.mainGui;
import de.telekom.fw.time.Time;

/**
 *
 * @author A48248184
 */
public class AppController {

    /**
     * @param args the command line arguments
     */
    private Time time = new Time();

    public AppController() {
        test();

    }

    private void test() {

        mainGui maingui = new mainGui();

        time.addChangeListener(maingui);
        Thread timethread = new Thread(time);
        timethread.start();
        maingui.setVisible(true);

    }

    public static void main(String[] args) {
        // TODO code application logic here
        java.awt.EventQueue.invokeLater(AppController::new);
    }

}
