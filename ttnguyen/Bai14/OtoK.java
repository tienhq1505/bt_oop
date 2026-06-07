package ttnguyen.Bai14;

public class OtoK extends Xe implements Thue {
    int sochongoi;

    public int getSochongoi() {
        return sochongoi;
    }

    public void setSochongoi(int sochongoi) {
        this.sochongoi = sochongoi;
    }

    @Override
    public float thue() {
        if (sochongoi >= 5) {
            return (float) (giaXe * 0.3 * 0.1 * 0.2);
        } else if (sochongoi < 5) {
            return (float) (giaXe * 0.5 * 0.1 * 0.2);
        } else
            return 0;
    }

    public void nhapOtoK() {
        super.nhap();
    }

    public void xuat() {
        super.xuat();
        System.out.println("So cho ngoi: " + getSochongoi());
        System.out.println("Thue: " + thue());

    }
}
