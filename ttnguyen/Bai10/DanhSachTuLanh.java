package ttnguyen.Bai10;

import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachTuLanh {
    ArrayList<TULANH> dsTL = new ArrayList<>();
    int n;

    public void nhapDS() {
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin tủ lạnh thứ " + (i + 1) + ":");
            TULANH tl = new TULANH(0, "", "", 0, 0);
            tl.nhapTL();
            dsTL.add(tl);
        }
    }

    public void xuatDS() {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n",
                "Tên Hàng", "Mã Hàng", "Nước SX", "Dung Tích", "Màu Sắc", "Hãng SX", "Số Lượng", "Đơn Giá",
                "Thành Tiền");
        for (TULANH tl : dsTL) {
            tl.xuatTL();
            System.out.println();
        }
    }

    public void lietKeHSX() {
        String hangsx;
        int dem = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap hang san xuat: ");
        hangsx = sc.nextLine();
        for (TULANH tl : dsTL) {
            if (tl.getHangSX().equals(hangsx)) {
                tl.xuatTL();
                dem++;
            }
        }
        if (dem == 0) {
            System.out.println("Khong tim thay hang san xuat");
        } else {
            for (int i = 0; i < n; i++) {
                if (dsTL.get(i).hangSX.equals(hangsx)) {
                    dsTL.get(i).xuatTL();
                }
            }
        }
    }

    public void tongTien() {
        float sum = 0;
        for (int i = 0; i < n; i++) {
            sum += dsTL.get(i).thanhTien();
        }

        System.out.println("Tong tien cac tu lanh co trong danh sach la: " + sum);
    }

    public void lietkeTL200() {
        int dem = 0;
        for (int i = 0; i < n; i++) {
            if (dsTL.get(i).dungTich > 200) {
                dem++;
            }
        }
        if (dem == 0) {
            System.out.println("Khong co tu lanh nao co dung tich tren 200");
        } else {
            for (int i = 0; i < n; i++) {
                if (dsTL.get(i).dungTich > 200) {
                    dsTL.get(i).xuatTL();
                }
            }
        }
    }

    public void sapXep() {
        TULANH tg;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (dsTL.get(i).soLuong < dsTL.get(j).soLuong) {
                    tg = dsTL.get(i);
                    dsTL.set(i, dsTL.get(j));
                    dsTL.set(j, tg);
                }
            }
        }
    }
}
