
//https://www.geeksforgeeks.org/problems/recursively-remove-all-adjacent-duplicates0744/1?page=1&category=Recursion&sortBy=submissions
// Input: s = "geeksforgeek"
// Output: "gksforgk"
// Explanation:  g(ee)ksforg(ee)k -> gksforgk
class StringRemoveDuplicates {
    public static void main(String[] args) {
        String s="keekeeksorgeek";
        System.out.println(s);
        String r="";
        int i=0;
        while(i==0){
                r= re(s,s.length(),false);
                if(s.length()==r.length()){
                    break;
                }
                s=r;
        }
        System.out.println(r);
    }

    public static String re(String s,int n, boolean r){
        if(n==0){
            
            return s;
        }
        if(n!=1&&s.charAt(n-1)==s.charAt(n-2)){
            if(r){
                s=s.substring(0,n-1)+s.substring(n,s.length());
               return re(s, n-1, true);
            }else{
                return re(s, n-1, true);
            }
        }else{
            if(r){
                s=s.substring(0,n-1)+s.substring(n+1,s.length());

              return  re(s, n-1, false);
            }else{
                return re(s, n-1, false);
            }
        }

    }
}
