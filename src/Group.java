import people.Student;
import people.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String subject;
    private Teacher teacher;
    private List<Student> students = new ArrayList();
    //Student[] students2 = new Student[10];


    public Group(String subject, Teacher teacher, Student... students) {
        this.subject = subject;
        this.teacher = teacher;
        this.students.addAll(List.of(students));
    }

    public String getSubject() {
        return this.subject;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }
}
