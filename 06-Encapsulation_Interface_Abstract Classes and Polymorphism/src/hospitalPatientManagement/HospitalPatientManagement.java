package hospitalPatientManagement;

// Main class
public class HospitalPatientManagement {
    // Method to process and display patient details
    public static void processPatients(Patient[] patients) {
        for (Patient patient : patients) {
            patient.getPatientDetails();
            System.out.println("Total Bill: $" + patient.calculateBill());

            // Check if patient has medical records
            if (patient instanceof MedicalRecord) {
                MedicalRecord recordHolder = (MedicalRecord) patient;
                recordHolder.viewRecords();
            }

            System.out.println("------------------------------------");
        }
    }

    public static void main(String[] args) {
        // Create instances of InPatient and OutPatient
        Patient[] patients = {
                new InPatient("P001", "Brock Lesnar", 45, 500.0, 5),
                new OutPatient("P002", "Randy Orton", 44, 150.0)
        };

        // Add medical records
        ((MedicalRecord) patients[0]).addRecord("Diagnosed with pneumonia. Treatment ongoing.");
        ((MedicalRecord) patients[1]).addRecord("Routine check-up for hypertension.");

        // Process and display details for all patients
        processPatients(patients);
    }
}
