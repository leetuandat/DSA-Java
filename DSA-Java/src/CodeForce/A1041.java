package CodeForce;

import java.util.Scanner;

/**
 * This class is used to solve A1041 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/contest/1041/problem/A"> here </a>.
 *
 * @author X.e.n.g
 * @version 1.O
 * @since 23:54:24 - 2/9/2023
 */
public class A1041 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x= scanner.nextInt();
        int[] array = new int[x];
        for (int i=0; i<x; i++) {
            array[i] = scanner.nextInt();
        }
        int min = array[0];
        int max = 0;
        for (int element:array) {
            max = Math.max(element, max);
            min = Math.min(element, min);
        }
        int numbers = (max-min+1)-x;
        System.out.println(numbers);
    }
}
