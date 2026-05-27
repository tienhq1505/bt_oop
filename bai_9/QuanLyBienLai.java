package bai_9;

import java.util.ArrayList;

public class QuanLyBienLai {
    private ArrayList<BienLai> danhSach = new ArrayList<>();

    public void themBienLai(BienLai bienlai) {
        danhSach.add(bienlai);
    }

    public void hienThiDanhSach() {
        for (BienLai bl : danhSach) {
            bl.hienThi();
        }
    }

    public boolean xoaBienLai(String maCongTo) {
        BienLai Xoa = null;
        for (BienLai bl : danhSach) {
            if (bl.getKhachHang().getMaCongTo().equals(maCongTo)) {
                Xoa = bl;
                break;
            }
        }
        if (Xoa == null) {
            return false;
        }
        danhSach.remove(Xoa);
        return true;
    }

    public boolean suaThongTin(String maCongTo, String tenMoi, String soNhaMoi) {
        for (BienLai bl : danhSach) {
            if (bl.getKhachHang().getMaCongTo() == maCongTo) {
                bl.getKhachHang().setHoTen(tenMoi);
                bl.getKhachHang().setSoNha(soNhaMoi);
                return true;
            }
        }
        return false;
    }
}