package ArrayDemo;

public class NoteWrapperClass {
    /**
    Chúng ta đã được biết về các kiểu dữ liệu nguyên thuỷ trong java như int, long, float etc.
    Các kiểu dữ liệu nguyên thuỷ này không có tác dụng gì ngoài lưu trữ các giá trị,
    nếu chúng ta muốn chuyện một số int sang String,
    hoặc là khởi tại một số nguyên bởi một chuỗi số thì điều này là không thể.

    Vì thế java đã cung cấp cho chúng ta Wrapper class tương ứng với từng kiểu dữ liệu.
    Các Wrapper class này chứa các kiểu tương ứng đồng thời cung cấp cho chúng ta vô số method hữu ích.

    Wrapper class gồm:(kiểu nguyên thủy - kiểu đối tượng)
    boolean - Boolean
    char - Character
    byte - Byte
    short - Short
    int - Integer
    long - Long
    float - Float
    double - Double

    Ngoài ra, autoboxing sẽ tự động chuyển từ kiểu nguyên thủy thành kiểu đối tượng
    và ngược lại unboxing chuyển từ kiểu đối tượng sang kiểu nguyên thủy.
    Ví dụ chuyển kiểu dữ liệu nguyên thủy thành kiểu Wrapper:
    public class WrapperExample1 {
        public static void main(String args[]) {
            // Đổi int thành Integer
            int a = 20;
            Integer i = Integer.valueOf(a);// đổi int thành Integer
            Integer j = a;// autoboxing, tự động đổi int thành Integer trong nội bộ trình biên dịch

            System.out.println(a + " " + i + " " + j);
        }
    }
//===>20 20 20
    Ví dụ chuyển kiểu Wrapper thành kiểu dữ liểu nguyên thủy:
    public class WrapperExample2 {
        public static void main(String args[]) {
            // đổi Integer thành int
            Integer a = new Integer(3);
            int i = a.intValue();// đổi Integer thành int
            int j = a;// unboxing, tự động đổi Integer thành int trong nội bộ trình biên dịch

            System.out.println(a + " " + i + " " + j);
        }
    }
//===>3 3 3
}
