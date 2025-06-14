class Solution {
    public int[] dailyTemperatures(int[] temps) {
        int [] ans =new int[temps.length];
        Stack<Integer> stk=new Stack<>();
        for(int i=0;i<temps.length;i++){
           while(!stk.isEmpty() && temps[stk.peek()]<temps[i]){
             int x = stk.pop();
             ans[x]=i-x;
             }
             stk.push(i);
        }

        return ans;
    }
}