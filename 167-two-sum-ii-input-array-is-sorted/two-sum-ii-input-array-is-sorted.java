class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start=0;
        int last=numbers.length-1;
        while(start<last){
            int currSum=numbers[start]+numbers[last];
            if(currSum<target){
                start++;
            }else if(currSum>target){
                last--;
            }else{ 
              return new int[]{start+1,last+1};
            }
        }
        return new int[]{0,0};
    }
}