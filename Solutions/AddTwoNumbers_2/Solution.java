package Solutions.sumTwoNumbers_2;

import java.util.List;

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
        ListNode currentl1 = l1; 
        ListNode currentl2 = l2;
        int carry = 0, sum = 0;

        while (currentl1 != null || currentl2 != null) {
            sum = carry;
            System.out.println(current.val);
            if (currentl1 != null) {
                sum += currentl1.val;
                currentl1 = currentl1.next;
            }
            if (currentl2 != null) {
                sum += currentl2.val;
                currentl2 = currentl2.next;
            }

            if (sum > 9) {
                carry = 1;
                sum -= 10;
            } else {
                carry = 0;  
            }

            current.val = sum;
            System.out.println(current.val);

            if (currentl1 != null || currentl2 != null) {
                current.next = new ListNode(sum % 10);
                current = current.next;
                System.out.println(current.val);
            }
            System.out.println(current.val);

        }

        if(carry > 0){
           current.next = new ListNode(carry);
        }

        return dummy;
    }
}
