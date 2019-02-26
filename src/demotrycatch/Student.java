package demotrycatch;

import java.time.LocalDate;

public class Student {
    public String name;
    public LocalDate birthday;
    public int mark;

    public Student(String name,LocalDate birthday,int mark){
        this.name = name;
        this.birthday = birthday;
        this.mark = mark;
    }
}
