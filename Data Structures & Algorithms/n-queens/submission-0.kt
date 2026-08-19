class Solution {
    fun solveNQueens(n: Int): List<List<String>> {
        val board = MutableList(n){ MutableList(n){"."}}
        val answer = mutableListOf<List<String>>()
        val row = 0

        nQueen(board,row,n,answer)
        return answer
    }

    fun nQueen(board:MutableList<MutableList<String>>,row:Int,n:Int,answer:MutableList<List<String>>){
        if(n == row){
            val solution = board.map{it.joinToString("")}
            answer.add(solution)
            return
        }

        for(col in 0 until n){
            if(isSafe(board,row,col,n)){
                board[row][col] = "Q"
                nQueen(board,row+1,n,answer)
                board[row][col] = "."
            }
        }
    }

    fun isSafe(board:MutableList<MutableList<String>>,row:Int,col:Int,n:Int):Boolean{
        // horizontal
        for(c in 0 until n){
            if(board[row][c] == "Q"){
                return false
            }
        }
        // vertical
         for(r in 0 until n){
            if(board[r][col] == "Q"){
                return false
            }
        }

        // left diagonal
        var rL = row - 1
        var cL = col - 1

        while(rL >= 0 && cL >= 0){
             if(board[rL][cL] == "Q"){
                return false
            }
            rL--
            cL--
        }

        // right diagonal
        var rR = row - 1
        var cR = col + 1

        while(rR >= 0 && cR < n){
             if(board[rR][cR] == "Q"){
                return false
            }
            rR--
            cR++
        }

        return true
    }
}
