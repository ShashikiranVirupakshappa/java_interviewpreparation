package operatorsandassignments;

public class NewInstanceTest {
    public NewInstanceTest() {
        System.out.println("constructor called");
    }

    public static void main(String[] args) {
        try {
             Class dyanamicClass = Class.forName(args[0]);
             Object o = dyanamicClass.newInstance();
             System.out.println(o.getClass().getName());
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
