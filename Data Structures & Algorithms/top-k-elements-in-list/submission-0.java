class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> 
        b[1] - a[1]);
        for(int key : map.keySet()){
            heap.add(new int[]{key, map.get(key)});
        }
        int[] result = new int[k];
        while(k > 0){
            result[k - 1] = heap.remove()[0];
            k--;
        }
        return result;
    }
}
