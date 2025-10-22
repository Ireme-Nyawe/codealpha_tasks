import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class GradeTracker {
    private ArrayList<Student> students;

    public GradeTracker() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displaySummary() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        System.out.println("\nStudent Grade Summary:");
        for (Student s : students) {
            System.out.println("Name: " + s.getName());
            System.out.println("Grades: " + s.getGrades());
            System.out.printf("Average: %.2f | Highest: %.2f | Lowest: %.2f%n",
                    s.getAverage(), s.getHighestGrade(), s.getLowestGrade());
            System.out.println("-------------------------------------------");
        }

        System.out.printf("Whole Class Average: %.2f%n", getClassAverage());
        System.out.printf("Highest Grade in Class: %.2f%n", getOverallHighest());
        System.out.printf("Lowest Grade in Class: %.2f%n", getOverallLowest());
    }

    public double getClassAverage() {
        if (students.isEmpty()) return 0;
        double total = 0;
        for (Student s : students) total += s.getAverage();
        return Math.round((total / students.size()) * 100.0) / 100.0;
    }

    public double getOverallHighest() {
        double max = 0;
        for (Student s : students)
            if (s.getHighestGrade() > max)
                max = s.getHighestGrade();
        return max;
    }

    public double getOverallLowest() {
        if (students.isEmpty()) return 0;
        double min = students.get(0).getLowestGrade();
        for (Student s : students)
            if (s.getLowestGrade() < min)
                min = s.getLowestGrade();
        return min;
    }

    public String generateFilename() {
        String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        return "report_" + date + ".txt";
    }

    public void saveToFile() {
        String filename = generateFilename();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            bw.write("STUDENT GRADE REPORT\n");
            for (Student s : students) {
                bw.write("Name: " + s.getName() + "\n");
                bw.write("Grades: " + s.getGrades() + "\n");
                bw.write(String.format("Average: %.2f%n", s.getAverage()));
                bw.write(String.format("Highest: %.2f%n", s.getHighestGrade()));
                bw.write(String.format("Lowest: %.2f%n", s.getLowestGrade()));
                bw.write("-------------------------------------------\n");
            }
            bw.write(String.format("Class Average: %.2f%n", getClassAverage()));
            bw.write(String.format("Highest Grade in Class: %.2f%n", getOverallHighest()));
            bw.write(String.format("Lowest Grade in Class: %.2f%n", getOverallLowest()));
            bw.write("End of Report Summary.\n");

            System.out.println("Report successfully saved to " + filename);

        } catch (IOException e) {
            System.out.println("Error saving report: " + e.getMessage());
        }
    }

}
