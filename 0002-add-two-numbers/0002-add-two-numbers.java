/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int num = 0;
        ListNode list = new ListNode(0);
        ListNode result = list;
        
        while(l1 != null || l2 != null) {
            int val = num;
            if (l1 != null) val = val + l1.val;
            if (l2 != null) val = val + l2.val;
            
            if(val >= 10) { 
                num = val / 10;
            } else {
                num = 0;
            }
            
            result.next = new ListNode(val % 10);
            if(l1 != null) { 
                l1 = l1.next;
            }
            if(l2 != null) {
                l2 = l2.next;    
            }
            
            result = result.next;
        }
        
        if(num > 0) {
            result.next = new ListNode(num);
        }
        
        
        return list.next;
    }
}