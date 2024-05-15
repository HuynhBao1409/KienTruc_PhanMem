package btj4;
/*
Công ty vận tải V quản lý thông tin là các chuyến xe. Thông tin của 2 loại chuyến xe:
- Chuyến xe nội thành: Mã số chuyến, Họ tên tài xế, số xe, số tuyến, số km đi được, doanh
thu.
- Chuyến xe ngoại thành: Mã số chuyến, Họ tên tài xế, số xe, nơi đến, số ngày đi, doanh thu.
*/
public abstract class ChuyenXe {
    String masoChuyen, Taixe, soxe;
    float doanhthu;


    @Override
    public String toString() {
        return "Mã số chuyến: " + masoChuyen + "\n"+
                "Tài xế: " + Taixe + "\n"+
                "Số xe: " + soxe+ "\n"+
                "Doanh thu: " + doanhthu + "\n";
    }

    public ChuyenXe(String masoChuyen, String taixe, String soxe, float doanhthu) {
        this.masoChuyen = masoChuyen;
        Taixe = taixe;
        this.soxe = soxe;
        this.doanhthu = doanhthu;
    }
    public String getMasoChuyen() {
        return masoChuyen;
    }

    public void setMasoChuyen(String masoChuyen) {
        this.masoChuyen = masoChuyen;
    }

    public String getTaixe() {
        return Taixe;
    }

    public void setTaixe(String taixe) {
        Taixe = taixe;
    }

    public String getSoxe() {
        return soxe;
    }

    public void setSoxe(String soxe) {
        this.soxe = soxe;
    }

    public float getDoanhthu() {
        return doanhthu;
    }

    public void setDoanhthu(float doanhthu) {
        this.doanhthu = doanhthu;
    }

}
