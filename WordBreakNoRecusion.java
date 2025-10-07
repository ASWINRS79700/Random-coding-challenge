
//Given a string s and a dictionary of strings wordDict, return true if s can be segmented into a space-separated sequence of one or more dictionary words.

//Note that the same word in the dictionary may be reused multiple times in the segmentation.

 

// Example 1:

// Input: s = "leetcode", wordDict = ["leet","code"]
// Output: true
// Explanation: Return true because "leetcode" can be segmented as "leet code".
// Example 2:

// Input: s = "applepenapple", wordDict = ["apple","pen"]
// Output: true
// Explanation: Return true because "applepenapple" can be segmented as "apple pen apple".
// Note that you are allowed to reuse a dictionary word.
// Example 3:

// Input: s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
// Output: false
import java.util.Arrays;
import java.util.List;

public class WordBreakNoRecusion {

    static class Solution {
        public boolean wordBreak(String s, List<String> wordDict) {
            int n=s.length();
            boolean []dp=new boolean[n+1];
            dp[0]=true;
            for (int i = 1; i < n; i++) {
                for (int j = 0; j < i; j++){
                    if(dp[j]&&wordDict.contains(s.substring(j, i))){
                        dp[i]=true;
                        break;
                    }
                }
            }
            return dp[n];
            
    }}

    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example 1
        // String s1 = "leetcode";
        // List<String> dict1 = Arrays.asList("leet", "code");
        // System.out.println(s1 + " -> " + sol.wordBreak(s1, dict1)); // true

        // // Example 2
        // String s2 = "applepenapple";
        // List<String> dict2 = Arrays.asList("apple", "pen");
        // System.out.println(s2 + " -> " + sol.wordBreak(s2, dict2)); // true

        // // Example 3
        // String s3 = "catsandog";
        // List<String> dict3 = Arrays.asList("cats", "dog", "sand", "and", "cat");
        // System.out.println(s3 + " -> " + sol.wordBreak(s3, dict3)); // false

        // Custom Example
        String s4 = "cars";
        List<String> dict4 = Arrays.asList("car", "ca", "rs");
        System.out.println(s4 + " -> " + sol.wordBreak(s4, dict4)); // true
    }
}
