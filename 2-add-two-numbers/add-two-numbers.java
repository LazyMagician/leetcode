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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        int carry=0;
        ListNode head = null;
        ListNode curr = null;
        while(l1 != null || l2 != null || carry!=0){
            int sum = carry;
            if(l1 != null){
                sum += l1.val;
            }
            if(l2 != null){
                sum += l2.val;
            }
            carry = sum/10;

            if(head == null){
                ListNode node = new ListNode(sum%10);
                head = node;
                curr =head;
            }else{
                ListNode node = new ListNode(sum%10);
                curr.next = node;
                curr = curr.next;
            }
            if(l1!= null)
            l1 = l1.next;
            if(l2 != null)
            l2 = l2.next;


        }
        return head;
       
    }

 
}