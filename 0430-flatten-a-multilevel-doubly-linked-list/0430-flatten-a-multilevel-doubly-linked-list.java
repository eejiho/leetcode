/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if (head == null) return head;

        Node current = head;

        while (current != null) {
            if (current.child != null) {
                // 1. 현재 노드의 next를 저장 (나중에 연결할 노드)
                Node nextNode = current.next;

                // 2. child 리스트를 현재 노드의 next로 연결
                Node childHead = current.child;
                current.next = childHead;
                childHead.prev = current;

                // 3. child 리스트의 마지막 노드를 찾음 (Tail)
                Node childTail = childHead;
                while (childTail.next != null) {
                    childTail = childTail.next;
                }

                // 4. child 리스트의 tail과 원래 nextNode를 연결
                childTail.next = nextNode;
                if (nextNode != null) {
                    nextNode.prev = childTail;
                }

                // 5. child 포인터 null 처리
                current.child = null;
            }
            // 다음 노드로 이동 (child가 없으면 원래 next, child가 있으면 연결된 child 리스트의 다음)
            current = current.next;
        }
        return head;

    }
}