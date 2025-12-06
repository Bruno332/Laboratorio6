import java.util.Scanner;

import models.Course;
import models.OnlineCourse;
import models.OnSiteCourse;

public class Main {
    Scanner scanner;

    public static void main(String[] args) {
        new Main();
    }

    private Main() {
        scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de cursos a registar:");
        int count = scanner.nextInt();
        scanner.nextLine();

        Course[] courses = new Course[count];

        for (int i = 0; i < count; i++) {
            System.out.println("Curso #" + (i + 1));
            courses[i] = courseInput();
            System.out.println();
        }

        System.out.println("--- Información de cursos registrados ---");

        for (Course course : courses) {
           System.out.println(course.showInformation());
        }

        scanner.close();
    }

    private Course courseInput() {
        System.out.print("Type: ");
        String type = scanner.nextLine();

        System.out.print("Title: ");
        String title = scanner.nextLine();

        int duration = positiveNumberInput("Duration(hs): ");

        System.out.print("Professor: ");
        String professor = scanner.nextLine();

        if (type.toLowerCase().equals("online")) {
            System.out.print("Platform: ");
            String platform = scanner.nextLine();

            return new OnlineCourse(title, duration, professor, platform);
        } else {
            System.out.print("Room: ");
            String room = scanner.nextLine();

            int quota = positiveNumberInput("Quota: ");

            return new OnSiteCourse(title, duration, professor, room, quota);
        }
    }

    private int positiveNumberInput(String field) {
        int number;

        do {
            System.out.print(field);
            number = scanner.nextInt();
            scanner.nextLine();

            if (number < 0) {
                System.out.println("The number should not be negative");
            }
        } while (number < 0);

        return number;
    }
}
