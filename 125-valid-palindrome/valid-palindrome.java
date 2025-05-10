class Solution {
    public boolean isPalindrome(String s) {

        int l= s.length();
        int start=0;
        int last=l-1;

        while(start<=last){
           char currFirst=s.charAt(start);
           char currLast = s.charAt(last);
           
           if(!Character.isLetterOrDigit(currFirst)){
             start++;
           }else if(!Character.isLetterOrDigit(currLast)){
            last--;
           }else{
           if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
        			return false;
        		}
                start++;
                last--;
           }

        }
        
        return true;
    }
}