package ArrayDemo;

import java.util.Calendar;

public class StringFormatDemo {
    public static void main(String[] args) {
        /**
         * %s : strings (Định dạng chuỗi)
         * %d : decimal integers (Định dạng số nguyên)
         * %f : floating-point numbers (Định dạng số thực)
         * %b : booleans (true/false)
         * %c : characters (Định dạng ký tự)
         * %tT : date/time values. (Định dạng thời gian thực, đầy đủ giờ, phút, giây)
         * %n : line separator (xuống dòng)
         */

        /**
         // giá trị của số nguyên 15
         System.out.printf("Integer : %d\n", 15);
         //giá trị của số thực 1.21312939123 được làm tròn đến 3 chữ số thập phân
         System.out.printf("Floating point number with 3 decimal digits: %.3f \n", 1.21312939123);
         // giá trị của số thực 1.21312939123 được làm tròn đến 8 chữ số thập phân
         System.out.printf("Floating point number with 8 decimal digits: %.8f \n", 1.21312939123);
         //chuỗi "Hello World" giá trị số nguyên 89 và giá trị số thực 9.231435
         System.out.printf("String: %s, integer: %d, float: %.6f \n", "Hello World", 89, 9.231435);
         //các giá trị được sắp xếp lại và in ra theo thứ tự:
         // "c" ở vị trí thứ nhất,
         // "a" ở vị trí thứ hai,
         // "d" ở vị trí thứ ba,
         // "b" ở vị trí thứ tư.
         //System.out.printf("Re-order output %4$2s %1$2s %3$2s %2$2s \n", "a", "b", "c", "d");


         //        System.out.printf("%-12s%-12s%s\n","Column 1","Column 2","Column3");
         //        System.out.printf("%-12d%-12d%07d\n", 15, 12, 5);

         //        System.out.printf("%-12s%-12s%s\n","Column 1","Column 2","Column3");
         //        System.out.printf("%-12.5s%s", "Hello World","World");

         //        System.out.printf("%-12s%-12s\n","Column 1","Column 2");
         //        System.out.printf("%-12.5f%.20f", 12.23429837482,9.10212023134);

         Calendar cal = Calendar.getInstance();
         cal.set(2017, 11, 4);

         // Format the month.
         System.out.printf("Month: %1$tB %1$tb %1$tm \n", cal);

         // Format the day.
         System.out.printf("Day: %1$tA %1$ta %1$td \n", cal);

         // Format the year.
         System.out.printf("Year: %1$tY %1$ty %1$tj \n", cal);

         // Format the hour.
         System.out.printf("Hour: %1$tH %1$tI %1$tk %1$tl \n", cal);

         // Format minute.
         System.out.printf("Minute: %1$tM \n", cal);

         // Format the second.
         System.out.printf("Second: %1$tS \n", cal);

         // Format the am and pm part.
         System.out.printf("AM/PM: %1$tp \n", cal);
         */

    }
}







