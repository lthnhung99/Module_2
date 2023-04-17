package org.example;

public class Student {
    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(1,"A");
        Student s2 = new Student(2,"B");
        Student s3 = new Student(3,"C");
        s1.display();
        s2.display();
        s3.display();
    }
    private int rollno;
    private String name;
    private static String college = "BBDIT";
    Student(int r, String n) {
        rollno = r;
        name = n;
    }
    static void change() {
        college = "CODEGYM";
    }
    void display() {
        System.out.println(rollno + " " + name + " "+ college);
    }


}
