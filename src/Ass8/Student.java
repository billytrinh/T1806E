package Ass8;

public class Student {
    public int ID;
    public String Name;
    public int Age;
    public String  Address;
    public float Gpa;

    public Student(int ID, String name, int age, String address, float gpa) {
        this.ID = ID;
        Name = name;
        Age = age;
        Address = address;
        Gpa = gpa;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public float getGpa() {
        return Gpa;
    }

    public void setGpa(float gpa) {
        Gpa = gpa;
    }
}
