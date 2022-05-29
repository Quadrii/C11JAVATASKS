package Classwork;

public class BestStudent {
    private String[] names;
    private int[] scores;
    public BestStudent(int noOfStudents, int studentScore){
        this.names = new String[noOfStudents];
        this.scores = new int[studentScore];
    }
    public String[] getName(){
        return names;
    }

//    public int[] getScores(){
//        for (int i=0; i<scores.length; i++){
//            i=scores[i];
//            return scores[i];
//        }
//        return int[] scores = {scores};
//    }

    public String studentName(String studentName){
        for (int i=0; i<names.length; i++){
            if (names[i]==null){
                names[i]=studentName;
                return studentName;
            }
        }
        return studentName;
    }

    public int studentScore(int result){
        for (int i=0; i<scores.length; i++){
            if (scores[i]==0){
                scores[i]=result;
                return result;
            }
        }
        return result;
    }

    public String getStudentRecord(int studentId){
        return names[studentId - 1];
    }

    public int getStudentResult(int scoreId){
        return scores[scoreId - 1];
    }

    public int highestScore(){
        int max = scores[0];
        for (int i=0; i<scores.length; i++){
            if (scores[i] > max ){
                max = scores[i];
            }
        }
        return max;
    }

    public int lowestScore(){
        int min = scores[0];
        for (int i=0; i<scores.length; i++){
            if (scores[i] < min ){
                min = scores[i];
            }
        }
        return min;
    }

}
