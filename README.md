# Hospital Emergency Management System

A Java console application built for the CIT300 - Data Structures and Algorithms
individual mid assignment. It simulates managing patients at a hospital emergency
unit using four core data structures.

## Data Structures Used

- **Binary Search Tree (BST)** — stores patient records keyed by Patient ID.
  Supports insert, search, delete, and in-order traversal.
- **Queue** — manages patients waiting for emergency treatment (FIFO).
- **Stack** — stores completed treatment records (LIFO).
- **Singly Linked List** — stores each patient's visit history.

## How to Run

1. Navigate to the `src` folder.
2. Compile: `javac *.java`
3. Run: `java Main`
4. Follow the on-screen menu to add patients, manage the emergency queue,
   record treatments, and view visit history.

## Menu Options

1. Add new patient (BST)
2. Search patient by ID (BST)
3. Delete patient (BST)
4. Display all patients (in-order)
5. Enqueue patient to emergency queue
6. Dequeue patient for treatment
7. Display waiting queue
8. Push completed treatment record
9. Pop most recent treatment record
10. Display treatment history
11. Add visit to patient history
12. Remove visit from patient history
13. Search visit in patient history
14. Display patient visit history
0. Exit

## Project Structure

src/
├── Patient.java - Patient record
├── Node.java - BST node
├── PatientBST.java - BST implementation
├── EmergencyQueue.java - Queue implementation
├── TreatmentRecord.java - Treatment record
├── TreatmentStack.java - Stack implementation
├── Visit.java - Visit record
├── VisitLinkedList.java - Singly linked list implementation
└── Main.java - Console menu tying everything together


## Author

H.Aafrin Banu — CIT300 Data Structures and Algorithms, Sri Lanka Technology Campus