package CodeForce;

import java.util.Scanner;

/**
 * This class is used to solve A1097 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/1097/A"> here </a>.
 *
 * @author X.e.n.g
 * @version 1.O
 * @since 18:09:26 - 3/15/2023
 */
public class A1097 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        char s1 = s.charAt(0);
        char s2 = s.charAt(1);
        String res = "No";
        for (int i=0; i<5; i++) {
            String fiveCards = scanner.next();
            if (fiveCards.charAt(0) == s1 || fiveCards.charAt(1) == s2) res = "Yes";
        }
        scanner.close();
        System.out.println(res);
    }
}
