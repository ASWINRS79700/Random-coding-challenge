
class HelloWorld {
    int i=0;
    public static void main(String[] args) {
        int[] coins = {5,3}; 
        int sum = 45; 
        int n = coins.length;
        HelloWorld g=new HelloWorld();
        System.err.println(g.i);
        // List<Integer>res=new ArrayList<Integer>();
        int result = recur(n, sum, coins);
        if (sum == n) {
            System.out.println("power is 1");
        } else {
            System.out.println(sum + "  sum");
        }
    }

    public static int recur(int n, int sum // ,List<Integer>res
            , 
            int[] in) {
        if (sum == 1) {
            return 1;
        } else if (sum > 1 && n > 0) {
            if (sum % in[n - 1] == 0) {
                System.out.println(in[n - 1] + "*"+sum / in[n - 1]);
                return recur(n, sum / in[n - 1], in);
            } else {
                return recur(n - 1, sum, in);
            }
        } else {
            return 0;
        }
    }
}
