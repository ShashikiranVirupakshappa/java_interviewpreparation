package cloning;

import java.util.ArrayList;
import java.util.List;

public class CloningMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        Customer customer = new Customer("Shashi", 35);
        Customer clonedCustomer = (Customer)customer.clone();

        System.out.println("intitial "+customer.hashCode() +" .... "+clonedCustomer.hashCode());        // this should be change in hashcode

        clonedCustomer.setCustomerName("Raj");        //changing the value of one of the property/state
        clonedCustomer.setAge(20);

        System.out.println("after changes to clonedCustomer properties "+customer.hashCode() +" .... "+clonedCustomer.hashCode());     //this should be change here also
        System.out.println(customer.getCustomerName()+" ... "+clonedCustomer.getCustomerName());  // this should be change here
        System.out.println(customer.getAge()+" ... "+clonedCustomer.getAge());  // this should be change here

        /*List<String> list = new ArrayList() {{{add("Java"); add("Python"); add("Javascript");}}};
        System.out.println(list);*/


    }
}
