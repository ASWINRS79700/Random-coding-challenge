//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/


public class MaxArea {

    /**
     * Determines if you can reach the last index of the array.
     *
     * @param nums an array where each element represents your maximum jump length from that position
     */
    public int maxArea(int[] prices) {
        // TODO: Implement the logic here
       int max = 0;
        for(int i=0;i<prices.length;i++){
            int l=prices[i];
            int r=prices.length-1;
            while(i<r){
                int h=Math.min(l, prices[r]);
                if(h==l){
                    h=l*(r-i);
                    max=Math.max(max, h);
                    System.err.println((r-i)+":"+l);
                    break;
                }else{
                    h=h*(r-i);
                    max=Math.max(max, h);
                }
                r--;
            }
        }
        return max;
    }


    public static void main(String[] args) {
        MaxArea solution = new MaxArea();
        //int[] nums2 = {7,1,5,3,6,4};
        int[] nums2 = {1,8,6,2,5,4,8,3,7};
        System.out.println("Example 2: " + solution.maxArea(nums2));
    }
}
