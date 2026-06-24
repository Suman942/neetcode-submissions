/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {
        if(root == null) return false
        if(root.left == null && root.right == null){
            return root.`val` == targetSum
        }
        val remaining = targetSum - root.`val`
        val left = hasPathSum(root.left,remaining)
        val right = hasPathSum(root.right,remaining)

        return left || right

    }
}
