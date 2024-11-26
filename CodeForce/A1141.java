package CodeForce;

import java.util.Scanner;
/**
 * This class is used to solve A1141 problem in codeforce.
 * The link of this problem is <a href = ""> here </a>.
 *
 * @author X.e.n.g
 * @version 1.O
 * @since 14:10:08 - 6/3/2023
 */
public class A1141 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.close();

        if (m%n != 0) {
            System.out.println("-1");
            return;
        }
        int count = 0;
        int k = m/n;

        while (k%3 == 0) {
            count++;
            k/=3;
        }

        while (k%2 == 0) {
            count++;
            k/=2;
        }
        System.out.println(count);
    }
}
