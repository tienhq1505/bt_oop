package bai_8;

import java.util.ArrayList;

public class QuanLyTheMuon {
    private ArrayList<TheMuon> danhSach;

    public QuanLyTheMuon() {
        danhSach = new ArrayList<>();
    }

    public void themTheMuon(TheMuon tm) {
        danhSach.add(tm);
    }

    public void xoaTheoMaPhieu(String maPhieu) {
        boolean found = false;

        for (int i = 0; i < danhSach.size(); i++) {
            if (danhSach.get(i).getMaPhieuMuon()
                    .equals(maPhieu)) {
                danhSach.remove(i);
                found = true;
                System.out.println("Đã xóa phiếu mượn: " + maPhieu);
                break;
            }
        }
        if (found = false) {
            System.out.println("Không tìm thấy phiếu mượn: " + maPhieu);
        }
    }

    public void hienThiDanhSach() {
        System.out.println("\nDANH SÁCH THẺ MƯỢN");

        for (TheMuon tm : danhSach) {
            tm.hienThi();
        }
    }
}
