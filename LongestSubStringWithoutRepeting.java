
import java.util.ArrayList;
import java.util.List;


class LongestSubStringWithoutRepeting {
    public int lengthOfLongestSubstringWithoutRepeting(String s) {
        // HashMap<Character, Integer>kk=new HashMap<>();
        List<Character>kk=new ArrayList<Character>();
        int left=0,max=0;
        for(int i=0;i<s.length();i++){
                char c = s.charAt(i);
                if(!kk.contains(c)){
                     kk.add(c);  
                }
               else{
                kk.removeFirst();
                kk.add(c);   
                left++;
               } 
               max=Math.max(max,i-left+1);
            System.out.println(kk);
        }
        return Math.abs(max);
    }

    public static void main(String[] args) {
        LongestSubStringWithoutRepeting sol = new LongestSubStringWithoutRepeting();
        
        // test cases
        // System.out.println(sol.lengthOfLongestSubstringWithoutRepeting("ecebte")); // expected 
        // System.out.println(sol.lengthOfLongestSubstringWithoutRepeting("aa"));    // expected 2
        System.out.println(sol.lengthOfLongestSubstringWithoutRepeting("abcadcacayuutfyncaca")); // expected 11
    }
}
