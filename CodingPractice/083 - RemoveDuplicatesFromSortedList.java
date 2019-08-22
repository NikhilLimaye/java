/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        HashSet<Integer> h = new HashSet<Integer>();
        
        if(head == null)
            return null;
        
        if(head.next == null)
            return head;
        
        
        ListNode current = head.next;
        ListNode trail = head;
        
        h.add(trail.val);
        
        while(current.next!=null)
        {
            if(h.contains(current.val))
            {
                current = current.next;
                trail.next = current;
            }
            else
            {
                h.add(current.val);
                current = current.next;
                trail = trail.next;
            }
        }
        
        if(current.next == null && h.contains(current.val))
            trail.next = null;
        
        return head;
    }  
        
}