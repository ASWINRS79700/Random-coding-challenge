
//https://leetcode.com/problems/longest-repeating-character-replacement/description/

class LongestRepeatingCharReplacement {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        // TODO: implement sliding window solution
      
        int[] freq = new int[26];
        int left = 0;
        int maxFreq = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            freq[c - 'A']++;

            maxFreq = Math.max(maxFreq, freq[c - 'A']);

            // window size - maxFreq = chars to replace
            while ((right - left + 1) - maxFreq > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        LongestRepeatingCharReplacement sol = new LongestRepeatingCharReplacement();
        sol.lengthOfLongestSubstringKDistinct("ABAB", 2); // 4 
        // test cases
       

    }
}
