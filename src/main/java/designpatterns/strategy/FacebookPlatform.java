package designpatterns.strategy;

public class FacebookPlatform implements ConnectIn {
    @Override
    public void connectIn(String friendName) {
        System.out.println("connecting with "+friendName+" in facebook platform");
    }
}
