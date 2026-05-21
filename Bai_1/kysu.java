public class kysu extends quanly {
    private String nganh;

    public kysu(String hoten, int tuoi, String gioitinh, String diachi, String nganh) {
        super(hoten, tuoi, gioitinh, diachi);
        this.nganh = nganh;
    }

    public String getnganh() {
        return nganh;
    }

    public void setnganh(String nganh) {
        this.nganh = nganh;
    }

    @Override
    public void hienthithongtin() {
        super.hienthithongtin();
        System.out.println("nganh" + nganh);
    }
}