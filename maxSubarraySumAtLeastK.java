





public class maxSubarraySumAtLeastK{

public static void main(String[] args) {
        //int arr[] = {1,2,3};
                int arr[] = {2, -1, 2};

        int K = 2;
        System.out.println(maxSubarraySumAtLeastK(arr, K));
    }

    public static  int maxSubarraySumAtLeastK(int[] arr, int K){
        int n=arr.length;
        int maxSum=0,max=0,wind=0;
        for(int i=0;i<n;i++){
            maxSum=wind=0;
            for(int j=i;j<n;j++){
                if(j-i+1>=K){
                    wind=Math.max(wind+arr[j], arr[j]);
                }else{
                    wind=wind+arr[j];
                }
            }
            max=Math.max(max, wind);
        }
        return max;
    }
    
}