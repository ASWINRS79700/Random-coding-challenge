
public class JumpGame {

    /**
     * Determines if you can reach the last index of the array.
     *
     * @param nums an array where each element represents your maximum jump length from that position
     * @return true if you can reach the last index, false otherwise
     */
    public int canJump(int[] nums) {
        // TODO: Implement the logic here
     int maxReachable=0,res = 0;
    for (int i = 0; i < nums.length; i++) {
        if (i > maxReachable) return 0; // can't move further
        int temp = Math.max(maxReachable, i + nums[i]);
        if(maxReachable<temp){
                System.out.println(String.valueOf(maxReachable)+nums[i]);
                res++;
            maxReachable=temp;
        }
        if (maxReachable >= nums.length - 1) return res; // can reach or pass the end
    }
    return res;
    }

    public static void main(String[] args) {
        JumpGame solution = new JumpGame();

        // Example 1
        // int[] nums1 = {2, 3, 0, 0, 4};
        // System.out.println("Example 1: " + solution.canJump(nums1)); // Expected: true

        // Example 2
        int[] nums2 = {1,2,1,1,1};
        System.out.println("Example 2: " + solution.canJump(nums2)); // Expected: false

        // You can add more test cases here
    }
}
