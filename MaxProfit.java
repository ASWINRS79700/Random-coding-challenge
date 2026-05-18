//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class MaxProfit {

    /**
     * Determines if you can reach the last index of the array.
     *
     * @param nums an array where each element represents your maximum jump length from that position
     */
    public int maxProfit(int[] prices) {
        // TODO: Implement the logic here
       int max = 0, n = 0;
        List<Integer> pp = Arrays.stream(prices)
                .boxed()
                .collect(Collectors.toList());
        List<Integer> rr = Arrays.stream(prices)
                .boxed()
                .collect(Collectors.toList());
        
        for (int i = prices.length-1; i >= 0; i--) {
            int nn = pp.get( i);
            pp.remove(i);
            rr.remove(Integer.valueOf(nn) );
            Collections.sort(rr);
            if (!rr.isEmpty()) {
                if (max <(nn - rr.get(0))) {
                    max=nn-rr.get(0);
                    n = i+1;
                }
            }

        }
        return n;
    }

    public int maxProfitChatgpt(int[] prices) {
    int minPrice = Integer.MAX_VALUE;
    int maxProfit = 0;

    for (int i = 0; i < prices.length; i++) {
        // update minimum price (buy)
        if (prices[i] < minPrice) {
            minPrice = prices[i];
        } 
        // calculate profit (sell)
        else {
            int profit = prices[i] - minPrice;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }
    }

    return maxProfit;
}

    public static void main(String[] args) {
        MaxProfit solution = new MaxProfit();
        //int[] nums2 = {7,1,5,3,6,4};
        int[] nums2 = {1,2};
        System.out.println("Example 2: " + solution.maxProfit(nums2));
    }
}
