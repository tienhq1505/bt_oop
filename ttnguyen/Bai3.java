package ttnguyen;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập cạnh a: ");
        double a = sc.nextDouble();
        System.out.print("Nhập cạnh b: ");
        double b = sc.nextDouble();
        System.out.print("Nhập cạnh c: ");
        double c = sc.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            double p = (a + b + c) / 2;
            double S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.println("Diện tích tam giác = " + S);

        } else {
            System.out.println("Ba cạnh không tạo thành tam giác!");
        }
        sc.close();
    }
}
