class Solution {
    public int lengthOfLongestSubstring(String s) {
         int left = 0;
        int right = 0;
        int length =0;

        HashSet<Character> set = new HashSet<>();
        while (right<s.length()) {

            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
           
            length = Math.max(length, right-left+1);
             right++;
        }
//        System.out.println(s.substring(left,length-1));
        return length;
    }
}
