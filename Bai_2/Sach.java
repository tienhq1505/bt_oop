package Bai_2;

public class Sach extends Thuvien {
    private String tentacgia;
    private int sotrang;

    public Sach(int matailieu, String tennhaxuatban, int sobanphathanh, String tentacgia, int sotrang) {
        super(matailieu, tennhaxuatban, sobanphathanh);
        this.tentacgia = tentacgia;
        this.sotrang = sotrang;
    }

    public String getTentacgia() {
        return tentacgia;
    }

    public void setTentacgia(String tentacgia) {
        this.tentacgia = tentacgia;
    }

    public int getSotrang() {
        return sotrang;
    }

    public void setSotrang(int sotrang) {
        this.sotrang = sotrang;
    }

    @Override
    public void hienthi() {
        super.hienthi();
        System.out.println("tentacgia" + tentacgia);
        System.out.println("sotrang" + sotrang);
    }

}
