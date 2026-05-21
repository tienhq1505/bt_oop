public class congnhan extends quanly {
    private int bac;

    public congnhan(String hoten, int tuoi, String gioitinh, String diachi, int bac) {
        super(hoten, tuoi, gioitinh, diachi);
        this.bac = bac;
    }

    public int getbac() {
        return bac;
    }

    public void setbac(int bac) {
        this.bac = bac;
    }

    @Override
    public void hienthithongtin() {
        super.hienthithongtin();
        System.out.println("bac" + bac);
    }
}