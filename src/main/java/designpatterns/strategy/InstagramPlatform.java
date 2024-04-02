package designpatterns.strategy;

public class InstagramPlatform implements ConnectIn {

    @Override
    public void connectIn(String friendName) {
        System.out.println("connecting with "+friendName+" in instagram platform");
    }
}
