class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hm=new HashMap();
        Stack<Integer> stk= new Stack<>();
        for(int i=0;i<nums2.length;i++){
                while(!stk.isEmpty() && stk.peek()<nums2[i]){
                    hm.put(stk.pop(),nums2[i]);
                }
                stk.push(nums2[i]);
        }

        for (int i = 0; i < nums1.length; i++) { 
            nums1[i] = hm.containsKey(nums1[i]) ? hm.get(nums1[i]) : -1; 
        }
        return nums1;
        }
    }

   