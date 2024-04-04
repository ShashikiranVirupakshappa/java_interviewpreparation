package designpatterns.abstractfactory;

public class LinuxButton extends Button {
    @Override
    public void drawButton() {
        System.out.println("drawing linux button here");
    }
}
