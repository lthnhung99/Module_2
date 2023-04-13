package oopNote;

public class Person {
    /**private String name;
    private int age;
    // hàm khởi tạo không tham số
    public Person() {

    }
    // hàm khởi tạo 2 tham số
    //hàm khởi tạo có tên giống tên lớp
    //không có giá trị trả về
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public static void main () {
        Person person1 = new Person();

        //Person person1; //Khai báo biến
        //person1 = new Person();//Khởi tạo đối tượng
        person1 = new Person("tên",10);

    }*/

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
