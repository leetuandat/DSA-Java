/**
 * The link of this problem is <a href = "https://leetcode.com/problems/best-time-to-buy-and-sell-stock/"> here </a>.
 *
 * @author X.e.n.g
 * @version 1.0
 * @project name: DSA-Java
 * @date: 10-Mar-26
 * @time: 06:12 PM
 * @package: LeetCode.TwoPointers
 */

package LeetCode.TwoPointers;

public class E121_BestTimetoBuyAndSell {
    /**
     * Brute Force
     * Time Complexity: O(n^2)
     * Space Complexity: O(1)
     */
    public int maxProfit(int[] prices) {
        int res = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            int buy = prices[i];
            for (int j = i + 1; j < prices.length; j++) {
                int sell = prices[j];
                Math.max(res, sell - buy);
            }
        }
        return res;
    }

    /**
     * Follow min price has arrived
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public int maxProfit2(int[] prices) {
        int maxPro = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxPro) maxPro = price - minPrice;
        }
        return maxPro;
    }

    /**
     * Two Pointers
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public int maxProfit3(int[] prices) {
        int l = 0;
        int r = 1;
        int res = 0;
        while (r < prices.length) {
            if (prices[r] < prices[l]) {
                l = r;
            } else {
                int profit = prices[r] - prices[l];
                res = Math.max(res, profit);
            }
            r++;
        }
        return res;
    }

    /**
     * Dynamic Programming
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public int maxProfit4(int[] prices) {
        int minBuy = prices[0];
        int maxPro = 0;
        for (int sell : prices) {
            maxPro = Math.max(maxPro, sell - minBuy);
            minBuy = Math.min(minBuy, sell);
        }
        return maxPro;
    }
}
