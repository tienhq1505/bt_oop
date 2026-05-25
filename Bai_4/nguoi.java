package Bai_4;

public class nguoi {
    private String hoten;
    private int tuoi;
    private String nghenghiep;
    private int cmnd;

    public nguoi(String hoten, int tuoi, String nghenghiep, int cmnd) {
        this.hoten = hoten;
        this.tuoi = tuoi;
        this.nghenghiep = nghenghiep;
        this.cmnd = cmnd;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getNghenghiep() {
        return nghenghiep;
    }

    public void setNghenghiep(String nghenghiep) {
        this.nghenghiep = nghenghiep;
    }

    public int getCmnd() {
        return cmnd;
    }

    public void setCmnd(int cmnd) {
        this.cmnd = cmnd;
    }

    public void hienthi() {

        System.out.println("Họ tên: " + hoten);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Nghề nghiệp: " + nghenghiep);
        System.out.println("CMND: " + cmnd);
    }
}