package designpatterns.abstractfactory;

public class WindowsButton extends Button {
    @Override
    public void drawButton() {
        System.out.println("drawing windows button here");
    }
}
