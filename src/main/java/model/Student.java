package model;

public class Student extends User {
    private int studentId;
    public Student(String name, int age) {
        super(name, age);
    }

    public int getStudentId() {
        return studentId;
    }
}
