package ttnguyen.Bai8;

import java.util.Scanner;

public class TaiKhoan {
    String soTK;
    String tenTK;
    float soTien;
    float laiSuat = (float) 0.05;

    public TaiKhoan() {
        soTK = "";
        tenTK = "";
        soTien = 100;
    }

    public TaiKhoan(String soTK, String tenTK, float soTien, float laiSuat) {
        this.soTK = soTK;
        this.tenTK = tenTK;
        this.soTien = soTien;
        this.laiSuat = laiSuat;
    }

    public String getSoTK() {
        return soTK;
    }

    public void setSoTK(String soTK) {
        this.soTK = soTK;
    }

    public String getTenTK() {
        return tenTK;
    }

    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
    }

    public float getSoTien() {
        return soTien;
    }

    public void setSoTien(float soTien) {
        this.soTien = soTien;
    }

    public float getLaiSuat() {
        return laiSuat;
    }

    public void setLaiSuat(float laiSuat) {
        this.laiSuat = laiSuat;
    }

    public void nhapTK() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(" Nhập Số TK: ");
            soTK = sc.nextLine();
            if (soTK.trim().length() == 0) {
                System.out.println("Số Tài Khoản Không Hợp Lệ.");
            }
        } while (soTK.trim().length() == 0);
        System.out.println("Nhập Tên Tài Khoản");
        tenTK = sc.nextLine();
    }

    public void xuatTk() {
        System.out.println("Số Tài Khoản : " + getSoTK());
        System.out.println("Tên Tài khoản : " + getTenTK());
        System.out.println("Số Tiền : " + getSoTien());
        System.out.println("Lãi Xuất: " + getLaiSuat());
        System.out.println("------------------");
    }

    public void guiTien() {
        float soTienGui;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập Số Tiền: ");
            soTienGui = sc.nextFloat();
            if (soTienGui <= 0) {
                System.out.println("Số Tiền Không Hợp Lệ");
            }
        } while (soTienGui <= 0);
        soTien += soTienGui;
        System.out.println("Số tiền mới là : " + getSoTien());
    }

    public void rutTien() {
        float rutTien;
        float phiRutTien = 50000;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập Số Tiền: ");
            rutTien = sc.nextFloat();
            if (rutTien <= 0) {
                System.out.println("Số Tiền Không Hợp Lệ");
            }
        } while (rutTien <= 0);
        if (rutTien < soTien) {
            soTien = soTien - (rutTien + phiRutTien);
            System.out.println("Số Tiền Sau Khi Rút Là : " + getSoTien());
        } else {
            System.out.println("Số Tiền Không Đủ Để Rút");
        }
    }

    public void daoHan() {
        soTien = soTien + (soTien * laiSuat);
        System.out.println("Số Tiền Sau Khi Đào Hạn Là : " + getSoTien());
    }

    @Override
    public String toString() {
        return "TaiKhoan {" + "soTK = " + soTK + ", tenTK = " + tenTK + ", soTien = " + soTien + ", laiSuat = "
                + laiSuat + "}";
    }
}
