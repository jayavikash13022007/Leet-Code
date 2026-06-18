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
    public int gcd(int a,int b){
        int num = 1;
        for(int i = 2; i<=Math.min(a,b); i++){
            if(a%i == 0 && b%i == 0) num = i;
        }
        return num;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next == null) return head;
        ListNode temp = head;
        while(temp.next != null){
            ListNode node = new ListNode(gcd(temp.val,temp.next.val));
            node.next = temp.next;
            temp.next = node;
            temp = node.next;
        }
        return head;
    }
}