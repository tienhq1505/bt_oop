package bai_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        QLCBGV ql = new QLCBGV();

        System.out.print("Nhập số lượng giáo viên: ");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("\nNhập thông tin giáo viên thứ " + (i + 1));
            System.out.print("Họ tên: ");
            String hoTen = sc.nextLine();
            System.out.print("Tuổi: ");
            int tuoi = Integer.parseInt(sc.nextLine());
            System.out.print("Quê quán: ");
            String queQuan = sc.nextLine();
            System.out.print("Mã giáo viên: ");
            String maGV = sc.nextLine();
            System.out.print("Lương cứng: ");
            double luongCung = Double.parseDouble(sc.nextLine());
            System.out.print("Lương thưởng: ");
            double luongThuong = Double.parseDouble(sc.nextLine());
            System.out.print("Tiền phạt: ");
            double tienPhat = Double.parseDouble(sc.nextLine());

            CBGV cbgv = new CBGV(hoTen, tuoi, queQuan, maGV, luongCung, luongThuong, tienPhat);
            ql.themGV(cbgv);
        }
        ql.hienThiDanhSach();

        System.out.print("\nNhập mã giáo viên cần xóa: ");
        String maXoa = sc.nextLine();
        ql.xoaGV(maXoa);

        ql.hienThiDanhSach();
        sc.close();
    }
}
