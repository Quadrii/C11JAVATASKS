package OOP.Hospital;

public class Doctor {
    private String doctorName;
    private int id;
    private String expertise;
    private static int idNumber = 1;

    public Doctor(String doctorName, String expertise) {
        this.doctorName = doctorName;
        this.expertise = expertise;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public String getExpertise() {
        return expertise;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("""
                Doctor name: %s
                Expertise: %s
                """,getDoctorName(),getExpertise());
    }
}
