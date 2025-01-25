package hospitalPatientManagement;

// Subclass OutPatient
class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private String medicalHistory;

    // Constructor for OutPatient
    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.medicalHistory = "";
    }

    // Implementation of calculateBill
    @Override
    public double calculateBill() {
        return consultationFee;
    }

    // Implementation of addRecord
    @Override
    public void addRecord(String record) {
        medicalHistory += record + "\n";
    }

    // Implementation of viewRecords
    @Override
    public void viewRecords() {
        System.out.println("Medical History:\n" + medicalHistory);
    }
}
