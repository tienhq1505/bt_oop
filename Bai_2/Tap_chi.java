package Bai_2;

public class Tap_chi extends Thuvien {
    private int sophathanh;
    private String thangphathanh;

    public Tap_chi(int matailieu, String tennhaxuatban, int sobanphathanh, int sophathanh, String thangphathanh) {
        super(matailieu, tennhaxuatban, sobanphathanh);
        this.sophathanh = sophathanh;
        this.thangphathanh = thangphathanh;
    }

    public int getSophathanh() {
        return sophathanh;
    }

    public void setSophathanh(int sophathanh) {
        this.sophathanh = sophathanh;
    }

    public String getThangphathanh() {
        return thangphathanh;
    }

    public void setThangphathanh(String thangphathanh) {
        this.thangphathanh = thangphathanh;
    }

    @Override
    public void hienthi() {
        super.hienthi();
        System.out.println("sophathanh" + sophathanh);
        System.out.println("thangphathanh" + thangphathanh);
    }
}
