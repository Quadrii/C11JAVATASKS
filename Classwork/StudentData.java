package Classwork;

public class StudentData {
    private String[] name;
    private int[][] grades;
    private int[] totalScores;
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

    public int totalScore(int index){
        int total=0;
        for (int j=0; j<grades.length; j++){
            total=total+grades[index][j];
        }
        return total;
    }

    public int subjectScores(int index){
        int subScores=0;
        for (int i=0; i< grades.length;i++){
            subScores = subScores + grades[i][index];
        }
        return subScores;
    }

    public int averageScore(int index){
        int averageScore=0;
        averageScore = totalScore(index)/ subjects.length;
        return averageScore;
    }
    public int calcHighScore(){
        int maxScore= 0;
        for (int i=0; i < name.length; i++) {
                maxScore = averageScore(0);
            if (averageScore(i) > maxScore) {
                maxScore = averageScore(i);
            }
        }
        return maxScore;
    }


    public int calcLowestScore(){
        int minScore= 0;
        for (int i=0; i < name.length; i++) {
                minScore = averageScore(0);
            if (averageScore(i) < minScore ) {
                minScore = averageScore(i);
            }
        }
        return minScore;
    }

}
