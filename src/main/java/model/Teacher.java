package model;

public class Teacher extends User{
    private int teacherId;
    public Teacher(String name, int age) {
        super(name, age);
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
