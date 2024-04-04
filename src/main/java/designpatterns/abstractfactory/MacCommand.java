package designpatterns.abstractfactory;

public class MacCommand  extends Command {
    @Override
    public void executeCommand() {
        System.out.println("execute mac command here");
    }
}
