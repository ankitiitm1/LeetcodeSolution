class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int i=0;
        int j=n-1;
        int vol=0;
        while(i<j){
           int currVol=Math.min(height[i],height[j])*(j-i);
            if(currVol>vol){
                vol=currVol;
            }

            if(height[i]>height[j]){
                    j--;
            }else{
                    i++;
             }


        }

        return vol;

    }
}