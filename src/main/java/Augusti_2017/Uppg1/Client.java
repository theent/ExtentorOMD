package Augusti_2017.Uppg1;



public class Client {
    private Invoker inv;
    public Client() {
    }

    public void newCommand(String s) {
        Command cmd;

        if(s.equals("X")) {
            cmd = new XCommand();
        }
        else if(s.equals("Y")) {
            cmd = new YCommand();
        }
        else {
            cmd = new ZCommand();
        }

        inv.store(cmd);
        cmd.execute();

    }


}
