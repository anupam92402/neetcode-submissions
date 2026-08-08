class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer>map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target - nums[i])){
                int idx1 = map.get(target - nums[i]);
                int idx2 = i;
                if(idx1 < idx2){
                    return new int[]{idx1, idx2};
                }else{
                    return new int[]{idx2, idx1};
                }
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
