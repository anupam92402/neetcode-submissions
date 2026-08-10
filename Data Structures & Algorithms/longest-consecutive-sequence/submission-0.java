class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int result = 0;
        for(int num : nums){
            if(set.contains(num + 1)){
                continue;
            }
            int n = num;
            int count = 0;
            while(set.contains(n)){
                count++;
                n--;
            }
            result = Math.max(result, count);
        }
        return result;
    }
}
