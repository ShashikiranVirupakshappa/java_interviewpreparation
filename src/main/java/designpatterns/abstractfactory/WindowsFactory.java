package designpatterns.abstractfactory;

public class WindowsFactory extends OperatingSystemFactory {

    @Override
    public Command createCommand() {
        return new WindowsCommand();
    }

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
