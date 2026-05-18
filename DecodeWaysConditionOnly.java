public class DecodeWaysConditionOnly {

    public static int decodeCount(String s) {
        if (s == null || s.length() == 0) return 0;
        if (s.charAt(0) == '0') return 0;

        int n = s.length();
        int[] dp = new int[n + 1];

        dp[0] = 1; // empty string
        dp[1] = 1; // first character is guaranteed not '0'

        for (int i = 2; i <= n; i++) {
            // Single digit decoding
            char oneChar = s.charAt(i - 1);
            if (oneChar != '0') {
                dp[i] =dp[i]+ dp[i - 1];
            }

            // Two digit decoding
            int twoDigit = Integer.parseInt(s.substring(i - 2, i));
            if (twoDigit >= 10 && twoDigit <= 26) {
                dp[i] =dp[i]+ dp[i - 2];
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(decodeCount("9199"));   // 2
        System.out.println(decodeCount("226"));  // 3
        //9999
        //00000
        //9199
        //11
    }
}