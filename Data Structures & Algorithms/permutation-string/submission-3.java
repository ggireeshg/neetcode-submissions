class Solution {
    public boolean checkInclusion(String s1, String s2) {
       int n1 = s1.length();
        int n2 = s2.length();

        // If s1 is longer than s2, s2 cannot contain a permutation of s1
        if (n1 > n2) {
            return false;
        }

        int[] count1 = new int[26];
        int[] count2 = new int[26];

        // Initialize frequency arrays for s1 and the first window of s2
        for (int i = 0; i < n1; i++) {
            count1[s1.charAt(i) - 'a']++;
            count2[s2.charAt(i) - 'a']++;
        }

        // Check if the very first window matches
        if (Arrays.equals(count1, count2)) {
            return true;
        }

        // Slide the window across s2 one character at a time
        for (int i = n1; i < n2; i++) {
            // Add the incoming character to the right
            count2[s2.charAt(i) - 'a']++;
            // Remove the outgoing character from the left
            count2[s2.charAt(i - n1) - 'a']--;

            // Check if the current window matches s1
            if (Arrays.equals(count1, count2)) {
                return true;
            }
        }

        return false;
    }
}

