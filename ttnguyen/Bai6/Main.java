package ttnguyen.Bai6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhập số công nhân (0 < n < 20): ");
            n = sc.nextInt();
        } while (n <= 0 || n >= 20);
        CongNhan[] ds = new CongNhan[n];
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            ds[i] = new CongNhan();
            System.out.println("\nCông nhân thứ " + (i + 1));
            System.out.print("Họ tên: ");
            ds[i].setHoten(sc.nextLine());
            System.out.print("Hệ số lương: ");
            ds[i].setHsl(sc.nextFloat());

            sc.nextLine();
        }

        System.out.println("\nDANH SACH CONG NHAN:");
        for (CongNhan cn : ds) {
            System.out.println("Ho ten: " + cn.getHoten());
            System.out.println("He so luong: " + cn.getHsl());
            System.out.println("Luong: " + cn.tinhLuong());
        }

        System.out.print("\nNhập S: ");
        float S = sc.nextFloat();

        System.out.println("\nDanh sách công nhân có lương > " + S + ":");
        boolean found = false;
        for (CongNhan cn : ds) {
            if (cn.tinhLuong() > S) {
                System.out.println(cn.getHoten());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không có công nhân nào thỏa mãn");
        }
        sc.close();
    }
}
