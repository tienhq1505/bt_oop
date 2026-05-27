package bai_5;

import java.util.ArrayList;

public class QuanLyKhachSan {

    private ArrayList<KhachSan> danhSach = new ArrayList<>();

    public void themKhach(KhachSan ks) {
        danhSach.add(ks);
    }

    public void hienThiDanhSach() {
        for (KhachSan ks : danhSach) {
            ks.hienThi();
            System.out.println("----------------");
        }
    }

    public boolean xoaKhach(String cmnd) {
        KhachSan canXoa = null;
        for (KhachSan ks : danhSach) {
            if (ks.getNguoi().getCmnd().equals(cmnd)) {
                canXoa = ks;
                break;
            }
        }
        if (canXoa == null) {
            return false;
        }
        danhSach.remove(canXoa);
        return true;
    }

    public void tinhTien(String cmnd) {
        boolean timThay = false;
        for (KhachSan ks : danhSach) {
            if (ks.getNguoi().getCmnd().equals(cmnd)) {
                System.out.println("Tiền phòng: " + ks.tinhTien());
                timThay = true;
            }
        }
        if (!timThay) {
            System.out.println("Không tìm thấy khách!");
        }
    }
}
