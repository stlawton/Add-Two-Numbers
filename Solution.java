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
        
        ListNode head = null;
        ListNode tail = null;
        int carry = 0;
       
        while(l1 != null || l2 != null || carry != 0) {

            int value1, value2;

            if (l1 == null){
                value1 = 0;
            } else{
                value1 = l1.val;
                l1 = l1.next;
            }

            if (l2 == null){
                value2 = 0;
            } else{
                value2 = l2.val;
                l2 = l2.next;
            }

            int sum = value1 + value2 + carry;
                        
            carry = sum / 10;
            sum = sum % 10;
            

            ListNode newNode = new ListNode(sum);

            if (tail == null){
                head = newNode;
                tail = newNode;
            } else{
                tail.next = newNode;
                tail = tail.next;
            }

 
        }

        return head;
    }
}
