package OOP.Hospital;

import java.util.ArrayList;

public class HospRecords {
    private ArrayList<Doctor> doctors = new ArrayList<>();
    private ArrayList<Patient> patients = new ArrayList<>();

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public void addDoctor(String doctorName, String expertise){
        for (Doctor doctor : doctors){
            Doctor newDoc = new Doctor(doctorName, expertise);
            doctors.add(newDoc);
        }
    }

    public void addPatient(String patientName, int patientAge, String gender){
        for (Patient patient : patients){
            Patient newPat = new Patient(patientName, patientAge, gender);
            patients.add(newPat);
        }
    }
}
