package bt_demerging_queue;

import java.util.Comparator;

public class ComparatorAge implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getDate().compareTo(o2.getDate());
    }
}
