class Solution {
    public boolean checkInclusion(String s1, String s2) {int n1 = s1.length(), n2 = s2.length();
        if (n1 > n2) return false;

        int[] count1 = new int[26];
        int[] count2 = new int[26];

        // 1. Build s1's frequency once
        for (char c : s1.toCharArray()) {
            count1[c - 'a']++;
        }

        // 2. Just one loop for all of s2
        for (int i = 0; i < n2; i++) {
            // Always add incoming character
            count2[s2.charAt(i) - 'a']++;

            // If window is wider than s1, drop the oldest character
            if (i >= n1) {
                count2[s2.charAt(i - n1) - 'a']--;
            }

            // Once window reaches size n1, check for a match
            if (Arrays.equals(count1, count2)) {
                return true;
            }
        }

        return false;
    }
}

