/**
 * The link of this problem is <a href = "https://leetcode.com/problems/fibonacci-number"> here </a>.
 * @author X.e.n.g
 * @version 1.0
 * @project name: src
 * @date: 01-Apr-26
 * @time: 09:42 AM
 * @package: LeetCode.Math
 */
 
package LeetCode.Math;

public class E509_FibonacciNumber {
    /**
     * Recursion
     */
    public int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fib(n-1) + fib(n-2);
    }

    /**
     * Dynamic Programing Bottom-Up
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    public int fib2(int n) {
        if (n <= 1) return n;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

    /**
     * Dynamic Programing Space Optimized
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public int fib3(int n) {
        if (n <= 1) return n;
        int prev1 = 0;
        int prev2 = 1;
        for (int i = 2; i < n; i++) {
            int res = prev1 + prev2;
            prev1 = prev2;
            prev2 = res;
        }
        return prev2;
    }
}
