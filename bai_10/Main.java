package bai_10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập văn bản: ");
        String text = sc.nextLine();
        VanBan vb = new VanBan(text);

        System.out.println("Số từ: " + vb.demSoTu());
        System.out.println("Số ký tự a/A: " + vb.demKyTuA());
        System.out.println("Chuẩn hóa: " + vb.chuanHoa());
    }
}
