


public class MaxSubArray {

    /**
     * Determines if you can reach the last index of the array.
     *
     * @param nums an array where each element represents your maximum jump length from that position
     */
    public int maxAmountRobb(int[] nums) {
        // TODO: Implement the logic here
      int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
        
    }

    public static void main(String[] args) {
        MaxSubArray solution = new MaxSubArray();
        int[] nums2 = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Example 2: " + solution.maxAmountRobb(nums2));
        int [] nn={-5, -2, -8};
                System.out.println("Example 2: " + solution.maxAmountRobb(nn));

    }
}
