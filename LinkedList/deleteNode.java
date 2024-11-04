class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class deleteNode {
    Node head;

    public void add(int val) {  // Adding the node
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }

    public void delete(int key) { // Deleting the node
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.val == key) {
            head = head.next;
            return;
        }

        Node curr = head;
        while (curr.next != null && curr.next.val != key) {
            curr = curr.next;
        }

        if (curr.next == null) {
            System.out.println("Node with value " + key + " not found.");
        } else {
            curr.next = curr.next.next;
        }
    }

    public void display() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        deleteNode list = new deleteNode();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Original List:");
        list.display();

        list.delete(20);
        System.out.println("After deleting 20:");
        list.display();

        list.delete(10);
        System.out.println("After deleting 10 (head):");
        list.display();

        list.delete(50); // Node not in list
    }
}
