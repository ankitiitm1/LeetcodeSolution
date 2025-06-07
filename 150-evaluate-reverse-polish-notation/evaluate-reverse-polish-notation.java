class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk=new Stack<>();

        int n=tokens.length;
        if(n<3) return Integer.parseInt(tokens[0]);
        int ans=0;
        for(int i=0;i<n;i++){
            
            if(tokens[i].equals("+")){
                int x=stk.pop();
                int y=stk.pop();
                ans=x+y;
                stk.push(ans);
            }else if(tokens[i].equals("-")){
                int x=stk.pop();
                int y=stk.pop();
                ans=y-x;
                stk.push(ans);
            }else if(tokens[i].equals("*")){
               
                int x=stk.pop();
                int y=stk.pop();
                ans=x*y;
                stk.push(ans);
            }else if(tokens[i].equals("/")){
                int x=stk.pop();
                int y=stk.pop();
                ans=y/x;
                stk.push(ans);
            }else{
                stk.push(Integer.parseInt(tokens[i]));
            }
        }

     return ans;
    }
}