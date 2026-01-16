/**
 * @author X.e.n.g
 * @version 1.O
 * @project name: DSA-Java
 * @date: 2/7/2025
 * @time: 04:55 PM
 * @package: Lab.Lab02
 */

package Lab.Lab02;

import java.util.Scanner;

public class bth2 {
    public class SimpleCaculator {
        int soA, soB;
        Scanner sc = new Scanner(System.in);
        public void phepCong() {
            soA = sc.nextInt();
            soB = sc.nextInt();
            System.out.printf("%d + %d = %d\n", soA, soB, soA+soB);
        }
        public void phepTru() {
            soA = sc.nextInt();
            soB = sc.nextInt();
            System.out.printf("%d - %d = %d\n", soA, soB, soA-soB);
        }
        public void phepNhan() {
            soA = sc.nextInt();
            soB = sc.nextInt();
            System.out.printf("%d * %d = %d\n", soA, soB, soA*soB);
        }
        public void phepChia() {
            soA = sc.nextInt();
            soB = sc.nextInt();
            System.out.printf("%d / %d = %.2f\n", soA, soB, (float)soA/(float)soB);
        }
    }

    public static void main(String[] args) {
        bth2 maytinh = new bth2();
        SimpleCaculator pheptinh = maytinh.new SimpleCaculator();
        pheptinh.phepCong();
        pheptinh.phepChia();
    }
}
