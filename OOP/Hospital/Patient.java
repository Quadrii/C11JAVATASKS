package OOP.Hospital;

import java.util.Date;

public class Patient {
    private String patientName;
    private int patientAge;
    private Date dateOfBirth;
    private int id;
    private static int idNumber = 1;
    public String gender;

    public Patient(String patientName, int patientAge, String gender){
        this.patientName = patientName;
        this.gender = gender;
        this.patientAge = patientAge;
        this.id = idNumber++;
    }

    public String getPatientName() {
        return patientName;
    }

    public int getPatientAge() {
        return patientAge;
    }
    public int getId() {
        return id;
    }

}
