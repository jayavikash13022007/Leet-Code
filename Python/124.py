# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def maxPathSum(self, root):
        return recurse(root,-float("inf"))[1]
def recurse(root,max_):
    left,right = 0,0
    if root.left != None:
        left,max_ = recurse(root.left,max_)
    if root.right != None:
        right,max_ = recurse(root.right,max_)
    return [max(left,right,0) + root.val,max(left+root.val,right+root.val,root.val,left+right+root.val,max_)]