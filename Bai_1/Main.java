import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ds = new Scanner(System.in);
        QLCB qlcb = new QLCB();

        while (true) {
            System.out.println("1. Thêm mới cán bộ");
            System.out.println("2. Tìm kiếm theo họ tên");
            System.out.println("3. Hiển thị thông tin danh sách");
            System.out.println("4. Thoát");

            System.out.print("Nhập lựa chọn: ");
            int luachon = Integer.parseInt(ds.nextLine());
            switch (luachon) {
                case 1:
                    System.out.println("Chọn loại cán bộ: 1. Nhân viên | 2. Công nhân | 3. Kỹ sư");
                    System.out.print("Nhập loại: ");
                    int loai = Integer.parseInt(ds.nextLine());

                    System.out.print("Nhập họ tên: ");
                    String hoten = ds.nextLine();
                    System.out.print("Nhập tuổi: ");
                    int tuoi = Integer.parseInt(ds.nextLine());
                    System.out.print("Nhập giới tính (Nam/Nu/Khac): ");
                    String gioitinh = ds.nextLine();
                    System.out.print("Địa chỉ: ");
                    String diachi = ds.nextLine();

                    if (loai == 1) {
                        System.out.print("Nhập công việc: ");
                        String cv = ds.nextLine();
                        qlcb.themcanbo(new nv(hoten, tuoi, gioitinh, diachi, cv));
                    } else if (loai == 2) {
                        System.out.print("Nhập bậc (1-10): ");
                        int bac = Integer.parseInt(ds.nextLine());
                        qlcb.themcanbo(new congnhan(hoten, tuoi, gioitinh, diachi, bac));
                    } else if (loai == 3) {
                        System.out.print("Nhập ngành đào tạo: ");
                        String nganh = ds.nextLine();
                        qlcb.themcanbo(new kysu(hoten, tuoi, gioitinh, diachi, nganh));
                    } else {
                        System.out.println("Loại cán bộ không hợp lệ!");
                        break;
                    }
                    System.out.println("Thêm mới thành công");
                    break;
                case 2:
                    System.out.print("Nhập tên cần tìm: ");
                    String ten = ds.nextLine();
                    qlcb.timtheoten(ten);
                    break;
                case 3:
                    qlcb.hienthi();
                    break;
                case 4:
                    System.out.println("Thoát chương trình");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
                    break;
            }

        }
    }
}
