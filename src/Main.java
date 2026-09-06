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
    }
}