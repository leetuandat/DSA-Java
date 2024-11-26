package CodeForce;

import java.util.Scanner;

/**
 * This class is used to solve A4 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/4/A"> here </a>.
 *
 * @author X.e.n.g
 * @version 1.O
 * @since 14:14:27 - 2/1/2023
 */
public class A4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        while (n<1 || n>100){
            n = input.nextInt();
        }
        if (n>2 && (n%2 == 0)) {
            System.out.println("YES");
        } else System.out.println("NO");
    }
}
