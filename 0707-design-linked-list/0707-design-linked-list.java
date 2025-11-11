class MyLinkedList {
    private ListNode head;
    
    public static class ListNode{
        private int data;
        private ListNode next;
        
        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    public MyLinkedList() {
        this.head = null;
    }
    
    public int get(int index) {
        if(index < 0 || index >= size()) {
            return -1;
        }
        
        if(index == 0) {
            return head.data;
        }
        ListNode current = head;
        int pos = 0;
        while(pos != index) {
            current = current.next;
            pos++;
        }
        return current.data;
    }
    
    public void addAtHead(int val) {
        if(head == null) {
            head = new ListNode(val);
        } else {
            ListNode newNode = new ListNode(val);
            newNode.next = head;
            head = newNode;
        }
    }
    
    public void addAtTail(int val) {
        if(head == null) {
            addAtHead(val);
            return;
        }
        ListNode current = head;
        while(current.next != null) {
            current = current.next;
        }
        current.next = new ListNode(val);
    }
    
    public void addAtIndex(int index, int val) {
        if(index > size()) {
            return;
        }
        if(index == 0) {
            addAtHead(val);
            return;
        }
        if(index == size()) {
            addAtTail(val);
            return;
        }
        ListNode current = head;
        int pos = 0;
        while(pos != index - 1) {
            current = current.next;
            pos++;
        }
        ListNode addNode = new ListNode(val);
        addNode.next = current.next;
        current.next = addNode;
    }
    
    public void deleteAtIndex(int index) {
        if(index < 0 || index >= size()) {
            return;
        }   
        if(index == 0) {
            head = head.next;
            return;
        }
        ListNode current = head;
        ListNode pre = null;
        int pos = 0;
        while(pos != index) {
            pre = current;
            current = current.next;
            pos++;
        }
        pre.next = current.next;
    }
    
    public int size() {
        if(head == null) return 0;
        
        ListNode current = head;
        int pos = 0;
        while(current != null) {
            current = current.next;
            pos++;
        }
        
        return pos;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */