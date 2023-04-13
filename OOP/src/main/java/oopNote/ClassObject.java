package oopNote;

public class ClassObject {
    public static void main(String[] args) {
        /** I.Khái niệm lớp, đối tượng, thuộc tính, phương thức
         1.Khái niệm lớp:
         - Lớp là đơn vị thực thi cơ bảntrong ngôn ngữ Java
         - Lớp quy định hình thức và các khả năng của cácđối tượng
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
         • Thuộc tính còn được gọi là instancevariable(biến của đối tượng)
         4. phương thức:
         • Constructor –phương thức khởi tạo: là một phương thức đặc biệt
         được sử dụng để khởi tạo các đối tượng của mộtlớp
         Constructor cótêntrùngvớitêncủa lớp
         • Một lớp có thể có nhiều constructor
         • Nếukhôngkhaibáo constructor cholớp thìmặcđịnhlớp đó cómột
         constructorkhôngcóthamsố
         ví dụ: personObj.method();
         II.Khai báo lớp, khai báo đối tượng
         1.Khai báo lớp:
         - Khai báo lớp đồngthời cũng là khai báo một kiểu dữ liệu mới để có
         thể khởi tạo cácđối tượng thuộc kiểu dữ liệu đó
         2.khai báo đối tượng:
         Bước 1:Khai báo biến
         VD: Person person1;
         Bước 2: Khởi tạo đối tượng
         VD: person1 = newPerson();
         III.Cách truy xuất đến thuộc tính đối tượng:
         Có thể truy xuất các thành phần của đối tượng thông qua biến trỏ
         đến đối tượng
         • Sử dụng dấu chấm(.)để truy xuất thuộc tính của đối tượng
         • Ví dụ:
         Person person1;
         person1 = new Person("John",20);
         System.out.println("Myname is: " + person1.name);
         System.out.println("My age is: "+ person1.age);
         IV.Tạo và sử dụng các đối tượng
         V.Quá trình tạo đối tượng, biến tham chiếu đến đối tượng"
         */
    }
}
