/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        
        if(l1 == null)
            return l2;
        else if(l2==null)
            return l1;
        
        ListNode result;
        
        if(l1.val<l2.val)
        {
            result = l1;
            l1 = l1.next;
        }            
        else
        {
            result = l2;
            l2 = l2.next;
        }
        
        ListNode temp = result;
        
        while(l1!=null && l2!=null)
        {
                        
            if(l1.val < l2.val)
            {
                temp.next = l1;
                temp = temp.next;
                l1 = l1.next;
            }
            else
            {
                temp.next = l2;
                temp = temp.next;
                l2 = l2.next;
            }
        }

        if(l1!= null)
            temp.next = l1;           
        else if(l2 != null)
            temp.next = l2;

        
        return result;
       
    }
}