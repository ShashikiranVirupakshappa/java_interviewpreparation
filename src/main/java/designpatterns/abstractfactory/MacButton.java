package designpatterns.abstractfactory;

public class MacButton extends Button {
    @Override
    public void drawButton() {
        System.out.println("drawing mac button here");
    }
}
