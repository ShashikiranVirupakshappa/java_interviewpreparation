package designpatterns.strategy;

public class SocialNetworkingPlatform implements  ConnectIn {
    private String firstName;

    private String lastName;

    private Integer age;

    private ConnectIn platformStrategy;

    public SocialNetworkingPlatform(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setPlatformStrategy(ConnectIn platformStrategy) {
        this.platformStrategy = platformStrategy;
    }

    public void displayFullName() {
        System.out.println("Hello "+this.firstName+" "+this.lastName);
    }


    public void displayAge() {
        System.out.println("Age: "+this.age);
    }

    public void connectIn(String friendName) {
        platformStrategy.connectIn(friendName);
    }
}
