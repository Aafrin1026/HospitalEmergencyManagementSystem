import java.util.Scanner;

public class Main {
    static PatientBST bst = new PatientBST();
    static EmergencyQueue queue = new EmergencyQueue();
    static TreatmentStack stack = new TreatmentStack();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            printMenu();
            choice = Integer.parseInt(scanner.nextLine());
            handleChoice(choice);
        } while (choice != 0);

        System.out.println("Exiting system. Goodbye!");
    }

    static void printMenu() {
        System.out.println("\n===== Hospital Emergency Management System =====");
        System.out.println("1. Add new patient (BST)");
        System.out.println("2. Search patient by ID (BST)");
        System.out.println("3. Delete patient (BST)");
        System.out.println("4. Display all patients (in-order)");
        System.out.println("5. Enqueue patient to emergency queue");
        System.out.println("6. Dequeue patient for treatment");
        System.out.println("7. Display waiting queue");
        System.out.println("8. Push completed treatment record");
        System.out.println("9. Pop most recent treatment record");
        System.out.println("10. Display treatment history");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }

    static void handleChoice(int choice) {
        switch (choice) {
            case 1:
                System.out.print("Enter Patient ID: ");
                int id = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter Patient Name: ");
                String name = scanner.nextLine();
                System.out.print("Enter Age: ");
                int age = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter Contact Number: ");
                String contact = scanner.nextLine();
                System.out.print("Enter Medical Condition: ");
                String condition = scanner.nextLine();

                bst.insert(new Patient(id, name, age, contact, condition));
                System.out.println("Patient added successfully.");
                break;

            case 2:
                System.out.print("Enter Patient ID to search: ");
                int searchId = Integer.parseInt(scanner.nextLine());
                Patient foundPatient = bst.search(searchId);
                if (foundPatient != null) {
                    System.out.println("Found: " + foundPatient);
                } else {
                    System.out.println("No patient found with ID " + searchId);
                }
                break;

            case 3:
                System.out.print("Enter Patient ID to delete: ");
                int deleteId = Integer.parseInt(scanner.nextLine());
                bst.delete(deleteId);
                System.out.println("Patient deleted (if ID existed).");
                break;

            case 4:
                System.out.println("--- All Patients (ascending ID) ---");
                bst.inOrderTraversal();
                break;

            case 5:
                System.out.print("Enter Patient ID to enqueue: ");
                int qId = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter Patient Name: ");
                String qName = scanner.nextLine();
                System.out.print("Enter Age: ");
                int qAge = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter Contact Number: ");
                String qContact = scanner.nextLine();
                System.out.print("Enter Medical Condition: ");
                String qCondition = scanner.nextLine();

                queue.enqueue(new Patient(qId, qName, qAge, qContact, qCondition));
                System.out.println("Patient added to emergency queue.");
                break;

            case 6:
                Patient dequeued = queue.dequeue();
                if (dequeued != null) {
                    System.out.println("Now treating: " + dequeued);
                }
                break;

            case 7:
                System.out.println("--- Waiting Queue ---");
                queue.displayQueue();
                break;

            case 8:
                System.out.print("Enter Patient ID: ");
                int tId = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter Patient Name: ");
                String tName = scanner.nextLine();
                System.out.print("Enter Treatment Given: ");
                String tGiven = scanner.nextLine();

                stack.push(new TreatmentRecord(tId, tName, tGiven));
                System.out.println("Treatment record added.");
                break;

            case 9:
                TreatmentRecord popped = stack.pop();
                if (popped != null) {
                    System.out.println("Removed: " + popped);
                }
                break;

            case 10:
                System.out.println("--- Treatment History ---");
                stack.displayStack();
                break;

            case 0:
                break;
            default:
                System.out.println("Invalid choice, try again.");
        }
    }
}