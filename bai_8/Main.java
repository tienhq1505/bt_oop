package bai_8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        QuanLyTheMuon ql = new QuanLyTheMuon();
        System.out.print("Nhập số lượng thẻ mượn: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("\nNhập thông tin thẻ mượn thứ " + (i + 1));
            System.out.print("Họ tên sinh viên: ");
            String hoTen = sc.nextLine();
            System.out.print("Tuổi: ");
            int tuoi = Integer.parseInt(sc.nextLine());
            System.out.print("Lớp: ");
            String lop = sc.nextLine();
            System.out.print("Mã phiếu mượn: ");
            String maPhieu = sc.nextLine();
            System.out.print("Ngày mượn: ");
            int ngayMuon = Integer.parseInt(sc.nextLine());
            System.out.print("Hạn trả: ");
            int hanTra = Integer.parseInt(sc.nextLine());
            System.out.print("Số hiệu sách: ");
            String soHieuSach = sc.nextLine();

            TheMuon tm = new TheMuon(hoTen, tuoi, lop, maPhieu, ngayMuon, hanTra, soHieuSach);
            ql.themTheMuon(tm);
        }
        ql.hienThiDanhSach();

        System.out.print("\nNhập mã phiếu cần xóa: ");
        String maXoa = sc.nextLine();
        ql.xoaTheoMaPhieu(maXoa);

        ql.hienThiDanhSach();

        sc.close();
    }
}