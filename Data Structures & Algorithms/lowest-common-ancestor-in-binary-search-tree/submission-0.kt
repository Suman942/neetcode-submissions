/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
        // Algorithm LowestCommonAncestor(root, p, q)

        // 1. If root is NULL
        //     return NULL

        // 2. If both p and q are smaller than root
        //     Recursively search the left subtree.
        //     return LowestCommonAncestor(root.left, p, q)

        // 3. Else if both p and q are greater than root
        //     Recursively search the right subtree.
        //     return LowestCommonAncestor(root.right, p, q)

        // 4. Otherwise
        //     The current root is the Lowest Common Ancestor.
        //     return root
        //     }
        if(root == null || p == null || q == null) return root
        
        if(root.`val` > p.`val` && root.`val` > q.`val`){
            return lowestCommonAncestor(root.left,p,q)
        }else if(root.`val` < p.`val` && root.`val` < q.`val`){
            return lowestCommonAncestor(root.right,p,q)
        }

        return root
    }
}
