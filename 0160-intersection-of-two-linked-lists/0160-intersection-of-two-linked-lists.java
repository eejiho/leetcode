/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode listNodeA = headA;
        ListNode listNodeB = headB;
        while (listNodeA != listNodeB) {
            listNodeA = listNodeA == null ? headB : listNodeA.next;
            listNodeB = listNodeB == null ? headA : listNodeB.next;
        }
        return listNodeA;
    }
}