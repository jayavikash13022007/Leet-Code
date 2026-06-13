# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def isBalanced(self, root):
        if root == None:
            return True
        _,flag = recurse(root,1)
        return flag == 1
def recurse(root,flag):
    left,right = 0,0
    if root.left != None:
        left,flag = recurse(root.left,flag)
    if root.right != None:
        right,flag = recurse(root.right,flag)
    if abs(left - right) > 1:
        flag = 0
    return max(left,right) + 1,flag