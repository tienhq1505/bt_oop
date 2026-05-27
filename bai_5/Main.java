package bai_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLyKhachSan ql = new QuanLyKhachSan();
        while (true) {
            System.out.println("1. Thêm khách");
            System.out.println("2. Xóa khách");
            System.out.println("3. Hiển thị danh sách");
            System.out.println("4. Tính tiền");
            System.out.println("5. Thoát");

            System.out.print("Chọn: ");
            int chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1: {
                    System.out.print("Họ tên: ");
                    String ten = sc.nextLine();

                    System.out.print("Tuổi: ");
                    int tuoi = Integer.parseInt(sc.nextLine());

                    System.out.print("CMND: ");
                    String cmnd = sc.nextLine();

                    System.out.print("Loại phòng (A/B/C): ");
                    String loaiPhong = sc.nextLine();

                    System.out.print("Số ngày thuê: ");
                    int ngayThue = Integer.parseInt(sc.nextLine());

                    Nguoi nguoi = new Nguoi(ten, tuoi, cmnd);
                    KhachSan ks = new KhachSan(nguoi, ngayThue, loaiPhong, 0);
                    ql.themKhach(ks);
                    System.out.println("Thêm thành công");
                    break;
                }
                case 2: {
                    System.out.print("Nhập CMND cần xóa: ");
                    String cmndXoa = sc.nextLine();
                    if (ql.xoaKhach(cmndXoa)) {
                        System.out.println("Xóa thành công!");
                    } else {
                        System.out.println("Không tìm thấy!");
                    }
                    break;
                }
                case 3: {
                    ql.hienThiDanhSach();
                    break;
                }
                case 4: {
                    System.out.print("Nhập CMND ");
                    String cmndTT = sc.nextLine();
                    ql.tinhTien(cmndTT);
                    break;
                }
                case 5: {
                    System.out.println("Thoát chương trình!");
                    break;
                }
                default: {
                    System.out.println("Không tìm thấy!");
                }
            }
        }
    }
}
