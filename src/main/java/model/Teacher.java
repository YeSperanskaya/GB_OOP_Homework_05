package model;

public class Teacher extends User{
    int teacherId;
    public Teacher(String name, int age) {
        super(name, age);
    }

    public int getTeacherId() {
        return teacherId;
    }
}
