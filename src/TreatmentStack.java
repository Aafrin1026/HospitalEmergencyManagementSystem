public class TreatmentStack {
    private StackNode top;

    private class StackNode {
        TreatmentRecord data;
        StackNode next;

        StackNode(TreatmentRecord data) {
            this.data = data;
            this.next = null;
        }
    }

    public void push(TreatmentRecord record) {
        StackNode newNode = new StackNode(record);
        newNode.next = top;
        top = newNode;
    }

    public TreatmentRecord pop() {
        if (top == null) {
            System.out.println("Stack is empty. No treatment records to remove.");
            return null;
        }
        TreatmentRecord data = top.data;
        top = top.next;
        return data;
    }

    public void displayStack() {
        if (top == null) {
            System.out.println("Stack is empty. No treatment records.");
            return;
        }
        StackNode current = top;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}