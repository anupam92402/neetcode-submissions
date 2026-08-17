class Solution {
    public int maxArea(int[] heights) {
        int start = 0;
        int end = heights.length - 1;
        int result = 0;
        while(start < end){
            int area = Math.min(heights[end], heights[start]) * (end - start);
            result = Math.max(area, result);
            if(heights[start] < heights[end]){
                start++;
            }else{
                end--;
            }
        }
        return result;
    }
}
