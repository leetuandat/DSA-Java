package CodeForce;

import java.util.Scanner;

/**
 * This class is used to solve A1030 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/1030/A"> here </a>.
 *
 * @author X.e.n.g
 * @version 1.O
 * @since 21:42:52 - 2/7/2023
 */
public class A1030 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String res = "EASY";
        for (int i=0; i<n; i++) {
            if (scanner.nextInt() == 1) res = "HARD";
        }
        scanner.close();
        System.out.println(res);
    }
}
