package bai_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLyHocSinh ql = new QuanLyHocSinh();

        System.out.print("Nhập số lượng học sinh: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("\nNhập thông tin học sinh thứ " + (i + 1));

            System.out.print("Họ tên: ");
            String hoTen = sc.nextLine();

            System.out.print("Tuổi: ");
            int tuoi = Integer.parseInt(sc.nextLine());

            System.out.print("Quê quán: ");
            String queQuan = sc.nextLine();

            System.out.print("Lớp: ");
            String lop = sc.nextLine();

            HocSinh hs = new HocSinh(hoTen, tuoi, queQuan, lop);
            ql.themHocSinh(hs);
        }

        ql.hienThiHocSinh20Tuoi();

        ql.demHocSinh23TuoiQueDN();

        sc.close();
    }
}
