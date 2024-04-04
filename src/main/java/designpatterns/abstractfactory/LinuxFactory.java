package designpatterns.abstractfactory;

public class LinuxFactory extends OperatingSystemFactory {
    @Override
    public Command createCommand() {
        return new LinuxCommand();
    }

    @Override
    public Button createButton() {
        return new LinuxButton();
    }
}
