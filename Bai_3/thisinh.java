package Bai_3;

public class thisinh {
    protected int sbd;
    protected String name;
    protected String diachi;
    protected int utien;

    public thisinh() {
    }

    public thisinh(int sbd, String name, String diachi, int utien) {
        this.sbd = sbd;
        this.name = name;
        this.diachi = diachi;
        this.utien = utien;

    }

    public int getSbd() {
        return sbd;
    }

    public void setSbd(int sbd) {
        this.sbd = sbd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public int getUtien() {
        return utien;
    }

    public void setUtien(int utien) {
        this.utien = utien;
    }

    public void hienthi() {
        System.out.println("sbd" + sbd);
        System.out.println("name" + name);
        System.out.println("diachi" + diachi);
        System.out.println("utien" + utien);
    }
}
