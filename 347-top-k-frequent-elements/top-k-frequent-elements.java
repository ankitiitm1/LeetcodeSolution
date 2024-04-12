class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm=new HashMap();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }

    PriorityQueue<Map.Entry<Integer,Integer>> pq=
    new PriorityQueue<>((e1,e2)-> e2.getValue()-e1.getValue());

    for(Map.Entry<Integer,Integer> e: hm.entrySet()){
        pq.add(e);
           
    }

    int[] ans =new int[k];
    for(int i=0;i<k;i++){
        ans[i]=pq.poll().getKey();
    }

    return ans;
    
    }
}