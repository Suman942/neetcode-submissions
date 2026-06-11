/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    var answer = 0
    fun diameterOfBinaryTree(root: TreeNode?): Int {       
        height(root)
       return answer
    }

    fun height(root:TreeNode?):Int{
        if(root == null) return 0

        val l = height(root.left)
        val r = height(root.right)
        answer = maxOf((l+r),answer)
        return maxOf(l,r) + 1
    }
}
