/**
 * @author X.e.n.g
 * @version 1.O
 * @project name: DSA-Java
 * @date: 2/7/2025
 * @time: 04:40 PM
 * @package: Lab.Lab02
 */

package Lab.Lab02;

import java.util.Scanner;

public class bth1 {
    public class SinhVien {
        String name;
        String address;
        int soLanThi = 0;
        float diemJava = 0.0f;
        double lePhiThi = 1.5;
        char gioiTinh = 'F';

        public void nhapThongTin() {
            System.out.println("______Nhap Thong Tin______");
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap ten sinh vien: ");
            name = sc.nextLine();
            System.out.println("Nhap so lan thi: ");
            soLanThi = sc.nextInt();
            System.out.println("Nhap diem Java: ");
            diemJava = sc.nextFloat();
            System.out.println("Nhap le phi thi: ");
            lePhiThi = sc.nextFloat();
            System.out.println("Nhap gioi tinh: ");
            gioiTinh = sc.next().charAt(0);
        }

        public void hienThiThongTin() {
            System.out.println("______Hien Thi Thong Tin______");
            System.out.println("Ten sinh vien: " + name);
            System.out.println("SoLan thi: " + soLanThi);
            System.out.println("Diem Java: " + diemJava);
            System.out.println("LePhi thi: " + lePhiThi);
            System.out.println("Gioi tinh: " + gioiTinh);
        }
    }

    public static void main(String[] args) {
        bth1 outer = new bth1();
        SinhVien sv = outer.new SinhVien();
        sv.nhapThongTin();
        sv.hienThiThongTin();
    }

}

