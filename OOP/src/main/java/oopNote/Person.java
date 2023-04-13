package oopNote;

public class Person1 {
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
    public static void main(String[] args) {
        Person1 person = new Person();
        person.setName("John");
        System.out.println("My name is: "+ person.getName());
    }
    class Person1{
        private String name;
        public void setName(String name) {
            this.name = name;
        }
        public String getName() {
            return this.name;
        }
    }
}
