package designpatterns.factory;

public class FactoryPatternClientApp {
    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new PizzaFactory();
        String size = "large";
        String type = "Cheese";
        Pizza pizza = pizzaFactory.getPizza(size, type);
        pizza.toppings();
        System.out.println("price of a "+size+" size "+type+" pizza is "+pizza.price());

        size = "small";
        type = "Mozzarella";
        pizza = pizzaFactory.getPizza(size, type);
        pizza.toppings();
        System.out.println("price of a "+size+" size "+type+" pizza is "+pizza.price());
    }
}
