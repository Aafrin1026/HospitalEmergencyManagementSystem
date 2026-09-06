public class Main {
    public static void main(String[] args) {
        PatientBST bst = new PatientBST();

        bst.insert(new Patient(50, "Nimal Perera", 45, "0771234567", "Fracture"));
        bst.insert(new Patient(30, "Kamal Silva", 30, "0719876543", "Flu"));
        bst.insert(new Patient(70, "Saman Fernando", 60, "0765554433", "Chest Pain"));
        bst.insert(new Patient(20, "Anusha Perera", 25, "0701112233", "Headache"));
        bst.insert(new Patient(40, "Dilani Rathnayake", 50, "0778889999", "Fever"));

        System.out.println("--- In-order traversal ---");
        bst.inOrderTraversal();

        System.out.println("\n--- Search for ID 40 ---");
        Patient found = bst.search(40);
        System.out.println(found != null ? found : "Not found");

        System.out.println("\n--- Delete ID 20 ---");
        bst.delete(20);
        bst.inOrderTraversal();

        System.out.println("\n--- Emergency Queue Test ---");
        EmergencyQueue queue = new EmergencyQueue();

        queue.enqueue(new Patient(201, "Ruwan Jayasuriya", 34, "0712223344", "Broken Arm"));
        queue.enqueue(new Patient(202, "Ishara Wickrama", 28, "0723334455", "High Fever"));
        queue.enqueue(new Patient(203, "Chamara Bandara", 50, "0734445566", "Chest Pain"));

        System.out.println("Waiting patients:");
        queue.displayQueue();

        System.out.println("\nDequeue next patient for treatment:");
        Patient next = queue.dequeue();
        System.out.println("Now treating: " + next);

        System.out.println("\nRemaining waiting patients:");
        queue.displayQueue();

        System.out.println("\nDequeue all remaining, then try once more (empty case):");
        queue.dequeue();
        queue.dequeue();
        queue.dequeue(); // this one should show "Queue is empty"

        System.out.println("\n--- Treatment Stack Test ---");
        TreatmentStack stack = new TreatmentStack();

        stack.push(new TreatmentRecord(201, "Ruwan Jayasuriya", "Arm casted and bandaged"));
        stack.push(new TreatmentRecord(202, "Ishara Wickrama", "Fever medication given"));
        stack.push(new TreatmentRecord(203, "Chamara Bandara", "ECG performed, stabilized"));

        System.out.println("All treatment records (most recent first):");
        stack.displayStack();

        System.out.println("\nPop most recent record:");
        TreatmentRecord popped = stack.pop();
        System.out.println("Removed: " + popped);

        System.out.println("\nRemaining records:");
        stack.displayStack();

        System.out.println("\nPop all remaining, then try once more (empty case):");
        stack.pop();
        stack.pop();
        stack.pop(); // this one should show "Stack is empty"

        System.out.println("\n--- Visit Linked List Test ---");
        VisitLinkedList visits = new VisitLinkedList();

        visits.addVisit(new Visit(1, "2025-01-10", "Dr. Perera", "Common Cold", "Rest and fluids"));
        visits.addVisit(new Visit(2, "2025-03-22", "Dr. Fernando", "Sprained Ankle", "Bandage and rest"));
        visits.addVisit(new Visit(3, "2025-06-15", "Dr. Silva", "Migraine", "Pain relief medication"));

        System.out.println("All visits:");
        visits.displayVisits();

        System.out.println("\nSearch for visit ID 2:");
        Visit foundVisit = visits.searchVisit(2);
        System.out.println(foundVisit != null ? foundVisit : "Not found");

        System.out.println("\nRemove visit ID 2:");
        visits.removeVisit(2);
        visits.displayVisits();

        System.out.println("\nSearch for removed visit ID 2 (should not be found):");
        Visit afterRemove = visits.searchVisit(2);
        System.out.println(afterRemove != null ? afterRemove : "Not found");
    }
}