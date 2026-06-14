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
    public int pairSum(ListNode head) {
        int max = Integer.MIN_VALUE;
        List<Integer> lst = new ArrayList<>();
        while(head != null){
            lst.add(head.val);
            head = head.next;
        }
        int n = lst.size();
        for(int i = 0; i < n/2; i++){
            if(lst.get(i) + lst.get(n-i-1) > max) max = lst.get(i) + lst.get(n-i-1);
        }
        return max;
    }
}