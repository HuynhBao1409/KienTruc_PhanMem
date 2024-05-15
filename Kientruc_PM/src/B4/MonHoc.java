package B4;

public class MonHoc extends KeHoachHocTap{
    int soTC;
    int HocPhi;

    public MonHoc(String ten, int soTC, int hocPhi) {
        super(ten);
        this.soTC = soTC;
        this.HocPhi = hocPhi;
    }

    @Override
    public int soTC() {
        return soTC;
    }

    @Override
    public int HocPhi() {
        return HocPhi;
    }

    public MonHoc(String ten) {
        super(ten);
    }

    @Override
    public String thongTin() {
        StringBuilder builder = new StringBuilder();
        builder.append("\nTen Mon: ").append(ten).append("\nSo TC: ").append(soTC)
                .append("\nHocPhi: ").append(HocPhi());
        return builder.toString();
    }

    @Override
    public void add(KeHoachHocTap k) {

    }

    @Override
    public void remove(KeHoachHocTap k) {

    }
}
