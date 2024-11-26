package CodeForce;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * This class is used to solve A112 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/112/A"> here </a>.
 *
 * @author X.e.n.g
 * @version 1.O
 * @since 01:47:01 - 3/29/2023
 */
public class A112 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = new String[2];
        str[0] = scanner.next().toLowerCase();
        String a = str[0];
        str[1] = scanner.next().toLowerCase();
        scanner.close();
        int res=0;
        //res - the result
        Arrays.sort(str);
        Arrays.sort(str);
        if (str[0].equals(str[1])) {
            res=0;
        } else {
            if (a.equals(str[0])) {
                res = -1;
            } else res = 1;
        }
    }
}

