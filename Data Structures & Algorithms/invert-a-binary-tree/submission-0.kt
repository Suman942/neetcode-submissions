/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun invertTree(root: TreeNode?): TreeNode? {
        if(root == null) return null

      return swap(root)
    }
    fun swap(root:TreeNode?):TreeNode?{
        if(root == null) return null
        val temp = root.left
        root.left = root.right
        root.right = temp
        swap(root.left)
        swap(root.right)
         return root
    }
}
