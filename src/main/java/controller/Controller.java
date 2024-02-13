package controller;

import model.Student;
import model.Teacher;
import service.DataStudyGroup;

import java.util.List;

public class Controller {
    private List<Student> studentList;
    private List<Teacher> teacherList;

    public Controller() {

    }

    /**
     * Создать метод в Контроллере, в котором агрегируются функции получения
     * списка студентов (их id) и преподавателя (его id) и формирования учебной группы,
     * путём вызова метода из сервиса;
     */


    public List<Student> createArrayStudent (Student student) {
        student.setStudentId(studentList.size()+1);
        studentList.add(student);
        return studentList;
    }

    public Teacher createArrayTeacher(Teacher teacher) {
        teacher.setTeacherId(teacherList.size()+1);
        teacherList.add(teacher);
        return teacher;
    }

    public DataStudyGroup createStudyGroup(Teacher teacher) {
        DataStudyGroup studyGroup = new DataStudyGroup(teacher, studentList);
        return studyGroup;
    }
}
