/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    var idx = -1
    fun buildTree(preorder: IntArray, inorder: IntArray): TreeNode? {
        return helper(preorder,inorder,0,inorder.size - 1)
    }
    fun helper(preorder: IntArray, inorder: IntArray,left:Int,right:Int): TreeNode?{
        if(left > right) return null
        idx++
        val root = TreeNode(preorder[idx])
        // search
        val iIdx = search(inorder,left,right,preorder[idx])

        root.left = helper(preorder,inorder,left,iIdx-1)
        root.right = helper(preorder,inorder,iIdx+1,right)

        return root
    }

    fun search(inorder:IntArray,left:Int,right:Int,value:Int):Int{
        var l = left
        while(l <= right){
            if(inorder[l] == value){
                return l
            }
            l++
        }
        return -1
    }
}
