package designpatterns.factory;

public class MozzarellaPizza extends Pizza {

    public MozzarellaPizza(String size, String type) {
        super(size, type);
    }

    @Override
    public void toppings() {
        System.out.println("it will have mozerella toppings");
    }

    @Override
    public double price() {
        if(getSize().equals("small"))
            return 150;
        else if(getSize().equals("medium"))
            return 300;
        else if(getSize().equals("large"))
            return 450;
        else
            return 0.0;
    }
}
