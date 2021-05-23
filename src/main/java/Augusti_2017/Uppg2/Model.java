package Augusti_2017.Uppg2;

import java.util.Observable;
import java.util.Observer;

public class Model extends Observable {
    private boolean on = false;
    private View v;



    public void doAction() {
        on =! on;
        v.changeDisplay(on);
    }



}
