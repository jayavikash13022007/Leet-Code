/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int[] recurse(TreeNode root,int max_){
        int left = 0, right = 0;
        int[] lst = new int[2];
        if(root.left != null){
            lst = recurse(root.left,max_);
            left = lst[0];
            max_ = lst[1];
        }
        if(root.right != null){
            lst = recurse(root.right,max_);
            right = lst[0];
            max_ = lst[1];
        }
        if(left+right > max_) max_ = left+right;
        if(left > right) lst[0] = left+1;
        else lst[0] = right+1;
        lst[1] = max_;
        return lst;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        int[] lst = new int[2];
        lst = recurse(root,0);
        return lst[1];
    }
}