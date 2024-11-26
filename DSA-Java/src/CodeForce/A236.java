package CodeForce;

import java.util.Scanner;

/**
 * This class is used to solve A236 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/236/A"> here </a>.
 *
 * @author X.e.n.g
 * @version 1.O
 * @since 21:07:58 - 10/31/2023
 */
public class A236 { //ppcpbnhwoizajrl
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int count=0;
        boolean[] marked = new boolean[26];
        for (int i=0; i<str.length(); i++) {
            if (!marked[str.charAt(i) - 97]) {
                marked[str.charAt(i) - 97] = true;
                count += 1; ;
            }
        }
        System.out.println(marked);
        System.out.println(count);
        System.out.println(count%2 == 0 ? "CHAT WITH HER!" : "IGNORE HIM!");
    }
}

//public class Codeforces {
//    public static void main(String[] args) {
//        _236A();
//    }
//    public static void _236A(){
//        Scanner scanner = new Scanner(System.in);
//        String name = scanner.nextLine();
//        String readthrough = "";
//        int distinct = 0;
//        for (int i = 0; i < name.length(); i++) {
//            if(!readthrough.contains(name.substring(i, i+1))) {
//                distinct++;
//                readthrough += name.substring(i, i+1);
//            }
//        }
//        System.out.println(distinct % 2 == 0 ? "CHAT WITH HER!" : "IGNORE HIM!");
//    }