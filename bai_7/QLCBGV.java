package bai_7;

import java.util.ArrayList;

public class QLCBGV {
    private ArrayList<CBGV> danhSachGV;

    public QLCBGV() {
        danhSachGV = new ArrayList<>();
    }

    public void themGV(CBGV gv) {
        danhSachGV.add(gv);
    }

    public void xoaGV(String maGV) {
        boolean found = false;

        for (int i = 0; i < danhSachGV.size(); i++) {
            if (danhSachGV.get(i).getMaGV().equals(maGV)) {
                danhSachGV.remove(i);
                found = true;
                System.out.println("Đã xóa giáo viên có mã: " + maGV);
                break;
            }
        }
        if (found = false) {
            System.out.println("Không tìm thấy giáo viên có mã: " + maGV);
        }
    }

    public void hienThiDanhSach() {
        System.out.println("DANH SÁCH GIÁO VIÊN");
        for (CBGV gv : danhSachGV) {
            gv.hienThi();
        }
    }
}
