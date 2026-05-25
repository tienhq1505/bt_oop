package Bai_4;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        khupho khupho = new khupho();

        System.out.print("Nhập số hộ dân: ");

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {

            System.out.println("Nhập hộ dân thứ " + (i + 1));

            System.out.print("Nhập số nhà: ");
            int sonha = Integer.parseInt(sc.nextLine());

            System.out.print("Nhập số thành viên: ");
            int sothanhvien = Integer.parseInt(sc.nextLine());

            ArrayList<nguoi> danhsachthanhvien = new ArrayList<>();

            for (int j = 0; j < sothanhvien; j++) {

                System.out.println("Nhập thành viên thứ " + (j + 1));

                System.out.print("Họ tên: ");
                String ten = sc.nextLine();

                System.out.print("Tuổi: ");
                int tuoi = Integer.parseInt(sc.nextLine());

                System.out.print("Nghề nghiệp: ");
                String nghe = sc.nextLine();

                System.out.print("CMND: ");
                int cmnd = Integer.parseInt(sc.nextLine());

                nguoi nguoi = new nguoi(ten, tuoi, nghe, cmnd);

                danhsachthanhvien.add(nguoi);
            }

            hogiadinh hogiadinh = new hogiadinh(sonha, sothanhvien, danhsachthanhvien);

            khupho.themHoGiaDinh(hogiadinh);
        }

        System.out.println("DANH SÁCH HỘ DÂN");

        khupho.hienthithongtin();
    }
}