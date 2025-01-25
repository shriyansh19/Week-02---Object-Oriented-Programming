package hospitalPatientManagement;

// Subclass InPatient
class InPatient extends Patient implements MedicalRecord {
    private double dailyCharge;
    private int numberOfDays;
    private String medicalHistory;

    // Constructor for InPatient
    public InPatient(String patientId, String name, int age, double dailyCharge, int numberOfDays) {
        super(patientId, name, age);
        this.dailyCharge = dailyCharge;
        this.numberOfDays = numberOfDays;
        this.medicalHistory = "";
    }

    // Implementation of calculateBill
    @Override
    public double calculateBill() {
        return dailyCharge * numberOfDays;
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