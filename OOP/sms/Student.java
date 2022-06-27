package OOP.sms;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Objects;

public class Student {
    private  String studentName;
    private int age;
    private static int idNumber =1;
    private int id;
    ArrayList<Course> studentCourses = new ArrayList<>();

    public Student(String studentName, int age){
        this.studentName = studentName;
        this.age = age;
        this.id = idNumber;
        idNumber++;
    }
    public void selectCourse(Course course){
        studentCourses.add(course);
    }
    public ArrayList<Course> getStudentCourses(){
        return studentCourses;
    }

    public Course viewCourse(String courseName, int courseCode){
        for (Course course : studentCourses){
            if (Objects.equals(course.getCourseCode(), courseCode)){
                if (Objects.equals(course.getCourseName(), courseName)){
                    return course;
                }
            }
        }
        throw new SchoolExceptions("Course does not exist");
    }

    public void dropCourse(String courseName, int courseCode){
        for (Course course : studentCourses){
            if (Objects.equals(course.getCourseCode(), courseCode)){
                if (Objects.equals(course.getCourseName(), courseName)){
                    studentCourses.remove(course);
                    System.out.println(courseName + " " + courseCode + " has been removed!");
                    return;
                }
            }
        }
        throw new SchoolExceptions("Course does not exist");
    }
    public String getStudentName(){
        return studentName;
    }

    public int getAge(){
        return age;
    }

    public int studentID(){
        return id;
    }
    @Override
    public String toString() {
        return String.format("""
                Student Name: %s
                Student Id: %d
                """, getStudentName(), studentID());
    }
}
