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
    public ListNode mergeNodes(ListNode head) {
        int sum = 0;
        ListNode temp = head.next;
        ListNode prev = head;
        ListNode k = head;
        while(temp != null){
            if(temp.val != 0) sum += temp.val;
            else{
                k.val = sum;
                k.next = temp;
                prev = k;
                k = temp;
                sum = 0;
            }
            temp = temp.next;
        }
        prev.next = null;
        return head;
    }
}