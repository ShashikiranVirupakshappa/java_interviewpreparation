package designpatterns.strategy;

public class TwitterPlatform implements ConnectIn {
    @Override
    public void connectIn(String friendName) {
        System.out.println("connecting with "+friendName+" in twitter platform");
    }
}
