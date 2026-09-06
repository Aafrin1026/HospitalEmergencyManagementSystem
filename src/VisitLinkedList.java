public class VisitLinkedList {
    private VisitNode head;

    private class VisitNode {
        Visit data;
        VisitNode next;

        VisitNode(Visit data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addVisit(Visit v) {
        VisitNode newNode = new VisitNode(v);
        if (head == null) {
            head = newNode;
            return;
        }
        VisitNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public boolean removeVisit(int visitId) {
        if (head == null) {
            System.out.println("No visit history to remove from.");
            return false;
        }
        if (head.data.visitId == visitId) {
            head = head.next;
            return true;
        }
        VisitNode current = head;
        while (current.next != null) {
            if (current.next.data.visitId == visitId) {
                current.next = current.next.next;
                return true;
            }
            current = current.next;
        }
        System.out.println("Visit ID " + visitId + " not found.");
        return false;
    }

    public Visit searchVisit(int visitId) {
        VisitNode current = head;
        while (current != null) {
            if (current.data.visitId == visitId) {
                return current.data;
            }
            current = current.next;
        }
        return null;
    }

    public void displayVisits() {
        if (head == null) {
            System.out.println("No visit history available.");
            return;
        }
        VisitNode current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}