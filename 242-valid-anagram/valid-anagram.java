class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int j = 0; j < s.length(); j++) {
            char i = s.charAt(j);
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }
        for (int j = 0; j < t.length(); j++) {
            char i = t.charAt(j);
            hm.put(i, hm.getOrDefault(i, 0) - 1);
        }

      for (int val : hm.values()) {
            if (val != 0) {
                return false;
            }
        }
        
        return true;
       
    }
}