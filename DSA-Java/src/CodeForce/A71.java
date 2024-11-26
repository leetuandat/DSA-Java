package CodeForce;

import java.util.Scanner;

/**
 * This class is used to solve A71 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/71/A"> here </a>.
 *
 * @author X.e.n.g
 * @version 1.O
 * @since 21:37:18 - 2/3/2023
 */
public class A71 {
    public static String getCharge(String s) {
        String res = s;
        int n = s.length();
        if (n > 10) {
            res = "";
            res = s.substring(0, 1) + (n - 2) + s.substring(n - 1, n);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] str = new String[n];
        for (int i=0; i<n; i++) {
            str[i] = scanner.next();
            str[i] = getCharge(str[i]);
        }
        scanner.close();
        for (String i : str) {
            System.out.println(i);
        }
    }
}

