package bt_demerging_queue;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Student {
    private String name;
    private String gender;
    private LocalDate date;


    public Student(String name, String gender, String date) {
        this.name = name;
        this.gender = gender;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.date = LocalDate.parse(date, formatter);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Tên: " + getName() + "; Giới tính: " + getGender() + "; Ngày tháng năm sinh: " + getDate();
    }
}
