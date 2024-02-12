package service;

import model.Student;
import model.Teacher;

import java.util.List;

public interface StudyGroupService {

    static StudyGroup createStudyGroup(Teacher teacher, List<Student> studentList) {
        StudyGroup studyGroup = new StudyGroup(teacher, studentList);
        return studyGroup;
    }

}
