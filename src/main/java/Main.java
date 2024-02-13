import controller.Controller;
import model.Student;
import model.Teacher;

/**
 * — Создать класс УчебнаяГруппа, содержащий в себе поля Преподаватель и список Студентов;
 * — Создать класс УчебнаяГруппаСервис, в котором реализована функция
 * (входные параметры - (Teacher, List<Strudent>))
 * формирования из Студентов и Преподавателя УчебнойГруппы и возвращения его;
 * — Создать метод в Контроллере, в котором агрегируются функции получения
 * списка студентов (их id) и преподавателя (его id) и формирования учебной группы,
 * путём вызова метода из сервиса;
 * — Всё вышеуказанное создать согласно принципам ООП, пройдённым на семинаре.
 * Формат сдачи: ссылка на гитхаб проект
 */


public class Main {
    Student student1 = new Student("Вася", 32);
    Student student2 = new Student("Петя", 19);
    Student student3 = new Student("Вадим", 21);
    Teacher teacher = new Teacher("Иван Иванович", 58);

    Controller controller = new Controller();

}
