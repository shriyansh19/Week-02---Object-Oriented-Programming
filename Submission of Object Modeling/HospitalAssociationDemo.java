import java.util.ArrayList;

// Represents a patient in the hospital
class Patient {
    private String name; // Name of the patient

    public Patient(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Represents a doctor in the hospital
class Doctor {
    private String name; // Name of the doctor
    private ArrayList<Patient> patients; // List of patients assigned to the doctor

    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    // Adds a patient to the doctor's list
    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    // Displays all patients being treated by the doctor
    public void displayPatients() {
        System.out.println("Patients of Dr. " + name + ":");
        for (Patient patient : patients) {
            System.out.println("- " + patient.getName());
        }
    }

    // Simulates a consultation with a patient
    public void consult(Patient patient) {
        System.out.println("Dr. " + name + " is consulting " + patient.getName());
    }
}

// Represents a hospital containing doctors and patients
class Hospital {
    private String name; // Name of the hospital
    private ArrayList<Doctor> doctors; // List of doctors in the hospital

    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    // Adds a doctor to the hospital
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    // Displays all doctors in the hospital
    public void displayDoctors() {
        System.out.println("Doctors in " + name + ":");
        for (Doctor doctor : doctors) {
            System.out.println("- Dr. " + doctor.getName());
        }
    }
}

public class HospitalAssociationDemo {
    public static void main(String[] args) {
        // Create a hospital
        Hospital hospital = new Hospital("City Hospital");

        // Create doctors
        Doctor doctor1 = new Doctor("Roman Reigns");
        Doctor doctor2 = new Doctor("Brock Lesnar");

        // Create patients
        Patient patient1 = new Patient("Solo Sikoa");
        Patient patient2 = new Patient("John Cena");

        // Add doctors to the hospital
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);

        // Assign patients to doctors
        doctor1.addPatient(patient1);
        doctor2.addPatient(patient2);

        // Display doctors in the hospital
        hospital.displayDoctors();

        // Display patients for each doctor
        doctor1.displayPatients();
        doctor2.displayPatients();

        // Simulate consultations
        doctor1.consult(patient1);
        doctor2.consult(patient2);
    }
}
