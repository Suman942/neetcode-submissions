/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun preorderTraversal(root: TreeNode?): List<Int> {
        val result = mutableListOf<Int>()
        preOrder(root,result)
        return result
    }

    fun preOrder(root:TreeNode?,result:MutableList<Int>){
        if(root == null) return
        //add
        result.add(root.`val`)
        // left
        preOrder(root.left,result)
        //right
        preOrder(root.right,result)

    }
}
