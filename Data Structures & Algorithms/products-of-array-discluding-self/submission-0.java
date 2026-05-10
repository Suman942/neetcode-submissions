class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans= new int[n];

        //prefix
        int prefix = 1;
        for(int i = 0; i<n; i++){
            ans[i] = prefix;
            prefix *= nums[i] ;
        }

        // suffix
        int suffix = 1;
        for(int i = n-2 ; i>=0;i--){
            suffix *= nums[i+1];
            ans[i] *= suffix;
        }
        return ans;
    }
}  
