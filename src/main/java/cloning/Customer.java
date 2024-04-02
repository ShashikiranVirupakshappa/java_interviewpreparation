package cloning;

public class Customer implements Cloneable {
    private String customerName;
    private int age;

    public Customer(String customerName, int age) {
        this.customerName = customerName;
        this.age = age;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    protected Object clone() throws CloneNotSupportedException{
        Customer c = (Customer)super.clone();
        return c;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Customer customer = new Customer("Shashi", 35);
        Customer clonedCustomer = (Customer)customer.clone();

        System.out.println("intitial "+customer.hashCode() +" .... "+clonedCustomer.hashCode());        // this should be change in hashcode

        clonedCustomer.setCustomerName("Raj");        //changing the value of one of the property/state
        clonedCustomer.setAge(20);

        System.out.println("after changes to clonedCustomer properties "+customer.hashCode() +" .... "+clonedCustomer.hashCode());     //this should be change here also
        System.out.println(customer.getCustomerName()+" ... "+clonedCustomer.getCustomerName());  // this should be change here
        System.out.println(customer.getAge()+" ... "+clonedCustomer.getAge());  // this should be change here
    }
}
