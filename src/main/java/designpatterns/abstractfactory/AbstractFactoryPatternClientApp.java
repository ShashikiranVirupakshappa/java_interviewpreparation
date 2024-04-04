package designpatterns.abstractfactory;

public class AbstractFactoryPatternClientApp {
    public static void main(String[] args) {
        //From SystemFactory, you will get an instance of LinuxFactory through factory of factories [OperatingSystemFactory] becoz LinuxFactory is an concrete class of
        //OperatingSystemFactory
        Command command = SystemFactory.getCommand(new LinuxFactory());
        Button button = SystemFactory.getButton(new MacFactory());
        command.executeCommand();
        button.drawButton();
    }
}
