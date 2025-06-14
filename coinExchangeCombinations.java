
import java.util.ArrayList;
import java.util.List;


// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        int[] coins = {1, 2, 5}; // Example coin denominations
        int sum = 6; // Example sum
        int n = coins.length;
        // String s="aabbcc";
        // System.out.println(s.charAt(0));
        List<Integer> res=new ArrayList<>();
        int result = recur(coins,n,sum,res);
        System.out.println("Number of ways to make sum " + sum + " is: " + result);
    
    }
    public static int recur(int []num,int n,int sum,List<Integer> res) {
        if(sum==0){
            System.out.println(res);
            if(!res.isEmpty())
            res.removeLast();
            return 1;
        }
        else if(sum<0||n<=0){
            if(!res.isEmpty())
            res.removeLast();            
            return 0;
        }
        else{
            List<Integer>temp= res;
            temp.add(num[n-1]);
            return recur(num, n, sum-num[n-1],temp)+recur(num, n-1, sum,res);
        }
    }
} 