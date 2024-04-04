package designpatterns.abstractfactory;

public class WindowsCommand extends Command {

    @Override
    public void executeCommand() {
        System.out.println("execute windows command here");
    }
}
