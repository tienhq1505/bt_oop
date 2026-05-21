package Bai_2;

public class bao extends Thuvien {
    private String ngayphathanh;

    public bao(int matailieu, String tennhaxuatban, int sobanphathanh, String ngayphathanh) {
        super(matailieu, tennhaxuatban, sobanphathanh);
        this.ngayphathanh = ngayphathanh;
    }

    public String getNgayphathanh() {
        return ngayphathanh;
    }

    public void setNgayphathanh(String ngayphathanh) {
        this.ngayphathanh = ngayphathanh;
    }

    @Override
    public void hienthi() {
        super.hienthi();
        System.out.println("ngayphathanh" + ngayphathanh);
    }
}
