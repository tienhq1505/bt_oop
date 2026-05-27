package bai_9;

public class BienLai {

    private KhachHang khachHang;

    private int chiSoCu;
    private int chiSoMoi;

    public BienLai(KhachHang khachHang, int chiSoCu, int chiSoMoi) {
        this.khachHang = khachHang;
        this.chiSoCu = chiSoCu;
        this.chiSoMoi = chiSoMoi;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public int getChiSoCu() {
        return chiSoCu;
    }

    public void setChiSoCu(int chiSoCu) {
        this.chiSoCu = chiSoCu;
    }

    public int getChiSoMoi() {
        return chiSoMoi;
    }

    public void setChiSoMoi(int chiSoMoi) {
        this.chiSoMoi = chiSoMoi;
    }

    public int tinhTienDien() {
        return (chiSoMoi - chiSoCu) * 5;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void hienThi() {
        khachHang.hienThi();
        System.out.println("Chỉ số cũ: " + chiSoCu);
        System.out.println("Chỉ số mới: " + chiSoMoi);
        System.out.println("Tiền điện: " + tinhTienDien());
    }
}