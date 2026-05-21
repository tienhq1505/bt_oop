package Bai_2;

import java.util.ArrayList;
import java.util.List;

public class Qlthuvien {
    private List<Thuvien> tv;

    public Qlthuvien() {
        this.tv = new ArrayList<>();
    }

    public void themthuvien(Thuvien thuvien) {
        this.tv.add(thuvien);
    }

    // public boolean deleteSach(int matailieu) {
    // Thuvien tv = this.tv
    // .stream()
    // .filter(item -> item.getMatailieu() == matailieu)
    // .findFirst()
    // .orElse(null);
    // if (tv == null) {
    // return false;
    // }
    // this.tv.remove(tv);
    // return true;
    // }
    public boolean deleteSach(int matailieu) {
        for (int i = 0; i < this.tv.size(); i++) {
            if (this.tv.get(i).getMatailieu() == matailieu) {
                this.tv.remove(i);
                return true;
            }
        }
        return false;
    }

    public void hienthi() {
        for (Thuvien thuvien : tv) {
            thuvien.hienthi();
        }
    }

    public void timkiemsach() {
        for (Thuvien thuvien : tv) {
            if (thuvien instanceof Sach) {
                thuvien.hienthi();
            }
        }
    }

    public void timkiemtapchi() {
        for (Thuvien thuvien : tv) {
            if (thuvien instanceof Tap_chi) {
                thuvien.hienthi();
            }
        }
    }

    public void timkiembao() {
        for (Thuvien thuvien : tv) {
            if (thuvien instanceof bao) {
                thuvien.hienthi();
            }
        }
    }
}
