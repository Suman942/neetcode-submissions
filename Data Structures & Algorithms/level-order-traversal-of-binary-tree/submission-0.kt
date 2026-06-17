/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun levelOrder(root: TreeNode?): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
        if(root == null) return result
        val queue = ArrayDeque<TreeNode>()
        queue.addLast(root)

        while(queue.isNotEmpty()){
            val current = mutableListOf<Int>()
            repeat(queue.size){
                val pop = queue.removeFirst()
                current.add(pop.`val`)
                if(pop?.left != null){
                    queue.addLast(pop.left)
                }
                if(pop?.right != null){
                    queue.addLast(pop.right)
                }
            }
            result.add(current)
        }

        return result
    }
}
