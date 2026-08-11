class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        String copy = new String(s);
        copy = copy.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(char ch : copy.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                sb.append(ch);
            }
        }

        int end = sb.length() - 1;
        while(start < end){
            if(sb.charAt(start) != sb.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
