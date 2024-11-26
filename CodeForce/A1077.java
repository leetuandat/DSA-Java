package CodeForce;

import java.util.Scanner;

/**
 * This class is used to solve A1077 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/contest/1077/problem/A"> here </a>.
 *
 * @author X.e.n.g
 * @version 1.O
 * @since 22:56:07 - 2/15/2023
 */
public class A1077 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        long[] ans = new long[t];
        for (int i=0; i<t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int k = scanner.nextInt();
            ans[i] = (a-b)*(k/2);
            if (k%2 == 1) ans[i] += a;
        }
        scanner.close();
        for (long element:ans) System.out.println(element);
    }
}
