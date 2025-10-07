import java.util.ArrayList;
import java.util.List;

public class coinExchangeCombinationsAns {

    // Function to print all the possible ways to make a given amount
    public static void printWays(int[] coins, int amount) {
        List<Integer> currentCombination = new ArrayList<>();
        findWays(coins, amount, 0, currentCombination);
    }

    // Recursive function to find all ways
    private static void findWays(int[] coins, int remainingAmount, int startIndex, List<Integer> currentCombination) {
        // Base case: if remaining amount is 0, print the current combination
        if (remainingAmount == 0) {
            System.out.println(currentCombination);
            return;
        }

        // If remaining amount is negative, there's no valid solution, so return
        if (remainingAmount < 0||startIndex<0) {
            return;
        }
        
        // Explore all coins from the current index onward
        for (int i = startIndex; i < coins.length; i++) {
            // Include the coin
            currentCombination.add(coins[i]);

            // Recursively try to make the remaining amount with the current coin included
            
            findWays(coins, remainingAmount - coins[i], i+1, currentCombination);

            // Backtrack: remove the last coin and try the next coin
            currentCombination.remove(currentCombination.size() - 1);
        }
    }

    public static void main(String[] args) {

        // // Input: Number of coin denominations
        // System.out.print("Enter the number of denominations: ");
        // int n = scanner.nextInt();

        // Input: Coin denominations
        int[] coins = {1,2,3,2};
        // System.out.println("Enter the coin denominations: ");
        // for (int i = 0; i < n; i++) {
        //     coins[i] = scanner.nextInt();
        // }

        // // Input: Amount to make
        // System.out.print("Enter the amount: ");
        // int amount = scanner.nextInt();

        // Output: All possible ways to make the amount
        System.out.println("All possible ways to make " + 4 + ":");
        printWays(coins, 4);
    }
}
