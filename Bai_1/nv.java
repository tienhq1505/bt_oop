public class nv extends quanly {
    private String cv;

    public nv(String hoten, int tuoi, String gioitinh, String diachi, String cv) {
        super(hoten, tuoi, gioitinh, diachi);
        this.cv = cv;
    }

    public String getcv() {
        return cv;
    }

    public void setcv(String cv) {
        this.cv = cv;
    }

    @Override
    public void hienthithongtin() {
        super.hienthithongtin();
        System.out.println("cv" + cv);
    }
}