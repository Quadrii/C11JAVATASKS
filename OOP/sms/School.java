package OOP.sms;

import java.awt.font.FontRenderContext;
import java.util.ArrayList;
import java.util.Objects;

public class School {
    private static int idNumber = 1;
    private String schoolName;
    private String address;
    public School(String schoolName, String address){
        this.schoolName = schoolName;
        this.address = address;
    }
    ArrayList <Student> students = new ArrayList<>();
    ArrayList <Course> courses = new ArrayList<>();

    public ArrayList <Student> getStudents(){
        return students;
    }
    public void addCourse(String courseName, String courseCode){
        Course course = new Course(courseName, courseCode);
        courses.add(course);
    }

    public void deleteCourse(String courseName){
        for (Course course : courses){
            if (Objects.equals(course.getCourseName(), courseName)){
                courses.remove(course);
            }
        }
        throw new SchoolExceptions("course does not exist");
    }

    public Course getCourse(String courseName, String courseCode){
        for (Course course : courses){
            if (Objects.equals(course.getCourseName(), courseName)){
                if (Objects.equals(course.getCourseCode(), courseCode)){
                    return course;
                }
            }
        }
        throw new SchoolExceptions("Cannot find this course");
    }

    public void addStudent(String name, int age){
        Student student = new Student(name, age);
        students.add(student);
    }

    public void deleteStudent(int studentID){
        for (Student student : students){
            if (Objects.equals(student.studentID(), studentID)){
                students.remove(student);
                System.out.println("Student with Id number " + student.studentID() + " and name : " + student.getStudentName() + "" +
                        " has been deleted!");
                return;
            }
        }
        throw  new SchoolExceptions("No student with that ID");
    }

    public  Student getStudent(String studentID){
        for (Student student: students){
            if (Objects.equals(student.studentID(), studentID)){
                return student;
            }
        }
        throw new SchoolExceptions("No student with that ID");
    }
}