package bai_11;

public class Main {
    public static void main(String[] args) {
        SoPhuc sp1 = new SoPhuc();
        SoPhuc sp2 = new SoPhuc();

        System.out.println("Nhập số thứ nhất : ");
        sp1.nhap();
        System.out.println("Nhập số thứ hai :");
        sp2.nhap();
        SoPhuc tong = sp1.cong(sp2);
        System.out.println("Kết quả tổng: ");
        tong.hienthi();

        SoPhuc nhan = sp1.nhan(sp2);
        System.out.println("Kết quả nhan: ");
        nhan.hienthi();
    }
}
