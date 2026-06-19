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
    public void recurse(TreeNode root,String s,int val){
        int count = 0,left = -1, right = -1;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '-') count++;
            else{
                if(count == val){
                    left = i;
                    break;
                }
                else count = 0;
            }
        }
        count = 0;
        for(int i = Math.max(0,left); i < s.length(); i++){
            if(s.charAt(i) == '-') count++;
            else{
                if(count == val){
                    right = i;
                    break;
                }
                else count = 0;
            }
        }
        count = 0;
        if(left != -1){
            for(int i = left; i < s.length(); i++){
                if(s.charAt(i) != '-') count++;
                else break;
            }
            root.left = new TreeNode(Integer.valueOf(s.substring(left,left+count)));
            if(right == -1) recurse(root.left,s.substring(left+count),val+1);
            else{
                recurse(root.left,s.substring(left+count,right-val),val+1);
                count = 0;
                for(int i = right; i < s.length(); i++){
                    if(s.charAt(i) != '-') count++;
                    else break;
                }
                root.right = new TreeNode(Integer.valueOf(s.substring(right,right+count)));
                recurse(root.right,s.substring(right+count),val+1);
            }
        }
    }
    public TreeNode recoverFromPreorder(String traversal) {
        int count = 0;
        for(int i = 0; i < traversal.length(); i++){
            if(traversal.charAt(i) != '-') count++;
            else break;
        }
        TreeNode root = new TreeNode(Integer.valueOf(traversal.substring(0,count)));
        recurse(root,traversal.substring(count),1);
        return root;
    }
}