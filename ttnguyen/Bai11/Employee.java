package ttnguyen.Bai11;

import java.util.Scanner;

public class Employee extends Person {
    float hsl, lcb = 1000;

    public Employee() {

    }

    public Employee(String hoTen, String diaChi, String phuong, float hsl, float lcb) {
        super(hoTen, diaChi, phuong);
        this.hsl = hsl;
        this.lcb = lcb;
    }

    public float getHsl() {
        return hsl;
    }

    public void setHsl(float hsl) {
        this.hsl = hsl;
    }

    public float getLcb() {
        return lcb;
    }

    public void setLcb(float lcb) {
        this.lcb = lcb;
    }

    public void nhapEmp() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhap he so luong: ");
        hsl = sc.nextFloat();
    }

    float tinhLuong() {
        return hsl * lcb;
    }

    String danhGiaEmp() {
        if (getHsl() == 2) {
            return "Trung Binh";
        } else if (getHsl() < 2) {
            return "Thap";
        } else
            return "Cao";
    }

    public void xuat() {
        System.out.println("===Employee===");
        super.xuat();
        System.out.println("He so luong: " + getHsl());
        System.out.println("Luong: " + tinhLuong());
        System.out.println("Danh Gia: " + danhGiaEmp());
        System.out.println("======");
    }
}
