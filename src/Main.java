import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GradeTracker tracker = new GradeTracker();

        System.out.print("Enter the number of grades each student should have: ");
        int gradeCount = sc.nextInt();
        sc.nextLine();

        while (true) {
            System.out.println("\nSTUDENT GRADE TRACKER APP FUNCTIONALITY:");
            System.out.println("1. Add Student");
            System.out.println("2. View Summary");
            System.out.println("3. Save and Exit");
            System.out.print("Choose an option(Enter number 1-3 corresponding to your choice) : ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter student name: ");
                    String name = sc.nextLine();
                    Student student = new Student(name);

                    for (int i = 1; i <= gradeCount; i++) {
                        System.out.print("Enter grade " + i + "(0-100): ");
                        double grade = sc.nextDouble();
                        sc.nextLine();
                        if (grade < 0 || grade > 100) {
                            System.out.println("Grade must be between 0 and 100. Try again.");
                            i--;
                        } else {
                            student.addGrade(Math.round(grade * 100.0) / 100.0);
                        }
                    }

                    tracker.addStudent(student);
                    System.out.println("Student record added successfully.");
                }

                case 2 -> tracker.displaySummary();

                case 3 -> {
                    tracker.saveToFile();
                    System.out.println("Program finished.");
                    sc.close();
                    System.exit(0);
                }

                default -> System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
