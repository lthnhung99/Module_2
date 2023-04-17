package Note;

public class Person {
    private String name;
    private int age;
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age =age;
    }
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("John");
        person.setAge(18);
        System.out.println("My name is: "+ person.getName());
        System.out.println("My age is: "+ person.getAge());
    }
}
