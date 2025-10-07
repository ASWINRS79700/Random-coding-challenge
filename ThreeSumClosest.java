import java.util.Arrays;

class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int closestSum = nums[0] + nums[1] + nums[2]; // initial guess
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1, right = n - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                // update if closer
                if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
                    closestSum = sum;
                }
                if (sum == target) {
                    return sum; // exact match, best possible
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return closestSum;
    }

    public static void main(String[] args) {
        ThreeSumClosest sol = new ThreeSumClosest();
        System.out.println(sol.threeSumClosest(new int[]{3, 1, -100, -3}, 1)); // 2
        System.out.println(sol.threeSumClosest(new int[]{0, 0, 0}, 1));       // 0
        System.out.println(sol.threeSumClosest(new int[]{1,1,1,1}, -100));    // 3
    }
}
