
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Each element nums[i] represents the maximum length of a forward jump from index i. In other words, if you are at index i, you can jump to any index (i + j) where:
// 0 <= j <= nums[i] and
// i + j < n
// Return the minimum number of jumps to reach index n - 1. The test cases are generated such that you can reach index n - 1.
// Example 1:
// Input: nums = [2,3,1,1,4]
// Output: 2
// Explanation: The minimum number of jumps to reach the last index is 2. Jump 1 step from index 0 to 1, then 3 steps to the last index.
// Example 2:
// Input: nums = [2,3,0,1,4]
// Output: 2
public class JumpGame2 {

    static class Solution {

        public int wordBreak(int[] nums) {
            int n = nums.length;
            if (n <= 1) {
                return 0; // Already at the last index
            }
            int jumps = 0, current = 0, farthest = 0;        // Count of jumps taken
            for (int i = 0; i < nums.length - 1; i++) {
                farthest = Math.max(farthest, i + nums[i]);
                if (current == i) {
                    jumps++;
                    current = farthest;
                }
                if (n - 1 <= current) {
                    break;
                }
            }
            return jumps;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {2, 3, 0, 1, 4};
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");        // Add
        map.put(2, "Two");
        map.put(1, "Uno");        // Update key 1
        System.out.println(map);  // {1=Uno, 2=Two}
        List<Integer> oo = map.keySet().stream().collect(Collectors.toList());
        int n = sol.wordBreak(nums);
        System.out.println(n);
    }
}
