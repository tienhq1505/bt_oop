package Bai_3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        tuyensinh ts = new tuyensinh();

        while (true) {
            System.out.println("1. Thêm thí sinh");
            System.out.println("2. Hiển thị danh sách");
            System.out.println("3. Thêm thí sinh");
            System.out.println("4. Thoát");

            System.out.println("Chọn chức năng: ");
            int chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    System.out.println("1. khối A");
                    System.out.println("2. khối B");
                    System.out.println("3. khối C");

                    int khoi = Integer.parseInt(sc.nextLine());
                    System.out.print("Số báo danh: ");
                    String sbd = sc.nextLine();

                    System.out.print("Họ tên: ");
                    String ten = sc.nextLine();

                    System.out.print("Địa chỉ: ");
                    String diaChi = sc.nextLine();

                    System.out.print("Mức ưu tiên: ");
                    int uuTien = Integer.parseInt(sc.nextLine());

                    if (khoi == 1) {
                        ts.themthisinh(new khoi_a(khoi, ten, diaChi, uuTien));
                    } else if (khoi == 2) {
                        ts.themthisinh(new khoi_b(khoi, ten, diaChi, uuTien));
                    } else if (khoi == 3) {
                        ts.themthisinh(new khoi_c(khoi, ten, diaChi, uuTien));
                    }
                    break;

                case 2:
                    ts.hienthi();
                    break;

                case 3:
                    System.out.println("Nhập số báo danh");
                    int tim = sc.nextInt();
                    ts.timsbd(tim);
                default:
                    break;
            }
        }
    }
}
