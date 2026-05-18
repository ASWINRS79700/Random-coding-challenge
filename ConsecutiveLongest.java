public class ConsecutiveLongest {
    public int longestOnes(String s, int k) {
        int[] count = new int[26]; // frequency of characters in window
        int maxCount = 0;          // count of the most frequent char
        int left = 0;
        int maxLen = 0;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            count[c - 'A']++;
            maxCount = Math.max(maxCount, count[c - 'A']);
            // window size - maxCount > k → shrink
            while (right - left + 1 - maxCount > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        ConsecutiveLongest solution = new ConsecutiveLongest();
        String s = "AABABAA";
        int k = 1;
        System.out.println("Example: " + solution.longestOnes(s, k)); // Output: 4
    }
}