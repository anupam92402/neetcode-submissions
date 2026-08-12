class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length;){
            int start = i + 1;
            int end = nums.length - 1;
            while(start < end){
                if(nums[start] + nums[end] + nums[i] == 0){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[start]);
                    temp.add(nums[end]);
                    result.add(new ArrayList<>(temp));
                    start++;
                    end--;
                    while(start < nums.length && nums[start] == nums[start - 1]){
                        start++;
                    }
                    while(end > 0 && nums[end] == nums[end + 1]){
                        end--;
                    }
                }else if(nums[start] + nums[end] + nums[i] > 0){
                    end--;
                }else{
                    start++;
                }
            }
            i++;
            while(i < nums.length && nums[i] == nums[i - 1]){
                i++;
            }
        }
        return result;
    }
}
