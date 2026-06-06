package ttnguyen.Bai10;

import java.util.ArrayList;

public class DanhSachTuLanh {
    ArrayList<TULANH> dsTL = new ArrayList<>();

    public void nhapDS(int n) {
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
}
