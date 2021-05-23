package Augusti_2017.Uppg1;

import java.util.ArrayList;
import java.util.List;

public class Invoker {

    private List<Command> list;

    public Invoker() {
        list = new ArrayList<Command>();
    }

    public void store(Command cmd) {
        list.add(cmd);
    }

    public void doCommand(int num) {
        // Commando sparas efter de körs, vilket innebär att det "första" commandot är alltid sist
        list.get(list.size() - num).execute();
    }

}
