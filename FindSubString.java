import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class FindSubString {
    public List<Integer> findSubString(String s, String p) {
        List<Integer> res=new ArrayList<>();
        List<Integer> r= Arrays.asList(2, 3, 4, 6, 8, 9);
        r.stream().filter(r1->r1%2==0).forEach((a)->{
            System.out.println(a);
        });
        List<Integer> rrr=r.stream().map((rr)->{
            if(rr%2==0){
                return rr;
            }else
            return null;
        }).filter(r1->r1!=null).toList();
        Set<Integer> st=rrr.stream().distinct().collect(Collectors.toSet());
        System.out.println(rrr);
        System.out.println(st);
       int [] ss=new int[26];
       int [] pp=new int[26];
       int win=p.length();
       for(int i=0;i<win;i++){
            ss[p.charAt(i)-'a']++;
       }
       for(int i=0;i<s.length();i++){
        if(i+win<=s.length()){
            String sub=s.substring(i,i+win);
            if(sub.equals(p)){
                res.add(i);
            }
        }else
        break;
       }
       return res;
    // for(int i=0;i<s.length();i++){
    //     if(win-1<i){
    //         pp[s.charAt(i-win)-'a']--;
    //     }                                findanagram
    //     pp[s.charAt(i)-'a']++;
    //     if(Arrays.equals(pp,ss)){
    //         res.add(i-win+1);
    //     }
    // }
    // return res;
    }

    public static void main(String[] args) {
        FindSubString sol = new FindSubString();

        System.out.println(sol.findSubString("ababcbabacd", "abab")); // [0,6]
        System.out.println(sol.findSubString("abab", "ab"));         // [0,1,2]
        System.out.println(sol.findSubString("abcbababcd", "abc"));  
    }
}
