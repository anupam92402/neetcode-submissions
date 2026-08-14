class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character>set = new HashSet<>();
        int start = 0;
        int end = 0;
        int result = 0;
        while(end < s.length()){
            char ch = s.charAt(end);
            while(start < end && set.contains(ch)){
                set.remove(s.charAt(start));
                start++;
            }
            set.add(ch);
            result = Math.max(result, set.size());
            end++;
        }
        return result;
    }
}
