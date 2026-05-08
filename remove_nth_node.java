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
        ListNode temp = head;
        int count1=1;
        while(temp.next!=null){
            temp=temp.next;
            count1++;
        }
        ListNode curr = head;
        if(count1==n){
            return head.next;
        }
        int count2=1;
        while(curr!=null){
            if(count2==(count1-n)){
                curr.next=curr.next.next;
                break;
            }
            count2++;
            curr=curr.next;
        }
        return head;
    }
}
