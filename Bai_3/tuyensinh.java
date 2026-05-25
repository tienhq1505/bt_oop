package Bai_3;

import java.util.ArrayList;

public class tuyensinh {
    private ArrayList<thisinh> danhsach = new ArrayList<>();

    public void themthisinh(thisinh thisinh) {
        danhsach.add(thisinh);
    }

    public void hienthi() {
        for (thisinh ts : danhsach) {
            ts.hienthi();
        }
    }

    public void timsbd(int sbd) {
        boolean timthay = false;
        for (thisinh ts : danhsach) {
            if (ts.getSbd() == sbd) {
                ts.hienthi();
                timthay = true;
            }
        }
        if (timthay = false) {
            System.out.println("Không tìm thấy");
        }
    }
}
