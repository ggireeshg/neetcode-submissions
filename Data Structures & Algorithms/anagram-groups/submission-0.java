class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> result = new HashMap();
        for(String str: strs) {
            char[] chars = new char[26];
            for(char ch: str.toCharArray()) {
                    chars[ch-'a'] ++;

            }

            String key = Arrays.toString(chars);
            result.putIfAbsent(key, new ArrayList());
            result.get(key).add(str);
        }
        return new ArrayList<>(result.values());
    }
}
