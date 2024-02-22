import people.Person;
import people.Student;
import people.Teacher;

public class ReportGenerator {
    String generateReport(Person person) {
        StringBuilder sb = new StringBuilder();

        sb.append("Information:\n");
        sb.append("\tName: " + person.getName() + "\n");
        sb.append("\tAge: "+ person.getAge() + "\n");
        sb.append("\tEmail: " + person.getEmail() + "\n");

        return sb.toString();
    }

    String generateReport(Group group) {
        StringBuilder sb = new StringBuilder();
        sb.append("Group information:\n");
        sb.append("\tsubject: " + group.getSubject() + "\n");
        sb.append("\tteacher: " + group.getTeacher().getName() + "\n");
        sb.append("\tstudents:\n");
        for (Student student : group.getStudents()){
            sb.append("\t- " + student.getName() + "\n");
        }

        // Group information:
        //      teacher: <NAME TEACHER>
        //      student:
        //      - <NAME STUDENT>
        //      - <NAME STUDENT>
        //      - <NAME STUDENT>

        return sb.toString();
    }

//    String generateReport(Student student) {
//        StringBuilder sb = new StringBuilder();
//
//        sb.append("Information:\n");
//        sb.append("\tName: " + student.name + "\n");
//        sb.append("\tAge: "+ student.age + "\n");
//        sb.append("\tEmail: " + student.email + "\n");
//        sb.append("\tNumber: " + student.number + "\n");
//
//        return sb.toString();
//    }
}
