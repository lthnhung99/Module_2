package oopNote;

public class ClassObject {
    public static void main(String[] args) {
        /** I.Khái niệm lớp, đối tượng, thuộc tính, phương thức
         1.Khái niệm lớp:
         - Lớp là đơn vị thực thi cơ bảntrong ngôn ngữ Java
         - Lớp quy định hình thức và các khả năng của các đối tượng
         Cú pháp:
         class class_name {
         //class body
         }
         2. đối tượng:
         • Có thể khởi tạo đối tượng của một lớp sau khi lớp đó được khai báo
         • Sử dụng từ khoá new để khởi tạo đối tượng
         class_name object_name = new class_name;
         class_name: tên lớp
         new: từ khoá để khởi tạo
         object_name: tên biến chứa tham chiếu đến đối tượng
         3.thuộc tính
         Các thuộc tính mô tả các đặc điểm của đối tượng
         • Thuộc tính còn được gọi là instance variable(biến của đối tượng)
         • Cú pháp:
         access_modifier data_type property_name
         ví dụ: public String name;
                public int age;
         4. phương thức:
         • Constructor –phương thức khởi tạo: là một phương thức đặc biệt
         được sử dụng để khởi tạo các đối tượng của mộtlớp
         Constructor có tên trùng với tên của lớp
         • Một lớp có thể có nhiều constructor
         • Nếu không khai báo constructor cho lớp thì mặc định lớp đó có một
         constructor không có tham số
         ví dụ:
         //hàm khởi tạo không có tham số
         public Person() {
         name = "No name";
         age = 10;
         }
         // hàm khởi tạo 2 tham số
         public Person (String s, int n){
         name = s;
         age = n;
         }
         II.Khai báo lớp, khai báo đối tượng
         1.Khai báo lớp:
         - Khai báo lớp đồng thời cũng là khai báo một kiểu dữ liệu mới để có
         thể khởi tạo các đối tượng thuộc kiểu dữ liệu đó
         2.khai báo đối tượng:
         vd: Person person = new Person();
         Bước 1:Khai báo biến
         VD: Person person1;
         Bước 2: Khởi tạo đối tượng
         VD: person1 = newPerson();
         III.Cách truy xuất đến thuộc tính đối tượng:
         Có thể truy xuất các thành phần của đối tượng thông qua biến trỏ
         đến đối tượng
         • Sử dụng dấu chấm(.)để truy xuất thuộc tính của đối tượng
         ***this:   Đại diện cho đối tượng hiện tại
         Nếu muốn constructor nào đó gọi đến một constructor khác
         Sử dụng this.field để phân biệt field với tham số của phương thức và các biến cục bộ khác
         truy xuất tới các thành phần của đối tượng hiện tại
         • Ví dụ:
         Person person1;
         person1 = new Person("John",20);
         System.out.println("My name is: " + person1.name);
         System.out.println("My age is: "+ person1.age);
         IV.Khai báo getter/setter
         • Cú pháp khai báo getter:
         public returnType getPropertyName()
         • Đối với các thuộc tính kiể uboolean thì tên getter bắt đầu bằng chữ is:
         public boolean isPropertyName()
         • Cú pháp khai báo setter:
         public void setPropertyName(dataType propertyValue)
         ví dụ:
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

         */
    }
}
