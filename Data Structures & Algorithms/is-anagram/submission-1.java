class Solution {
    public boolean isAnagram(String s, String t) {
        int[] count = new int[26];
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            count[ch - 'a']++;
        }
        for(int i = 0; i < t.length(); i++){
            char ch = t.charAt(i);
            count[ch - 'a']--;
        }
        for(int c : count){
            if(c != 0){
                return false;
            }
        }
        return true;
    }
}
