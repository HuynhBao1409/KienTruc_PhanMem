package B4;

public abstract class KeHoachHocTap
{
    String ten;
    String p="";
    public abstract int soTC();
    public abstract int HocPhi();

    public KeHoachHocTap(String ten) {
        this.ten = ten;
    }

    public abstract String thongTin();
   public abstract void add(KeHoachHocTap k);
   public abstract void remove(KeHoachHocTap k);
}
