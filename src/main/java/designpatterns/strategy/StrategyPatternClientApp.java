package designpatterns.strategy;

public class StrategyPatternClientApp {
    public static void main(String[] args) {
        ConnectIn instagramPlatform = new InstagramPlatform();
        SocialNetworkingPlatform socialNetworkingPlatform =
                new SocialNetworkingPlatform("Shashikiran","Virupakshappa", 36);
        socialNetworkingPlatform.setPlatformStrategy(instagramPlatform);
        String friendName = "Ravi";
        socialNetworkingPlatform.connectIn(friendName);
        socialNetworkingPlatform.displayAge();
        socialNetworkingPlatform.displayFullName();

        System.out.println("===================================================================================");

        ConnectIn linkedInPlatform = new LinkedInPlatform();
        socialNetworkingPlatform = new SocialNetworkingPlatform("Rajkiran", "Ettigi", 34);
        socialNetworkingPlatform.setPlatformStrategy(linkedInPlatform);
        friendName = "Santosh";
        socialNetworkingPlatform.connectIn(friendName);
        socialNetworkingPlatform.displayFullName();
        socialNetworkingPlatform.displayAge();
    }
}
