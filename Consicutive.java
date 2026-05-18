


public class Consicutive {

    
     public int longestOnes(int[] nums, int p) {
       int maxL=0,max=0,left=0,zeros=0;
       //Stack<Integer>index=new Stack<>();

       for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zeros++;
           }
           if(zeros>p){
            while(nums[left]!=0){
                left++;
            }
            left++;
            System.out.println("l :"+left+" R"+i);
            zeros--;
           }
           max=Math.max(max, i-left+1);
       }
       return max;
    }

    public static void main(String[] args) {
                Consicutive solution = new Consicutive();
        int[] nums2 = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        //             0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,
        int k=3;
        System.out.println("Example 2: " + solution.longestOnes(nums2,k));
    }
}
