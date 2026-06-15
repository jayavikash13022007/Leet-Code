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
    public ListNode deleteMiddle(ListNode head) {
        int n = 0, mid = 0;
        ListNode a = new ListNode();
        a = head;
        while(a != null){
            n++;
            a = a.next;
        }
        if(n==1) return null;
        mid = n/2;
        a = head;
        for(int i = 0; i < mid-1; i++) a = a.next;
        a.next = a.next.next;
        return head;
    }
}