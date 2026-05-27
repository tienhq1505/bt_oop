package bai_9;

public class KhachHang {
    private String hoTen;
    private String soNha;
    private String maCongTo;

    public KhachHang(String hoTen, String soNha, String maCongTo) {
        this.hoTen = hoTen;
        this.soNha = soNha;
        this.maCongTo = maCongTo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSoNha() {
        return soNha;
    }

    public void setSoNha(String soNha) {
        this.soNha = soNha;
    }

    public String getMaCongTo() {
        return maCongTo;
    }

    public void setMaCongTo(String maCongTo) {
        this.maCongTo = maCongTo;
    }

    public void hienThi() {

        System.out.println("Họ tên chủ hộ: " + hoTen);
        System.out.println("Số nhà: " + soNha);
        System.out.println("Mã công tơ: " + maCongTo);
    }
}
