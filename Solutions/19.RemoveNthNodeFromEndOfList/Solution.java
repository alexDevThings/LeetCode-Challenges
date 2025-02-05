class Solution {
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int x) { val = x; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyNode = new ListNode(0, head);
        ListNode aux = dummyNode;
        ListNode prevToDelete = dummyNode;
        int i = 1, j = 0;
        
        while (aux.next != null) {
            aux = aux.next;
            i++;
            if ((i-j) > n+1) {
                prevToDelete = prevToDelete.next;
                j++;
            }
        }
        prevToDelete.next = prevToDelete.next.next;
        return dummyNode.next;
    }
}