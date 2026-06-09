class Solution(object):
    def createBinaryTree(self, descriptions):
        nodes = {}
        children = []
        for p,c,left in descriptions:
            if p not in nodes:
                nodes[p] = TreeNode(p)
            if c not in nodes:
                nodes[c] = TreeNode(c)
            if left:
                nodes[p].left = nodes[c]
            else:
                nodes[p].right = nodes[c]
            children.append(c)
        for i in nodes:
            if i not in children:
                return nodes[i]