/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun inorderTraversal(root: TreeNode?): List<Int> {
        val result = mutableListOf<Int>()
        inorder(root,result)
        return result
    }

    fun inorder(root:TreeNode?,result:MutableList<Int>){
        if(root == null) return
        // left traverse 
        inorder(root.left,result)
        // store
        result.add(root.`val`)
        // right traverse
        inorder(root.right,result)
    }
}
