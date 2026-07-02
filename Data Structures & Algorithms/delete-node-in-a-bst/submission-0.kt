/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun deleteNode(root: TreeNode?, key: Int): TreeNode? {
        if(root == null) return null
        if(key == root.`val`){
            //Case 1: No child
                if(root.left == null && root.right == null) return null

            //Case 2: Single Child
                if(root.left == null){
                    return root.right
                }
                if (root.right == null){
                    return root.left
                }

            //Case 3: 2 children 
            val successor = findInorderSuccessor(root.right!!) // left most node of right subtree
            root.`val` = successor.`val`
            root.right = deleteNode(root.right,successor.`val`)
        }else if(key < root.`val`){
            root.left = deleteNode(root.left,key)
        }else{
            root.right = deleteNode(root.right,key)
        }
        return root
    }

    fun findInorderSuccessor(root:TreeNode):TreeNode{
        var current = root
        while(current.left != null){
            current = current.left!!
        }
        return current
    }
}
