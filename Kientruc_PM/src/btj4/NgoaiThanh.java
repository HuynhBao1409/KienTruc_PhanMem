package btj4;

import java.util.Date;

/*
Công ty vận tải V quản lý thông tin là các chuyến xe. Thông tin của 2 loại chuyến xe:
- Chuyến xe nội thành: Mã số chuyến, Họ tên tài xế, số xe, số tuyến, số km đi được, doanh
thu.
- Chuyến xe ngoại thành: Mã số chuyến, Họ tên tài xế, số xe, nơi đến, số ngày đi, doanh thu.
*/
public class NgoaiThanh extends ChuyenXe{
    String noiDen;
    int ngayDi;

    public NgoaiThanh(String masoChuyen, String taixe, String soxe, float doanhthu, String noiDen, int ngayDi) {
        super(masoChuyen, taixe, soxe, doanhthu);
        this.noiDen = noiDen;
        this.ngayDi = ngayDi;
    }

    @Override
    public String toString() {
        String st = super.toString();
        st = st + "Nơi đến: " + noiDen + "\n" +
                 "Ngày đi: "+ ngayDi + "\n";
        return st;
    }

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public int getNgayDi() {
        return ngayDi;
    }

    public void setNgayDi(int ngayDi) {
        this.ngayDi = ngayDi;
    }
}
