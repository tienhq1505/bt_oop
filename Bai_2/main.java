package Bai_2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Qlthuvien ql = new Qlthuvien();
        while (true) {
            System.out.println("1. Thêm mới tài liệu");
            System.out.println("2. Xóa tài liệu theo mã tài liệu");
            System.out.println("3. Hiển thị thông tin tài liệu");
            System.out.println("4. Tìm kiếm tài liệu theo loại");
            System.out.println("5. Thoát");

            System.out.print("Nhập lựa chọn: ");
            int luachon = Integer.parseInt(sc.nextLine());
            switch (luachon) {
                case 1:
                    System.out.println("Chọn loại tài liệu: 1. Sách | 2. Tạp chí | 3. Báo");
                    System.out.print("Nhập loại: ");
                    int loai = Integer.parseInt(sc.nextLine());
                    System.out.print("Nhập mã tài liệu: ");
                    int matailieu = Integer.parseInt(sc.nextLine());
                    System.out.print("Nhập tên nhà xuất bản: ");
                    String tennhaxuatban = sc.nextLine();
                    System.out.print("Nhập số bản phát hành: ");
                    int sobanphathanh = Integer.parseInt(sc.nextLine());
                    if (loai == 1) {
                        System.out.print("Nhập tên tác giả: ");
                        String tentacgia = sc.nextLine();
                        System.out.print("Nhập số trang: ");
                        int sotrang = Integer.parseInt(sc.nextLine());
                        ql.themthuvien(new Sach(matailieu, tennhaxuatban, sobanphathanh, tentacgia, sotrang));
                    } else if (loai == 2) {
                        System.out.print("Nhập số phát hành: ");
                        int sophathanh = Integer.parseInt(sc.nextLine());
                        System.out.print("Nhập tháng phát hành: ");
                        String thangphathanh = sc.nextLine();
                        ql.themthuvien(new Tap_chi(matailieu, tennhaxuatban, sobanphathanh, sophathanh, thangphathanh));
                    } else if (loai == 3) {
                        System.out.print("Nhập ngày phát hành: ");
                        String ngayphathanh = sc.nextLine();
                        ql.themthuvien(new bao(matailieu, tennhaxuatban, sobanphathanh, ngayphathanh));
                    } else {
                        System.out.println("Loại tài liệu không hợp lệ!");
                        break;
                    }
                    System.out.println("Thêm mới thành công");
                    break;
                case 2: {
                    System.out.print("Nhập mã tài liệu cần xóa: ");
                    int matailieuxoa = Integer.parseInt(sc.nextLine());
                    ql.deleteSach(matailieuxoa);
                    break;
                }
                case 3:
                    ql.hienthi();
                    break;
                case 4:
                    System.out.println("Chọn loại tài liệu cần tìm: 1. Sách | 2. Tạp chí | 3. Báo");
                    System.out.print("Nhập loại: ");
                    int loai2 = Integer.parseInt(sc.nextLine());
                    if (loai2 == 1) {
                        ql.timkiemsach();
                    } else if (loai2 == 2) {
                        ql.timkiemtapchi();
                    } else if (loai2 == 3) {
                        ql.timkiembao();
                    } else {
                        System.out.println("Loại tài liệu không hợp lệ!");
                        break;
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
                    break;
            }
        }

    }
}
