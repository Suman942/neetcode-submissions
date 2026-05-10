class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap();
        for(String str: strs){
            int[] count = new int[26];
            for (char ch : str.toCharArray()){
                count[ch - 'a']++;
            }
            StringBuilder builder = new StringBuilder();
            for(int c:count){
                builder.append(c).append("#");
            }
            String key = builder.toString();
            map.computeIfAbsent(key,k->new ArrayList()).add(str);
        }
          // Print the grouped anagrams
        List<List<String>> groupedAnagrams = new ArrayList<>(map.values());
        return groupedAnagrams;
    }
}
