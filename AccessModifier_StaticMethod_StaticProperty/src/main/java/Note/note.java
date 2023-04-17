package Note;

public class note {
    /**
     I.Phân biệt 2 khái niệm biến tham trị và biến tham chiếu:
     - Biến tham trị là biến chứa giá trị trong vùng nhớ được cấp
     - Biến tham chiếu là biến chưa tham chiếu đến đối tượng trong vùng nhớ được cấp
     II.Package:
     • Package (gói) là cách để phân loại các lớp và interface thành các
     nhóm có liên quan đến nhau và tổ chức chúng thành cácđơn vị để
     quảnlý
     • Vídụ:java.io,java.net,java.security,java.util
     • Lập trình viên có thể tự định nghĩa các gói mới để tổ chức mã nguồn
     hợp lý
     *Tính chất của package
     • Có thể khai báo các gói con-subpackage(gói ở bên tronggói)
     • Không thể có 2lớp có cùng tên trong cùng 1 gói
     • Khi một lớp được khai báo bên trong một góithì cầnphải sử dụng
     tên của gói nếu muốn truy cập đến lớp đó
     • Tên của gói được viết bằng chữ thường
     • Các gói được cung cấp sẵn của Java được bắt đầu bằng từ java hoặc
     javax
     *Khai báo package
     • Cú pháp:package package_name;
     • Vídụ:package codegym;
     • Tên của package phải trùng với tên của thư mục chứa mã nguồn
     • Tên của subpackage phải lần lượt trùng với tên của các thư mục
     tương ứng, vídụ:
     package com.codegym.ui;
     *Từ khoá Import: để sử dụng các lớp được định nghĩa trong các package khác
     III.Access modifier là gì?
     Access modifier là các từ khoá được sử dụng để quy định mức độ truy cập đến lớp và các thành phần của lớp
     -   public: có thể truy cập từ bất cứ đâu;
     -   private: các phương thức và thuộc tính chỉ được phép truy xuất trong cùng một lớp;
     -   protected: các PT và thuộc tính được phép truy xuất trong cùng một lớp và ở các lớp con (kế thừa);
     -   default: nếu không có access modifier thì mức default sẽ được áp dụng.
     Lớp và các thành phần của lớp được truy xuất ở những nơi trong cùng một package
     -   Local Variables và Access Modifiers
     +   không thể áp dụng access modifier cho các biến cục bộ
     +   chỉ áp dụng được modifier là final
     IV.Từ khóa static:
     • Từ khoá static được sử dụng để khai báo các thuộc tính và phương
     thức của lớp (khác với thuộc tính và phương thức của đối tượng)
     • Các thành phần static trực thuộc lớp,tha yvì trực thuộc đối tượng
     • Biến static còn được gọi là biến của lớp (class variable)
     • Phương thức static còn được gọi là phương thức củal ớp (class
     method)
     • Có thể truy xuất các thành phần static bằng cách sử dụng lớp hoặc
     đối tượng
     • Không cần khởi tạo đối tượng vẫn có thể sử dụng các thành phần
     static
     *Static property
     • Cú pháp khai báo static property:
     modifier static data_type variable_name;
     • Vídụ:
     Khai báo biến static:
     class Application{
     public static String language = "english";
     }
     Truy xuất biến static:
     System.out.println("Current language: " + Application.language);
     *Static method
     • Cú pháp khai báo static method:
     modifier static data_type method_name(){
     //body
     }
     • Vídụ:
     • Khai báo phương thức static
     class Application{
     public static String getVersion(){
     return "1.0";
     }
     }
     • Gọi phương thức static
     System.out.println("Current version: " + Application.getVersion());
     V. khái niệm Nested class, local class:
     - Nested class là lớp được khai báo bên trong lớp khác
     Ví dụ:Inner là một nested class của Outer,
           có thể truy cập vào biến x và y của Outer
     class Outer {
     private int x;
     private static int y;
     public class Inner {
     public void doSomething() {
     x = 1;
     y = 1;
     }
     }
     }
     - Local class là lớp được khai báo bên trong một khối lệnh
     Ví dụ: Local là một local class được khai báo bên trong phương thức doSomething(),
     và có thể truy cập vào biến cục bộ x.
     public void doSomething() {
     int x = 1;
     class Local {
     public void printX() {
     System.out.println(x);
     }
     }
     Local l = new Local();
     l.printX();
     }

     *Stack:
     Stack là nơi lưu trữ các biến cục bộ,
     tham số và các giá trị nguyên thủy của phương thức.
     Nó được sử dụng để quản lý các phương thức và các biến được tạo bên trong chúng.
     Khi một phương thức được gọi, một khung stack mới được tạo ra,
     và khi phương thức kết thúc thì khung stack đó bị xóa.
     *Heap:
     Heap là nơi lưu trữ các đối tượng và các biến được tạo động trong chương trình Java.
     Khi một đối tượng được tạo,nó được lưu trữ trong heap
     và một con trỏ trỏ đến địa chỉ đối tượng đó được lưu trong stack.
     */
}
