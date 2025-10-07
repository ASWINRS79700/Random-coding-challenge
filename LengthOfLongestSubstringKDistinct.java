
import java.util.HashMap;


class LengthOfLongestSubstringKDistinct {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        // TODO: implement sliding window solution
        HashMap<Character, Integer>kk=new HashMap<>();
        int left=0,max=0;
        for(int i=0;i<s.length();i++){
                 char c = s.charAt(i);
                if(kk.containsKey(c)){
                    kk.put(c, kk.get(c)+1);
                }else{
                    kk.put(c, 1);
                }
                while(kk.size()>k){
                    char l=s.charAt(left);
                    kk.put(l, kk.get(l)-1);
                    if(kk.get(l)<=0){
                        kk.remove(l);
                    }
                    left++;
                 }
                 max=Math.max(max, i-left+1);
        }
        return max;
    }

    public static void main(String[] args) {
        LengthOfLongestSubstringKDistinct sol = new LengthOfLongestSubstringKDistinct();
        
        // test cases
        System.out.println(sol.lengthOfLongestSubstringKDistinct("ecebte", 2)); // expected 
        System.out.println(sol.lengthOfLongestSubstringKDistinct("aa", 1));    // expected 2
        System.out.println(sol.lengthOfLongestSubstringKDistinct("abcadcacacaca", 3)); // expected 11
    }
}
