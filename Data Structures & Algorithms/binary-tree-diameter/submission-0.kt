/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun diameterOfBinaryTree(root: TreeNode?): Int {
        if(root == null) return 0
        val lD = diameterOfBinaryTree(root.left)
        val rD = diameterOfBinaryTree(root.right)
        val cH = height(root.left) + height(root.right)
       return maxOf(lD,rD,cH)
    }

    fun height(root:TreeNode?):Int{
        if(root == null) return 0

        val l = height(root.left)
        val r = height(root.right)
        return maxOf(l,r) + 1
    }
}
