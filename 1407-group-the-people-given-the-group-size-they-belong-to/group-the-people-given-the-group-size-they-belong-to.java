class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> ans= new ArrayList<List<Integer>>();
        int n= groupSizes.length;
        HashMap<Integer, List<Integer>> hm= new HashMap<>();
        
        for(int i=0;i<n;i++){
            int curr=groupSizes[i];
             if(hm.containsKey(curr) && hm.get(curr).size()<curr){
                hm.get(curr).add(i);
                 System.out.println(hm.get(curr));
             }else{
                 if(hm.get(curr)!=null && hm.get(curr).size()==curr){
                     ans.add(hm.get(curr));
                 }  
                 ArrayList<Integer> arr=new ArrayList();
                 arr.add(i);
                 hm.put(curr, arr);            
             }
        }
        
        for (Map.Entry<Integer, List<Integer>> set : hm.entrySet()) {
            ans.add(set.getValue());
		}
        return ans;

    }
}