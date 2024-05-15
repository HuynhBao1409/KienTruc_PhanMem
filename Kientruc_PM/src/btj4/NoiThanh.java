package btj4;
/*
Công ty vận tải V quản lý thông tin là các chuyến xe. Thông tin của 2 loại chuyến xe:
- Chuyến xe nội thành: Mã số chuyến, Họ tên tài xế, số xe, số tuyến, số km đi được, doanh
thu.
- Chuyến xe ngoại thành: Mã số chuyến, Họ tên tài xế, số xe, nơi đến, số ngày đi, doanh thu.
*/
public class NoiThanh extends ChuyenXe {
        int soTuyen, soKM;

    public NoiThanh(String masoChuyen, String taixe, String soxe, float doanhthu, int soTuyen, int soKM) {
        super(masoChuyen, taixe, soxe, doanhthu);
        this.soTuyen = soTuyen;
        this.soKM = soKM;
    }

    @Override
    public String toString() {
        String st = super.toString();
        st= st + "Số tuyến: " + soTuyen+ "\n"+
                "Số KM: " + soKM + "\n";
        return st;
    }

    public int getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public int getSoKM() {
        return soKM;
    }

    public void setSoKM(int soKM) {
        this.soKM = soKM;
    }
}
