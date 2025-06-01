class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<n-2;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int start=i+1;
            int end=n-1;

            while(start<end){
                int currSum=nums[start]+nums[end];
                if(currSum==-nums[i]){
                    ans.add(Arrays.asList(nums[i],nums[start],nums[end]));
                    while(start<end && nums[start]==nums[start+1]){start++;};
                    while(start<end && nums[end]==nums[end-1]){end--;};
                    start++;
                    end--;
                }else if(currSum>-nums[i]){
                    end--;
                }else{
                    start++;
                }
            }

        }
        return ans;
        
        
    }
}