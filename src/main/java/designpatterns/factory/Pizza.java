package designpatterns.factory;

public abstract class Pizza {
    private String size;
    private String type;

    public Pizza() {

    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Pizza(String size, String type) {
        this.size=size;
        this.type=type;
    }

    public abstract  void toppings();
    public abstract  double price();
}
