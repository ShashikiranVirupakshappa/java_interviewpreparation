package designpatterns.abstractfactory;

public class SystemFactory {
    public static Command getCommand(OperatingSystemFactory operatingSystemFactory) {
       /* if(operatingSystemFactory instanceof WindowsFactory)
            return new WindowsFactory();
        else if(operatingSystemFactory instanceof LinuxFactory)
            return new LinuxFactory();
        else if(operatingSystemFactory instanceof MacFactory)
            return new MacFactory();
        else
            return null;*/
        return operatingSystemFactory.createCommand();
    }

    public static Button getButton(OperatingSystemFactory operatingSystemFactory) {
       /* if(operatingSystemFactory instanceof WindowsFactory)
            return new WindowsFactory();
        else if(operatingSystemFactory instanceof LinuxFactory)
            return new LinuxFactory();
        else if(operatingSystemFactory instanceof MacFactory)
            return new MacFactory();
        else
            return null;*/
        return operatingSystemFactory.createButton();
    }
}
