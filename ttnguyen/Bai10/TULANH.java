package ttnguyen.Bai10;

import java.util.Scanner;

public class TULANH extends MATHANG {
    int dungTich;
    String mauSac;
    String hangSX;
    int soLuong;
    float donGia;

    public TULANH(String tenHang, int maHang, String nuocSx, int dungTich, String mauSac, String hangSX, int soLuong,
            float donGia) {
        super(tenHang, maHang, nuocSx);
        this.dungTich = dungTich;
        this.mauSac = mauSac;
        this.hangSX = hangSX;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public TULANH(int dungTich, String mauSac, String hangSX, int soLuong, float donGia) {
        this.dungTich = dungTich;
        this.mauSac = mauSac;
        this.hangSX = hangSX;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public void nhapTL() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập dung tích: ");
        dungTich = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập màu sắc: ");
        mauSac = sc.nextLine();
        System.out.println("Nhập hãng sản xuất: ");
        hangSX = sc.nextLine();
        System.out.println("Nhập số lượng: ");
        soLuong = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập đơn giá: ");
        donGia = Float.parseFloat(sc.nextLine());
    }

    public void xuatTL() {
        super.xuat();
        System.out.printf("%-10d %-10s %-10s %-10d %-10f %-10f", dungTich, mauSac, hangSX, soLuong, donGia,
                thanhTien());
    }

    public float thanhTien() {
        return soLuong * donGia;
    }
}
