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
    public ListNode rotateRight(ListNode head, int k) {
        int size = getListSize(head);
        if(size < 1) return head;
        
        for(int i = 0; i < (k % size); i++) {
            ListNode newHead = new ListNode();
            ListNode node = head;
            ListNode prev = head;
            
            while (node.next != null) { // 링크리스트에 마지막으로 이동
                prev = node;
                node = node.next;
            }
            
            if(size > 0) {
                prev.next = null;
                newHead.val = node.val;
                newHead.next = head;
                head = newHead;
            }         
        }
        
        return head;
    }
    
    public int getListSize(ListNode head) {
        int size = 0;
        while(head != null) {
            head = head.next;
            size++;
        }
        return size;
    }
}