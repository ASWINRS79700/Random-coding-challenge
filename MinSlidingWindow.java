
class MinSlidingWindow {

    // public String sol(String s, String k) {
    //     // TODO: implement sliding window solution
    //     List<Character> kr = k.chars()
    //             .mapToObj(c -> (char) c)
    //             .collect(Collectors.toList());
    //     List<Character> rk = new ArrayList<>();
    //     int left = 0,maxN=s.length();
    //     String sub="";
    //     if (kr.contains(s.charAt(left))) {
    //         rk.add(s.charAt(left));
    //     }
    //     for (int i = 1; i < s.length(); i++) {
    //         if (kr.contains(s.charAt(i))) {
    //             if(rk.contains(s.charAt(i))){
    //                 while(!(s.charAt(left)==s.charAt(i))){
    //                     left++;
    //                 }
    //             }
    //             rk.add(s.charAt(i));
    //         }
    //         if(rk.equals(kr)){
    //             while(!rk.contains(s.charAt(left))){
    //                 left++;
    //             }
    //             if(maxN>i-left){
    //                 sub=s.substring(left,i+1);
    //                 maxN=i-left;
    //                 System.out.println(sub);
    //             }
    //         }
    //     }
    //     System.out.println(sub);
    //     return sub;
    // }


public String minWindow(String s, String t) {
    if (s.length() == 0 || t.length() == 0) return "";

    int[] count = new int[128]; // ASCII
    for (char c : t.toCharArray()) {
        count[c]++;
    }

    int left = 0, right = 0;
    int required = t.length(); // total chars needed

    int minLen = Integer.MAX_VALUE;
    int start = 0;

    while (right < s.length()) {
        char r = s.charAt(right);

        if (count[r] > 0) {
            required--;
        }
        right++;
        count[r]--;
        // valid window
        while (required == 0) {
            if (right - left < minLen) {
                minLen = right - left;
                start = left;
            }

            char l = s.charAt(left);
            count[l]++;
            if (count[l] > 0) {
                required++;
            }
            left++;
        }
    }

    return minLen == Integer.MAX_VALUE ? "" 
                                      : s.substring(start, start + minLen);
}
    public static void main(String[] args) {
        MinSlidingWindow sol = new MinSlidingWindow();// BANC
        // test cases
        System.out.println( sol.minWindow("ADOBECODEBANC", "ABC"));
        System.out.println( sol.minWindow("AAABBC", "ABC"));

    }
}
