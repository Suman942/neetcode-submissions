class Solution {
    fun largestNumber(nums: IntArray): String {
        if(nums.isEmpty()){
            return ""
        }

        val arr = nums.map{
            it.toString()
        }.toMutableList()

        arr.sortWith{a,b ->
            (b+a).compareTo(a+b)
        }

        if(arr[0] == "0"){
            return "0"
        }

        return arr.joinToString("")
        
    }
}
