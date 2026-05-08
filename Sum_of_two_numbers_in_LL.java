import java.util.*;
class Add_Two_Numbers {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
                ListNode dummy = new ListNode(-1);
                ListNode curr = dummy;
                int carry = 0;
                while (l1 != null || l2 != null || carry != 0) {
                        int val1 = 0, val2 = 0;
                        if (l1 != null) {
                                val1 = l1.val;
                                l1 = l1.next;
                        }
                        if (l2 != null) {
                                val2 = l2.val;
                                l2 = l2.next;
                        }
                        int sum = val1 + val2 + carry;
                        int digit = sum % 10;
                        carry = sum / 10;
                        curr.next = new ListNode(digit);
                        curr = curr.next;
                }
                return dummy.next;
        }
}

public class AddTwoNumbers {

}
