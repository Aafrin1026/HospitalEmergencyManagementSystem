public class Patient {
    int patientId;
    String name;
    int age;
    String contactNumber;
    String medicalCondition;

    // Constructor: runs when we create a new Patient object
    public Patient(int patientId, String name, int age, String contactNumber, String medicalCondition) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.contactNumber = contactNumber;
        this.medicalCondition = medicalCondition;
    }

    // Lets us print a Patient nicely instead of seeing memory addresses
    @Override
    public String toString() {
        return "ID: " + patientId +
               ", Name: " + name +
               ", Age: " + age +
               ", Contact: " + contactNumber +
               ", Condition: " + medicalCondition;
    }
}