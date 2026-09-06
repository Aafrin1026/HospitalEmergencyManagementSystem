public class TreatmentRecord {
    int patientId;
    String patientName;
    String treatmentGiven;

    public TreatmentRecord(int patientId, String patientName, String treatmentGiven) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.treatmentGiven = treatmentGiven;
    }

    @Override
    public String toString() {
        return "Patient ID: " + patientId +
               ", Name: " + patientName +
               ", Treatment: " + treatmentGiven;
    }
}