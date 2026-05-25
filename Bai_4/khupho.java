package Bai_4;

import java.util.ArrayList;

public class khupho {
    private ArrayList<hogiadinh> danhsachhogd = new ArrayList<>();

    public ArrayList<hogiadinh> getDanhsachhogd() {
        return danhsachhogd;
    }

    public void setDanhsachhogd(ArrayList<hogiadinh> danhsachhogd) {
        this.danhsachhogd = danhsachhogd;
    }

    public void themHoGiaDinh(hogiadinh hogiadinh) {

        danhsachhogd.add(hogiadinh);
    }

    public void hienthithongtin() {
        for (hogiadinh hogiadinh : danhsachhogd) {
            hogiadinh.hienthi();
        }
    }

}
