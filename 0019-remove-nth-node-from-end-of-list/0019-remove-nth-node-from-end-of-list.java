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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int listSize = getSize(head);
        if(listSize == n) {
            head = head.next;
            return head;
        }
        
        int intBeforeNth = listSize - n;
        ListNode temp = head;
        for(int i = 0; i < listSize; i++) {
            if(i == intBeforeNth - 1) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }     
        }
        return head;
    }
    public int getSize(ListNode head) {
        int size = 0;
        while(head != null) {
            head = head.next;
            size++;
        }
        
        return size;
    }
}