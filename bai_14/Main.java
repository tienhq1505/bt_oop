package bai_14;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                StudentManagement sm = new StudentManagement();

                System.out.print(
                                "Nhập số lượng sinh viên: ");

                int n = Integer.parseInt(
                                sc.nextLine());

                for (int i = 0; i < n; i++) {

                        System.out.println(
                                        "1. Good Student");

                        System.out.println(
                                        "2. Normal Student");

                        int choice = Integer.parseInt(
                                        sc.nextLine());

                        if (choice == 1) {

                                GoodStudent gs = new GoodStudent(null, null, choice, null, null, null, choice, null);

                                gs.inputGoodStudent();

                                sm.addStudent(gs);

                        } else {

                                NormalStudent ns = new NormalStudent(null, null, choice, null, null, null, choice,
                                                choice);

                                ns.inputNormalStudent();

                                sm.addStudent(ns);
                        }
                }

                sm.sortAndDisplay();

                sm.recruit(n);
        }
}
