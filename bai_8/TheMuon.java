package bai_8;

public class TheMuon extends SinhVien {
    private String maPhieuMuon;
    private int ngayMuon;
    private int hanTra;
    private String soHieuSach;

    public TheMuon(String hoTen, int tuoi, String lop, String maPhieuMuon, int ngayMuon, int hanTra,
            String soHieuSach) {
        super(hoTen, tuoi, lop);
        this.maPhieuMuon = maPhieuMuon;
        this.ngayMuon = ngayMuon;
        this.hanTra = hanTra;
        this.soHieuSach = soHieuSach;
    }

    public String getMaPhieuMuon() {
        return maPhieuMuon;
    }

    public void setMaPhieuMuon(String maPhieuMuon) {
        this.maPhieuMuon = maPhieuMuon;
    }

    public int getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(int ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public int getHanTra() {
        return hanTra;
    }

    public void setHanTra(int hanTra) {
        this.hanTra = hanTra;
    }

    public String getSoHieuSach() {
        return soHieuSach;
    }

    public void setSoHieuSach(String soHieuSach) {
        this.soHieuSach = soHieuSach;
    }

    @Override
    public void hienThi() {
        System.out.println("Mã phiếu mượn: " + maPhieuMuon);
        System.out.println("Ngày mượn: " + ngayMuon);
        System.out.println("Hạn trả: " + hanTra);
        System.out.println("Số hiệu sách: " + soHieuSach);
    }
}
