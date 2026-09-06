public class EmergencyQueue {
    private QueueNode front;
    private QueueNode rear;

    private class QueueNode {
        Patient data;
        QueueNode next;

        QueueNode(Patient data) {
            this.data = data;
            this.next = null;
        }
    }

    public void enqueue(Patient p) {
        QueueNode newNode = new QueueNode(p);
        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public Patient dequeue() {
        if (front == null) {
            System.out.println("Queue is empty. No patients waiting.");
            return null;
        }
        Patient data = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return data;
    }

    public void displayQueue() {
        if (front == null) {
            System.out.println("Queue is empty. No patients waiting.");
            return;
        }
        QueueNode current = front;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}