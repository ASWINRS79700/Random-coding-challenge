



class HelloWorld {
    public static void main(String[] args) {
        int[] coins = {9}; // Example coin denominations
        int sum = 387420489; // Example sum
        int n = coins.length;
        // List<Integer>res=new ArrayList<Integer>();
        int result = recur(n,sum,coins);
        if(sum==n){
            System.out.println("power is 1");
        }else
            System.out.println(result+"  result");
    }
    public static int recur(int n,int sum
    // ,List<Integer>res
    ,int[]in) {
        if(sum==1){
            return 1;
        }else if(sum>1&&n>0){
            if(sum%in[n-1]==0){
                return 1+recur(n, sum/in[n-1]==1?0:sum/in[n-1],  in);
            }else{
                return recur(n-1, sum, in);
            }
        }else{
            return 0;
        }
    }
} 