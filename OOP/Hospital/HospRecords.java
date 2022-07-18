//package OOP.Hospital;
//
//import org.testng.TestException;
//
//import java.util.ArrayList;
//import java.util.Objects;
//
//public class Hospital {
//
//
//    private int hospitalId;
//    private String nameOfHospital;
//    private String addressOfHospital;
//
//    private ArrayList<Doctor> doctors = new ArrayList<Doctor>();
//    private ArrayList<MedTest> tests = new ArrayList<MedTest>();
//
//    public Hospital(String name, String address) {
//        nameOfHospital = name;
//        addressOfHospital = address;
//    }
//
//
//    public ArrayList<Doctor> getDoctors() {
//        return doctors;
//    }
//
//    public ArrayList<MedTest> getTests() {
//        return tests;
//    }
//
//    public int getHospitalId() {
//        return hospitalId;
//    }
//
//    public String getNameOfHospital() {
//        return nameOfHospital;
//    }
//
//    public String getAddressOfHospital() {
//        return addressOfHospital;
//    }
//
//    public void addConsultant(String name, DoctorExpertise expertise) {
//        Doctor doctor = new Doctor(expertise, name);
//        doctors.add(doctor);
//    }
//
//
//    public void deleteConsultant(int Id) {
//        for (Doctor doctor : doctors) {
//            if (doctor.getId() == Id) {
//                doctors.remove(doctor);
//                System.out.println("Consultant with Id number" + " " + Id + " " + "has been removed!");
//                return;
//            }
//        }
//        throw new HealthExceptions("Consultant with Id number" + " " + Id + " " + "does not exist!");
//    }
//
//    public Doctor getAConsultant(int Id) {
//        for (Doctor consultant : doctors) {
//            if (consultant.getId() == Id) {
//                return consultant;
//            }
//        }
//        throw new HealthExceptions("Consultant with Id number" + " " + Id + " " + "does not exist!");
//    }
//
//
//    public void createTest(String type) {
//        MedTest myTest = new MedTest(type);
//        tests.add(myTest);
//    }
//
//    public void deleteTest(int Id) {
//        for (MedTest myTest : tests) {
//            if (myTest.getTestId() == Id) {
//                tests.remove(myTest);
//                return;
//            }
//        }
//        throw new TestException("Test with Id number" + Id + " does not exist!");
//    }
//
//    @Override
//    public String toString() {
//        return "Hospital{" +
//                "nameOfHospital='" + nameOfHospital + '\'' +
//                ", addressOfHospital='" + addressOfHospital + '\'' +
//                '}';
//    }
//}
