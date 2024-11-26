package CodeForce;

import java.util.Scanner;

/**
 * This class is used to solve A110 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/110/A"> here </a>.
 *
 * @author X.e.n.g
 * @version 1.O
 * @since 23:16:18 - 3/22/2023
 */
public class A110 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        String res = "YES";
        int count = 0;
        while (n>0) {
            if (n%10 == 4 || n%10 == 7) {
                count ++;
            }
            n/=10;
        }
        if (count!=4 && count!=7) {
            res = "NO";
        }
        System.out.println(res);
    }
}
