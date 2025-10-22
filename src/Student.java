import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Double> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addGrade(double grade) {
        grades.add(grade);
    }

    public double getAverage() {
        if (grades.isEmpty()) return 0;
        double sum = 0;
        for (double g : grades) sum += g;
        return Math.round((sum / grades.size()) * 100.0) / 100.0;
    }

    public double getHighestGrade() {
        if (grades.isEmpty()) return 0;
        double max = grades.get(0);
        for (double g : grades) if (g > max) max = g;
        return max;
    }

    public double getLowestGrade() {
        if (grades.isEmpty()) return 0;
        double min = grades.get(0);
        for (double g : grades) if (g < min) min = g;
        return min;
    }

    public ArrayList<Double> getGrades() {
        return grades;
    }
}
