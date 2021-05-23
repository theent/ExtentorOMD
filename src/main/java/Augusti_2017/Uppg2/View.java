package Augusti_2017.Uppg2;

import javax.swing.*;
import java.util.Observable;
import java.util.Observer;

public class View extends JButton implements Observer {

    public void changeDisplay(boolean on) {
        setLabel(on ? "ON" : "OFF");
    }

    @Override
    public void update(Observable o, Object arg) {

    }
}
