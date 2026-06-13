class Solution(object):
    def diameterOfBinaryTree(self, root):
        _,max_ = recurse(root,0)
        return max_
def recurse(root,max_):
    left,right = 0,0
    if root.left != None:
        left,max_ = recurse(root.left,max_)
    if root.right != None:
        right,max_ = recurse(root.right,max_)
    return max(left,right)+1,max(max_,left+right)