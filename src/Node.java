public class Node {
    Patient data;
    Node left;
    Node right;

    public Node(Patient data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}