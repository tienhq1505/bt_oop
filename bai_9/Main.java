package bai_9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        QuanLyBienLai ql = new QuanLyBienLai();

        while (true) {
            System.out.println("1. Thêm biên lai");
            System.out.println("2. Xóa biên lai");
            System.out.println("3. Sửa thông tin");
            System.out.println("4. Hiển thị danh sách");
            System.out.println("5. Thoát");
            System.out.println("Chọn chức năng: ");

            int chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1: {
                    System.out.println("Tên chủ hộ: ");
                    String ten = sc.nextLine();

                    System.out.println("Số nhà: ");
                    String soNha = sc.nextLine();

                    System.out.println("Mã công tơ: ");
                    String ma = sc.nextLine();

                    System.out.println("Chỉ số cũ: ");
                    int cu = Integer.parseInt(sc.nextLine());

                    System.out.println("Chỉ số mới: ");
                    int moi = Integer.parseInt(sc.nextLine());

                    KhachHang kh = new KhachHang(ten, soNha, ma);
                    BienLai bl = new BienLai(kh, cu, moi);
                    ql.themBienLai(bl);
                    System.out.println("Thêm thành công");
                    break;
                }
                case 2: {
                    System.out.println("Nhập mã công tơ cần xóa: ");
                    String maXoa = sc.nextLine();
                    if (ql.xoaBienLai(maXoa)) {
                        System.out.println("Xóa thành công");
                    } else {
                        System.out.println("Xóa không thành công");
                    }
                    break;
                }
                case 3: {
                    System.out.println("Nhập mã công tơ: ");
                    String maSua = sc.nextLine();
                    System.out.println("Tên mới: ");
                    String tenMoi = sc.nextLine();
                    System.out.println("Số nhà mới: ");
                    String soNhaMoi = sc.nextLine();
                    ql.suaThongTin(maSua, tenMoi, soNhaMoi);
                    System.out.println("Sửa thành công");
                    break;
                }
                case 4: {
                    ql.hienThiDanhSach();
                    break;
                }
                case 5: {
                    System.out.println("Thoát chương trình");
                    break;
                }
                default:
                    break;
            }
        }
    }
}
