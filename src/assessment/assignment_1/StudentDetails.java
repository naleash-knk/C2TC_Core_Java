package assessment.assignment_1;

import java.util.Scanner;

public class StudentDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your full name with initial:");
        String fullName = scanner.nextLine();

        System.out.println("Enter your roll number:");
        String rollNumber = scanner.nextLine();

        System.out.println("Enter your grade:");
        String grade = scanner.nextLine();

        System.out.println("Enter your percentage:");
        String percentage = scanner.nextLine();

        System.out.println("\n--- Student Details ---");
        System.out.println(fullName);
        System.out.println(rollNumber);
        System.out.println(grade);
        System.out.println(percentage);

        scanner.close();
    }
}
