package Bai_4;

import java.util.ArrayList;

public class hogiadinh {
    private int sonha;
    private int sothanhvien;

    private ArrayList<nguoi> thanhvien;

    public hogiadinh(int sonha, int sothanhvien, ArrayList<nguoi> thanhvien) {
        this.sonha = sonha;
        this.sothanhvien = sothanhvien;
        this.thanhvien = thanhvien;
    }

    public int getSonha() {
        return sonha;
    }

    public void setSonha(int sonha) {
        this.sonha = sonha;
    }

    public int getSothanhvien() {
        return sothanhvien;
    }

    public void setSothanhvien(int sothanhvien) {
        this.sothanhvien = sothanhvien;
    }

    public ArrayList<nguoi> getThanhvien() {
        return thanhvien;
    }

    public void setThanhvien(ArrayList<nguoi> thanhvien) {
        this.thanhvien = thanhvien;
    }

    public void hienthi() {
        System.out.println("Số nhà: " + sonha);
        System.out.println("Số thành viên: " + sothanhvien);

        for (nguoi nguoi : thanhvien) {
            nguoi.hienthi();
        }
    }
}
