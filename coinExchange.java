
// unlimited coins 

class HelloWorld {
    public static void main(String[] args) {
        int[] coins = {1, 2, 3}; // Example coin denominations
        int sum = 4; // Example sum
        int n = coins.length;
        System.out.println(n);
        int result = recur(coins,n,sum);
        System.out.println("Number of ways to make sum " + sum + " is: " + result);
    
    }
    public static int recur(int []num,int n,int sum) {
        if(sum==0){
            return 1;
        }
        else if(sum<0||n<=0){
            return 0;
        }
        else{
            return recur(num, n, sum-num[n-1])+recur(num, n-1, sum);
        }
    }
}