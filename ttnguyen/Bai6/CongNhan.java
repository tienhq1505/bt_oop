package ttnguyen.Bai6;

public class CongNhan {
    float lcb = 1150;
    float hsl;
    String hoten;

    public float getLcb() {
        return lcb;
    }

    public void setLcb(float lcb) {
        this.lcb = lcb;
    }

    public float getHsl() {
        return hsl;
    }

    public void setHsl(float hsl) {
        this.hsl = hsl;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public float tinhLuong() {
        return lcb * hsl;
    }
}
