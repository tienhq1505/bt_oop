package ttnguyen;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Nhập các phần tử của mảng là : ");
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }

        System.out.println("\nCác phần tử đã nhập:");
        for (int x : arr) {
            System.out.print(x + " ");
        }

        int sum = 0;
        for (int x : arr) {
            sum += x;
        }

        int min = arr[0];
        int viTri = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
                viTri = i;
            }
        }
        System.out.println("\nTổng các phần tử = " + sum);
        System.out.print("Các phần tử lẻ trong mảng: ");
        boolean le = false;
        for (int x : arr) {
            if (x % 2 != 0) {
                System.out.print(x + " ");
                le = true;
            }
        }
        if (le = false) {
            System.out.print("Không có phần tử lẻ");
        }
        System.out.println("\nPhần tử nhỏ nhất: " + min);
        System.out.println("Vị trí của phần tử nhỏ nhất: " + viTri);

        sc.close();
    }
}
