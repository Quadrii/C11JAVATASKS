package Classwork;
public class StudentGrade {
    private String name;
    private int average;

    public StudentGrade(String name, int average){
        this.name = name;
        this.average = average;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAverage(int average){
        if(average > 0){
            if(average <= 100){
                this.average =average;
            }
        }
    }

    public int getAverage(){
        return average;
    }
    public String getLetterGrade(){
        String letterGrade="";
        if(average >= 90){
            letterGrade ="A";
        }
        else if(average >= 80){
            letterGrade ="B";
        }
        else if(average >= 70){
            letterGrade ="C";
        }
        else if(average >= 60){
            letterGrade ="D";
        }
        else{
            letterGrade = "F";
        }
        return letterGrade;
    }
}