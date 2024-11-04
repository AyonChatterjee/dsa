
class Node {
    int val ;
    Node next ;


    public Node(int val) {
        this.val = val ;
        this.next = null;
    }
}

public class deleteNode {
    Node head ;

    public void add(int val) {  // adding the node 
        Node newNode = new Node(val) ;
        if(head == null) {
            head = newNode ;
        }
        else  {
            Node curr = head ; 
            while(curr.next != null) {
                curr =  curr.next ;
            }
            curr.next = newNode ;
        }
    }

    public void delete(int key) { // deleting the node
        if(head == null) 
        System.out.println("List is empty.");
        return ;


        if(head.val == key) {
            head = head.next ;
            return ;
        }


        
    }

    
}