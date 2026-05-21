package Bai_2;

public class Thuvien {
    protected int matailieu;
    protected String tennhaxuatban;
    protected int sobanphathanh;

    public Thuvien() {
    }

    public Thuvien(int matailieu, String tennhaxuatban, int sobanphathanh) {
        this.matailieu = matailieu;
        this.sobanphathanh = sobanphathanh;
        this.tennhaxuatban = tennhaxuatban;
    }

    public int getMatailieu() {
        return matailieu;
    }

    public void setMatailieu(int matailieu) {
        this.matailieu = matailieu;
    }

    public String getTennhaxuatban() {
        return tennhaxuatban;
    }

    public void setTennhaxuatban(String tennhaxuatban) {
        this.tennhaxuatban = tennhaxuatban;
    }

    public int getSobanphathanh() {
        return sobanphathanh;
    }

    public void setSobanphathanh(int sobanphathanh) {
        this.sobanphathanh = sobanphathanh;
    }

    public void hienthi() {
        System.out.println("matailieu" + matailieu);
        System.out.println("tennhaxuatban" + tennhaxuatban);
        System.out.println("sobanphathanh" + sobanphathanh);
    }
}
