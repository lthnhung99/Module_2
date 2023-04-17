package Bai_tap;

public class Student {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Linda");
        student.setClazz("CO5");
        System.out.println(student.toString());
    }
    private String name = "John";
    private String clazz = "C02";
    public Student() {

    }
    public void setName(String name){
        this.name = name;
    }
    public void setClazz(String clazz) {
        this.clazz=clazz;
    }
    public String toString() {
        return "Student  " + "name: " + name + ", clazz: " + clazz;
    }
}
