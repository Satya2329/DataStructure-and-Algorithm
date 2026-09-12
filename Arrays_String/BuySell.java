package Arrays_String;

public class BuySell {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }
        
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; // Track the lowest price seen so far (best buy day)
            } else {
                int profit = price - minPrice; // Calculate profit if we sell today
                if (profit > maxProfit) {
                    maxProfit = profit; // Update max profit if higher
                }
            }
        }
        
        return maxProfit;
    }

    public static void main(String[] args) {
        BuySell solver = new BuySell();
        int[] prices = {7, 1, 5, 3, 6, 4};
        
        int result = solver.maxProfit(prices);
        System.out.println("Maximum profit: " + result);
    }
}

