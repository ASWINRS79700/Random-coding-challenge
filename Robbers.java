
public class Robbers {

    /**
     * Determines if you can reach the last index of the array.
     *
     * @param nums an array where each element represents your maximum jump length from that position
     */
    public int maxAmountRobb(int[] nums) {
        // TODO: Implement the logic here
        int n1=0,n2=0;

        for(int n:nums){
            int temp=n2+n;
            temp=Integer.max(temp,n1);
            n2=n1;
            n1=temp;
        }
        return n1>n2?n1:n2;
    }

    public static void main(String[] args) {
        Robbers solution = new Robbers();
        int[] nums2 = {2,7,9,3,1};
        System.out.println("Example 2: " + solution.maxAmountRobb(nums2));
    }
}
