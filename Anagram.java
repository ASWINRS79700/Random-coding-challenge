import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Anagram {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) return result;

        int[] countP = new int[26];
        int[] countS = new int[26];

        // build pattern frequency
        for (char c : p.toCharArray()) {
            countP[c - 'a']++;
        }

        int window = p.length();

        for (int i = 0; i < s.length(); i++) {
            // add current char to window count
            countS[s.charAt(i) - 'a']++;

            // remove left char if window size exceeded
            if (i >= window) {
                countS[s.charAt(i - window) - 'a']--;
            }

            // check match
            if (Arrays.equals(countS, countP)) {
                result.add(i - window + 1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Anagram sol = new Anagram();

        System.out.println(sol.findAnagrams("cbacbabacd", "abab")); // [0,6]
        System.out.println(sol.findAnagrams("abab", "ab"));         // [0,1,2]
        System.out.println(sol.findAnagrams("cbaebabacd", "abc"));  // [0,6]
    }
}
