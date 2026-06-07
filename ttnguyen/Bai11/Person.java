package ttnguyen.Bai11;

import java.util.Scanner;

public class Person {
    String hoTen;
    String diaChi;
    String phuong;

    public Person() {
    }

    public Person(String hoTen, String diaChi, String phuong) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.phuong = phuong;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getPhuong() {
        return phuong;
    }

    public void setPhuong(String phuong) {
        this.phuong = phuong;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.println("Nhap dia chi: ");
        diaChi = sc.nextLine();
        System.out.println("Nhap phuong: ");
        phuong = sc.nextLine();
    }

    public void xuat() {
        System.out.println("Ho ten: " + getHoTen());
        System.out.println("Dia chi: " + getDiaChi());
    }
}
