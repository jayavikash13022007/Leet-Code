class Solution(object):
    def minDepth(self, root):
        if root == None:
            return 0
        return recurse(root,0)
def recurse(root,count):
    left,right = float("inf"),float("inf")
    if root.left != None:
        left = recurse(root.left,count)
    if root.right != None:
        right = recurse(root.right,count)
    if root.left == None and root.right == None:
        return 1
    return min(left,right) + 1