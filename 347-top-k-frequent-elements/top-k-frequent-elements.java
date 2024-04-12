class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm=new HashMap();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }

    PriorityQueue<Map.Entry<Integer,Integer>> pq=
    new PriorityQueue<>((e1,e2)-> e1.getValue()-e2.getValue());

    for(Map.Entry<Integer,Integer> e: hm.entrySet()){
        pq.add(e);
        if(pq.size()>k){
            pq.poll();
        }    
      
    }

    int[] ans =new int[k];
    int i=0;
    while(!pq.isEmpty()){
        ans[i]=pq.poll().getKey();
        i++;
    }

    // for(int i=0;i<k;i++){
    //     ans[i]=pq.poll().getKey();
    // }

    return ans;
    
    }
}