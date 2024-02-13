package controller;

import model.Student;
import model.Teacher;
import model.User;
import service.DataStudent;
import service.DataTeacher;
import view.StudentView;
import view.TeacherView;

import java.util.List;

public class Controller {
    private DataTeacher dataTeacher;
    private DataStudent dataStudent;
    private StudentView studentView;
    private TeacherView teacherView;

    public void start() {
        User user1 = new Student("Юрий", 21, 4.5);
        User user2 = new Teacher("Иван", 40, "math");
        User user3 = new Student("Bill",20, 5.0);
        createStudent(user1);
        createTeacher(user2);
        createStudent(user3);
        List<Student> studentList = dataStudent.read();
        studentView.printStudent(studentList);

    }


    /**
     * Создать метод в Контроллере, в котором агрегируются функции получения
     * списка студентов (их id) и преподавателя (его id) и формирования учебной группы,
     * путём вызова метода из сервиса;
     */
    public Student createStudent(User user) {
        return dataStudent.create(user);
    }
    public Teacher createTeacher(User user) {
        return dataTeacher.create(user);
    }



}
