package CodeForce;

import java.util.Scanner;

/**
 * This class is used to solve A1003 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/1003/A"> here </a>.
 *
 * @author X.e.n.g
 * @version 1.O
 * @since 15:38:40 - 2/2/2023
 */
public class A1003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] frequently = new int[101];
        for (int i=0; i<n; i++) {
            int x = scanner.nextInt();
            frequently[x]++;
        }
        int max = 0;
        for (int element : frequently){
            max = Math.max(element, max);
        }
        System.out.println(max);
    }
}
