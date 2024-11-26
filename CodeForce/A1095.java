package CodeForce;

import java.util.Scanner;

/**
 * This class is used to solve A1095 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/1095/A"> here </a>.
 *
 * @author X.e.n.g
 * @version 1.O
 * @since 18:27:51 - 2/18/2023
 */
public class A1095 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String encrytedString = scanner.next();
        scanner.close();

        int temp = 0;
        String ans = "";
        for (int i = 0; i < n; i++) {
            ans += encrytedString.charAt(i);
            i += temp;
            temp++;
        }
        System.out.println(ans);
    }
}