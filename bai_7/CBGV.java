package bai_7;

public class CBGV extends Nguoi {
    private double luongCung;
    private double luongThuong;
    private double tienPhat;
    private double luongThucLinh;

    public CBGV(String hoTen, int tuoi, String queQuan, String maGV,
            double luongCung, double luongThuong, double tienPhat) {

        super(hoTen, tuoi, queQuan, maGV);

        this.luongCung = luongCung;
        this.luongThuong = luongThuong;
        this.tienPhat = tienPhat;
        this.luongThucLinh = luongCung + luongThuong - tienPhat;
    }

    public double getLuongCung() {
        return luongCung;
    }

    public void setLuongCung(double luongCung) {
        this.luongCung = luongCung;
    }

    public double getLuongThuong() {
        return luongThuong;
    }

    public void setLuongThuong(double luongThuong) {
        this.luongThuong = luongThuong;
    }

    public double getTienPhat() {
        return tienPhat;
    }

    public void setTienPhat(double tienPhat) {
        this.tienPhat = tienPhat;
    }

    public double getLuongThucLinh() {
        return luongThucLinh;
    }

    public void setLuongThucLinh(double luongThucLinh) {
        this.luongThucLinh = luongThucLinh;
    }

    @Override
    public void hienThi() {
        System.out.println("Lương cứng: " + luongCung);
        System.out.println("Lương thưởng: " + luongThuong);
        System.out.println("Tiền phạt: " + tienPhat);
        System.out.println("Lương thực lĩnh: " + luongThucLinh);
    }

}
