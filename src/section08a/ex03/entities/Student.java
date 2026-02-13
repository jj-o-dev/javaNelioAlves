package section08a.ex03.entities;

public class Student {
    private String name;
    private double grade1;
    private double grade2;
    private double grade3;

    public Student(String name, double grade1, double grade2, double grade3) {
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }

    public double getFinalGrade() {
        return grade1 + grade2 + grade3;
    }

    public boolean isAprooved() {
        return getFinalGrade() >= 60;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nFINAL GRADE = ").append(String.format("%.2f%n", getFinalGrade()));
        if (isAprooved()) {
            sb.append("PASS");
        } else {
            sb.append("FAILED\n").append(String.format("MISSING %.2f POINTS%n", 60 - getFinalGrade()));
        }

        return sb.toString();
    }
}
