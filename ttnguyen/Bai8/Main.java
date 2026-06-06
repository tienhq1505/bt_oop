package ttnguyen.Bai8;

import java.util.Scanner;

public class Main {
    static void main() {

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaiKhoan tk = new TaiKhoan();

        while (true) {
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");

            System.out.println("Nhập Lựa Chọn:");
            int luachon = Integer.parseInt(sc.nextLine());
            switch (luachon) {
                case 1:
                    tk.nhapTK();
                    break;
                case 2:
                    tk.xuatTk();
                    break;
                case 3:
                    tk.guiTien();
                    break;
                case 4:
                    tk.rutTien();
                    break;
                case 5:
                    tk.daoHan();
                    tk.xuatTk();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }
}