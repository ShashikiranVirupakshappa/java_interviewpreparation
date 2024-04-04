package org.example;

public record StudentRecord(Long id, String studentName, String studentEmail, String instanceField1) implements CustomInterface,Cloneable {

    public static int counter;

    static {
        System.out.println("studentrecord static block called");
    }

    static {
        System.out.println("another static block");
    }

    public void defaultMethod() {
        System.out.println("this is defaault method");
    }

    public StudentRecord(String studentName, String studentEmail) {
        this(null, studentName, studentEmail,null);
    }

    public StudentRecord(Long id, String studentName, String studentEmail, String instanceField1){
        this.id = id;
        this.studentName = studentName;
        this.studentEmail = studentEmail;
        this.instanceField1 = instanceField1;
    }

    public StudentRecord(String studentEmail) {
        this(null, null, studentEmail, null);
    }

    @Override
    public void print() {
        System.out.println("StudentRecord print");
    }

    public void show() {
        System.out.println("StudentRecord show");
    }

    public static void display() {
        System.out.println("StudentRecord display");
    }

    @Override
    protected StudentRecord clone() throws CloneNotSupportedException {
        return (StudentRecord) super.clone();
    }
}
