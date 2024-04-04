package org.example;

public class StudentRecordDemo {


    public static StudentRecord getStudentRecord() {
        StudentRecord studRecord = new StudentRecord(2L, "Rajkiran", "raj@gmail.com", "");
        return studRecord;
    }

    public static void main(String[] args) {
        StudentRecord studentRecord1 = new StudentRecord(1L, "Shashi","shashi@gmail.com", "");
        StudentRecord studentRecord2 = new StudentRecord(1L, "Shashi","shashi@gmail.com", "");
        System.out.println(studentRecord1.equals(studentRecord2));
        System.out.println(studentRecord1.hashCode());
        System.out.println(studentRecord2.hashCode());
        studentRecord1.print();
        studentRecord1.show();

        studentRecord2.print();
        studentRecord2.show();


        StudentRecord.display();

        try {
            StudentRecord studentRecord1Cloned = studentRecord1.clone();
            System.out.println(studentRecord1Cloned.hashCode());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(StudentRecordDemo.getStudentRecord());
    }
}
