package designpatterns.abstractfactory;

public class MacFactory extends OperatingSystemFactory {
    @Override
    public Command createCommand() {
        return new MacCommand();
    }

    @Override
    public Button createButton() {
        return new MacButton();
    }


}
