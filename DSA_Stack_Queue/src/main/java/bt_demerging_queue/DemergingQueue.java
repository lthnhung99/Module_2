package bt_demerging_queue;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;

public class DemergingQueue {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0]=new Student("Nhung","Nữ","14/10/1999");
        students[1]=new Student("Nhật","Nam","15/11/1995");
        students[2]=new Student("Hải","Nam","15/12/1998");
        students[3]=new Student("Phượng","Nữ","14/10/1999");
        students[4]=new Student("Nhân","Nam","15/04/2000");
        ComparatorAge comparator = new ComparatorAge();
        Arrays.sort(students, comparator);
        System.out.println("Danh sách theo ngày sinh: ");
        for (Student student: students){
            System.out.println(student);
        }
        Queue<Student> male = new LinkedList<>();
        Queue<Student> female = new LinkedList<>();
        Queue<Student> data = new LinkedList<>();

        for (Student student: students){
            if (student.getGender() == "Female"){
                female.add(student);
            }
            if (student.getGender() == "Male"){
                male.add(student);
            }
        }
        while (!female.isEmpty()){
            data.add(female.remove());
        }
        while (!male.isEmpty()){
            data.add(male.remove());
        }


    }
}
