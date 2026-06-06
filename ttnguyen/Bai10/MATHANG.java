package ttnguyen.Bai10;

import java.util.Scanner;

public class MATHANG {
    String tenHang;
    int maHang;
    String nuocSx;

    public MATHANG(String tenHang, int maHang, String nuocSx) {
        this.tenHang = tenHang;
        this.maHang = maHang;
        this.nuocSx = nuocSx;
    }

    public MATHANG() {

    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public int getMaHang() {
        return maHang;
    }

    public void setMaHang(int maHang) {
        this.maHang = maHang;
    }

    public String getNuocSx() {
        return nuocSx;
    }

    public void setNuocSx(String nuocSx) {
        this.nuocSx = nuocSx;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Tên Hàng: ");
        tenHang = sc.nextLine();
        System.out.println("Nhập Mã Hàng: ");
        maHang = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập Nước Sản Xuất: ");
        nuocSx = sc.nextLine();
    }

    public void xuat() {
        System.out.println("\\n%-10s %-10d %-10s\",tenHang,maHang,nuocSX");
    }
}
