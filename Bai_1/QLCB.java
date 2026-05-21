import java.util.ArrayList;
import java.util.List;

public class QLCB {
    private List<quanly> ds;

    public QLCB() {
        this.ds = new ArrayList<>();
    }

    public void themcanbo(quanly canbo) {
        this.ds.add(canbo);
    }

    public void hienthi() {
        for (quanly cb : ds) {
            cb.hienthithongtin();
        }
    }

    public void timtheoten(String ten) {
        for (quanly cb : ds) {
            if (cb.gethoten().equals(ten)) {
                cb.hienthithongtin();
            }
        }
    }
}
