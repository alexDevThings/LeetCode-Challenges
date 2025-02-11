package Solutions.sumTwoNumbers_2;

public class Solution {
    public class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }    

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0, sum = 0;

        while (l1 != null || l2 != null) {
            sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            if (sum > 9) {
                carry = 1;
                sum -= 10;
            } else {
                carry = 0;  
            }
            current.val = sum;

            if (l1 != null || l2 != null) {
                current.next = new ListNode(sum % 10);
                current = current.next;
                System.out.println(current.val);
            }
        }

        if(carry > 0){
           current.next = new ListNode(carry);
        }

        return dummy;
    }
}
