/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun isBalanced(root: TreeNode?): Boolean {
        if(root == null) return true
        val mod = abs(height(root.left) - height(root.right))
        if(mod > 1){
            return false
        }
        return isBalanced(root.left) && isBalanced(root.right)
    }

    fun height(root:TreeNode?):Int{
        if(root == null) return 0
        val left = height(root.left)
        val right = height(root.right)

        return maxOf(left,right) + 1
    }
}
