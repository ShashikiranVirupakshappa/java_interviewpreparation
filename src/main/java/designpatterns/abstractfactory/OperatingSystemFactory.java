package designpatterns.abstractfactory;



public abstract class OperatingSystemFactory {
        public abstract Command createCommand();
        public abstract Button createButton();
}
