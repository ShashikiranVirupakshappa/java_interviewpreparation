package designpatterns.factory;

public class CheesePizza  extends Pizza {

    public CheesePizza(String size, String type) {
        super(size, type);
    }
    @Override
    public void toppings() {
        System.out.println("it will have cheese toppings");
    }

    @Override
    public double price() {
        if(getSize().equals("small"))
            return 200;
        else if(getSize().equals("medium"))
            return 400;
        else if(getSize().equals("large"))
            return 600;
        else
            return 0.0;
    }
}
