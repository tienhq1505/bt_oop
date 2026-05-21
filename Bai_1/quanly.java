
public class quanly {
    protected String hoten;
    protected int tuoi;
    protected String gioitinh;
    protected String diachi;

    public quanly() {

    }

    public quanly(String hoten, int tuoi, String gioitinh, String diachi) {
        this.hoten = hoten;
        this.tuoi = tuoi;
        this.gioitinh = gioitinh;
        this.diachi = diachi;
    }

    public String gethoten() {
        return hoten;
    }

    public void sethoten(String hoten) {
        this.hoten = hoten;
    }

    public int gettuoi() {
        return tuoi;
    }

    public void settuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String gioitinh() {
        return gioitinh;
    }

    public void gioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String diachi() {
        return diachi;
    }

    public void diachi(String diachi) {
        this.diachi = diachi;
    }

    public void hienthithongtin() {
        System.out.println("hoten" + hoten);
        System.out.println("tuoi" + tuoi);
        System.out.println("gioitinh" + gioitinh);
        System.out.println("diachi" + diachi);
    }
}