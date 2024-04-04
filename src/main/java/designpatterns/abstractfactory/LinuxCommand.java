package designpatterns.abstractfactory;

public class LinuxCommand  extends Command {

    @Override
    public void executeCommand() {
        System.out.println("execute linux command here");
    }
}
