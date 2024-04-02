package designpatterns.factory;

public class PizzaFactory {
    public Pizza getPizza(String size, String type){
        if(type.equals("Cheese"))
            return new CheesePizza(size, type);
        else if(type.equals("Mozzarella"))
            return new MozzarellaPizza(size, type);
        else
            return null;
    }
}
