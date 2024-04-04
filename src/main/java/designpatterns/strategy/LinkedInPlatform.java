package designpatterns.strategy;

public class LinkedInPlatform implements ConnectIn {
    @Override
    public void connectIn(String friendName) {
        System.out.println("connecting with "+friendName+" in linkedin platform");
    }
}
