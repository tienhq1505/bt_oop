package bai_11;

import java.util.Scanner;

public class SoPhuc {
    private double phanThuc, phanAo;

    public SoPhuc() {
        phanThuc = 0;
        phanAo = 0;
    }

    public SoPhuc(double phanThuc, double phanAo) {
        this.phanThuc = phanThuc;
        this.phanAo = phanAo;
    }

    public double getPhanThuc() {
        return phanThuc;
    }

    public void setPhanThuc(double phanThuc) {
        this.phanThuc = phanThuc;
    }

    public double getPhanAo() {
        return phanAo;
    }

    public void setPhanAo(double phanAo) {
        this.phanAo = phanAo;
    }

    public void nhap() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập phần thực: ");
        phanThuc = sc.nextDouble();
        System.out.print("Nhập phần ảo: ");
        phanAo = sc.nextDouble();
    }

    public void hienthi() {
        System.out.println(phanThuc + " + " + phanAo + "i");
    }

    public SoPhuc cong(SoPhuc sp) {
        SoPhuc cong = new SoPhuc(phanThuc + sp.phanThuc, phanAo + sp.phanAo);
        return cong;
    }

    public SoPhuc nhan(SoPhuc sp) {
        SoPhuc nhan = new SoPhuc(phanThuc * sp.phanThuc - phanAo * sp.phanAo,
                phanThuc * sp.phanAo + phanAo * sp.phanThuc);
        return nhan;
    }

}
