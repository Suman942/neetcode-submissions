/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun postorderTraversal(root: TreeNode?): List<Int> {
        val result = mutableListOf<Int>()
        postOrder(root,result)
        return result
    }

    fun postOrder(root:TreeNode?,result:MutableList<Int>){
        if(root == null) return
        // left traverse
        postOrder(root.left,result)
        // right traverse
        postOrder(root.right,result)
        // store
        result.add(root.`val`)
    }
}
