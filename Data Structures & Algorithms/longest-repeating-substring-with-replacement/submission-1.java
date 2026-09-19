class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26]; // Stores frequency of each uppercase character A-Z

                int left = 0; // Left pointer of sliding window

                int maxFreq = 0; // Maximum frequency of any single character , inside the current/seen window

                int maxLength = 0;                 // Stores the longest valid window length

                for (int right = 0; right < s.length(); right++) { // Expand the window using right pointer

                    int index = s.charAt(right) - 'A';  // Get current character index ,// Example: 'A' -> 0, 'B' -> 1, ..., 'Z' -> 25

                    freq[index]++; // Increase frequency of current character

                    maxFreq = Math.max(maxFreq, freq[index]); // Update the maximum character frequency

                    /*
                     * Current window size: right - left + 1 , Characters that need replacement: windowSize - maxFreq
                     * If replacements needed are greater than k, shrink the window from the left.
                     */
                    while ((right - left + 1) - maxFreq > k) {

                        // Remove the left character from the window
                        freq[s.charAt(left) - 'A']--;

                        // Move left pointer forward
                        left++;
                    }

                    // Update longest valid substring length
                    maxLength = Math.max(
                            maxLength,
                            right - left + 1
                    );
                }
                return maxLength;
            
    }
}
