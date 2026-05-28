package bai_6;

import java.util.ArrayList;

public class QuanLyHocSinh {
    private ArrayList<HocSinh> danhSachHocSinh;

    public QuanLyHocSinh() {
        danhSachHocSinh = new ArrayList<>();
    }

    public void themHocSinh(HocSinh hs) {
        danhSachHocSinh.add(hs);
    }

    public void hienThiHocSinh20Tuoi() {
        System.out.println("\nDanh sách học sinh 20 tuổi:");
        for (HocSinh hs : danhSachHocSinh) {
            if (hs.getTuoi() == 20) {
                hs.hienThi();
            }
        }
    }

    // Đếm học sinh 23 tuổi và quê DN
    public void demHocSinh23TuoiQueDN() {
        int count = 0;

        for (HocSinh hs : danhSachHocSinh) {
            if (hs.getTuoi() == 23 && hs.getQueQuan().equals("DN")) {
                count++;
            }
        }
        System.out.println("\nSố học sinh 23 tuổi quê DN là: " + count);
    }
}
