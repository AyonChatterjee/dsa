
// https://leetcode.com/problems/middle-of-the-linked-list/

public class middleNode {
    public ListNode middleNode(ListNode head) {
        ListNode s = head ; 
        ListNode f = head ; 


        while(f != null && f.next != null) {
            s = s.next ; 
            f = f.next.next ;
        }

        return s ;
    }
}
