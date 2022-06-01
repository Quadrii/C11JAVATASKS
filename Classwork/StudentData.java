package Classwork;

public class StudentData {
    private String[] name = new String[3];
    private int[][] grades;

    private String subjects[];

    public String[] getSubjects(String[] studentSubject) {
        return subjects;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    public void setName(String[] name) {
        this.name = name;
    }

    public void setGrades(int[][] grades) {
        this.grades = grades;
    }

    public String[] getName() {
        return name;
    }

    public int[][] getGrades() {
        return grades;
    }

}
