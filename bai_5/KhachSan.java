package bai_5;

public class KhachSan {
    private Nguoi nguoi;

    private int soNgayThue;
    private String loaiPhong;
    private int giaPhong;

    public KhachSan(Nguoi nguoi, int soNgayThue, String loaiPhong, int giaPhong) {
        this.nguoi = nguoi;
        this.soNgayThue = soNgayThue;
        this.loaiPhong = loaiPhong;
        this.giaPhong = giaPhong;

        if (loaiPhong.equals("A")) {
            giaPhong = 500;
        }
        if (loaiPhong.equals("B")) {
            giaPhong = 300;
        }
        if (loaiPhong.equals("C")) {
            giaPhong = 100;
        }
    }

    public Nguoi getNguoi() {
        return nguoi;
    }

    public void setNguoi(Nguoi nguoi) {
        this.nguoi = nguoi;
    }

    public int getSoNgayThue() {
        return soNgayThue;
    }

    public void setSoNgayThue(int soNgayThue) {
        this.soNgayThue = soNgayThue;
    }

    public String getLoaiPhong() {
        return loaiPhong;
    }

    public void setLoaiPhong(String loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

    public int getGiaPhong() {
        return giaPhong;
    }

    public void setGiaPhong(int giaPhong) {
        this.giaPhong = giaPhong;
    }

    public int tinhTien() {
        return soNgayThue * giaPhong;
    }

    public void hienThi() {
        nguoi.hienThi();
        System.out.println("Loại phòng: " + loaiPhong);
        System.out.println("Số ngày thuê: " + soNgayThue);
        System.out.println("Giá phòng: " + giaPhong);
        System.out.println("Tổng tiền: " + tinhTien());
    }
}
