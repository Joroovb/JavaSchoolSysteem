import people.Person;
import people.Student;
import people.Teacher;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student joris = new Student("Joris", 30, "joris@joris.nl");
        Teacher joris2 = new Teacher("Joris", 30, "joris2@joris.nl");
        Student melinoe = new Student("Melinoe", 4, "melinoe@joris.nl");
        Group group = new Group("Java", joris2, joris, melinoe);

        ReportGenerator generator = new ReportGenerator();
        String report = generator.generateReport(joris);
        System.out.println(report);

        report = generator.generateReport(joris2);
        System.out.println(report);

        report = generator.generateReport(group);
        System.out.println(report);

        Scanner in = new Scanner(System.in);

        loop: while (true) {
            System.out.println("Press 'l' to list group details.");
            System.out.println("Press 'q' to quit.");
            String input = in.next();

            switch (input) {
                case "l":
                    String report2 = generator.generateReport(group);
                    System.out.println(report2);
                    break;

                case "n":
                    String name = in.next();
                    int leeftijd = in.nextInt();
                    String email = in.next();
                    Student p = new Student(name, leeftijd, email);
                    group.addStudent(p);
                    break;
                case "q":
                    System.out.println("Goodbye!");
                    break loop;
            }
        }
    }
}