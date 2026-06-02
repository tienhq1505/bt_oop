package ttnguyen;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = sc.nextInt();
        long a = 1, b = 1;
        System.out.println("Dãy Fibonacci gồm " + n + " số đầu tiên:");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            long next = a + b;
            a = b;
            b = next;
        }
        sc.close();
    }
}
