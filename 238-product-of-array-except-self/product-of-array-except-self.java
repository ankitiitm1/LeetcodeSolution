class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] ans= new int[n];
        int prefix=1;
        int postfix=1;
        
        // Adding prefix multiple and save in ans array;
        for(int i=0;i<n;i++){
            ans[i]=prefix;
            prefix *=nums[i];
        }
        // Adding postfix multiple and nultply by prefix and save in ans array;
        for(int i=n-1;i>=0;i--){
            ans[i]*=postfix;
            postfix*=nums[i];
        }
        return ans;
    }
}