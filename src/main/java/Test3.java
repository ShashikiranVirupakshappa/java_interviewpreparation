import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    String name;
    String city;

    public Employee(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

public class Test3 {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee("Sai", "Hyd"));
        employeeList.add(new Employee("Arun", "Pune"));
        employeeList.add(new Employee("Sam", "Pune"));
        employeeList.add(new Employee("Raju", "Pune"));
        employeeList.add(new Employee("Amar", "Hyd"));

        employeeList.stream().collect(Collectors.groupingBy(Employee::getCity)).forEach((s, employees) -> {
            System.out.println(s+" = "+employees.stream().map(Employee::getName).collect(Collectors.toList()));
        });

    }
}
