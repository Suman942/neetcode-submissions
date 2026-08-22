class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val rows = Array(9){mutableSetOf<Char>()}
        val columns = Array(9){mutableSetOf<Char>()}
        val grids = Array(9){mutableSetOf<Char>()}

        for(row in 0 until 9){
            for(col in 0 until 9){
                val element = board[row][col]
                if(element == '.') continue

                val grid = (row/3) * 3 + (col/3)
                
                if(rows[row].contains(element) || 
                columns[col].contains(element) ||
                grids[grid].contains(element)){
                    return false
                }

                rows[row].add(element)
                columns[col].add(element)
                grids[grid].add(element)
            }
        }
        return true
    }
}
