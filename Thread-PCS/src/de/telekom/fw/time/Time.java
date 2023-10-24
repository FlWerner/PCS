/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de.telekom.fw.time;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author A48248184
 */
public class Time implements Runnable {

    private String time = "00:00:00";
    private PropertyChangeSupport pcs;

    public Time() {
        pcs = new PropertyChangeSupport(this);
    }

    public void addChangeListener(PropertyChangeListener ChangeListener) {
        pcs.addPropertyChangeListener(ChangeListener);
    }

    public void removeChangeListener(PropertyChangeListener ChangeListener) {
        pcs.removePropertyChangeListener(ChangeListener);
    }

    @Override
    public void run() {
        while (true) {
            LocalDateTime mydate = LocalDateTime.now();
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
            time = mydate.format(dtf);
            pcs.firePropertyChange("time", 0, time);
        }
    }
}
