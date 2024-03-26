class Solution {
    public boolean containsDuplicate(int[] nums) {
         HashMap<Integer,Integer> hm=new HashMap(); 
        for(int a:nums){
            if(hm.getOrDefault(a,0)==1) {
                return true;
            }else{
                hm.put(a,1);
            }
        }

        return false;
         

    }
}