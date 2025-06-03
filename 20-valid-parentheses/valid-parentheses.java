class Solution {
    public boolean isValid(String s) {
       Stack<Character> stack=new Stack<>();
       for (char c : s.toCharArray()){
           if(c=='('|| c=='{'||c=='['){
               stack.push(c);
           }else{
               if(stack.empty()){return false;} // if opening is not present for closing bracket
               if (c == ')' && stack.peek() == '(') {
                    stack.pop();
                }else if (c == '}' && stack.peek() == '{') {
                    stack.pop();
                } else if (c == ']' && stack.peek() == '[') {
                    stack.pop();
                }else {
                    return false; // If for this closing bracket top is not corresponding opening
                } 
           }
       }
       return stack.empty(); // if opening not present
    }
}