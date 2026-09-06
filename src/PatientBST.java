public class PatientBST {
    Node root;

    public PatientBST() {
        root = null;
    }

    public void insert(Patient p) {
        root = insertHelper(root, p);
    }

    private Node insertHelper(Node current, Patient p) {
        if (current == null) {
            return new Node(p);
        }
        if (p.patientId < current.data.patientId) {
            current.left = insertHelper(current.left, p);
        } else if (p.patientId > current.data.patientId) {
            current.right = insertHelper(current.right, p);
        }
        return current;
    }

    public Patient search(int id) {
        return searchHelper(root, id);
    }

    private Patient searchHelper(Node current, int id) {
        if (current == null) {
            return null;
        }
        if (id == current.data.patientId) {
            return current.data;
        } else if (id < current.data.patientId) {
            return searchHelper(current.left, id);
        } else {
            return searchHelper(current.right, id);
        }
    }

    public void inOrderTraversal() {
        inOrderHelper(root);
    }

    private void inOrderHelper(Node current) {
        if (current == null) {
            return;
        }
        inOrderHelper(current.left);
        System.out.println(current.data);
        inOrderHelper(current.right);
    }

    public void delete(int id) {
        root = deleteHelper(root, id);
    }

    private Node deleteHelper(Node current, int id) {
        if (current == null) {
            return null;
        }
        if (id < current.data.patientId) {
            current.left = deleteHelper(current.left, id);
        } else if (id > current.data.patientId) {
            current.right = deleteHelper(current.right, id);
        } else {
            if (current.left == null && current.right == null) {
                return null;
            } else if (current.left == null) {
                return current.right;
            } else if (current.right == null) {
                return current.left;
            } else {
                Patient smallestInRight = findMin(current.right);
                current.data = smallestInRight;
                current.right = deleteHelper(current.right, smallestInRight.patientId);
            }
        }
        return current;
    }

    private Patient findMin(Node node) {
        while (node.left != null) {
            node = node.left;
        }
        return node.data;
    }
}