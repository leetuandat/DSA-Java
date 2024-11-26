package CodeForce;

import java.util.Scanner;

/**
 * This class is used to solve A1 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/1/A"> here </a>.
 *
 * @author X.e.n.g
 * @version 1.O
 * @since 16:09:36 - 2/1/2023
 */
public class A1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int a = input.nextInt();
        int count = 0;
        if (m%a != 0) {
            m = m/a + 1;
        } else {
            m/=a;
        }
        if (n%a != 0) {
            n = n/a + 1;
        } else {
            n/=a;
        }
        count = m*n;
        System.out.println(count);
    }
}
