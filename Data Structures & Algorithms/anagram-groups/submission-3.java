class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);
            map.putIfAbsent(sorted, new ArrayList<>());
            map.get(sorted).add(str);
        }
        for(String key : map.keySet()){
            result.add(map.get(key));
        }
        return result;
    }
}
