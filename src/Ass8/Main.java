package Ass8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        ArrayList<Student> studentArrayList = new ArrayList<Student>();
        studentArrayList.add(new Student(1,"Le van A",
                12,"12 quang trung",(float)2.12));
        studentArrayList.add(new Student(2,"Le van B",
                13,"12 quang trung",(float)3.12));
        Main.sortByGPA(studentArrayList);
        Main.sortByName(studentArrayList);
    }

    public static void sortByGPA(ArrayList<Student> studentArrayList){
        Collections.sort(studentArrayList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getGpa()-o2.getGpa() < 0){
                    return -1;
                }else {
                    return 1;
                }
            }
        });
        for (Student student:studentArrayList){
            System.out.println(student.getID()+student.getName()+student.getGpa());
        }
    }

    public static void sortByName(ArrayList<Student> studentArrayList){
        Collections.sort(studentArrayList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
               return o1.getName().compareTo(o2.getName());
            }
        });
        for (Student student:studentArrayList){
            System.out.println(student.getID()+student.getName()+student.getGpa());
        }
    }

}
