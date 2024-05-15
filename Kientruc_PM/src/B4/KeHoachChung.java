package B4;

import btA1.hoaDon;

import java.util.ArrayList;
import java.util.List;

public class KeHoachChung extends KeHoachHocTap{
    public KeHoachChung(String ten) {
        super(ten);
    }
    List<KeHoachHocTap> list = new ArrayList<>();

    @Override
    public int soTC() {
        int t=0;
        for(KeHoachHocTap k: list)
            t = t +k.soTC();
        return t;
    }

    @Override
    public int HocPhi() {
        int s=0;
        for(KeHoachHocTap k: list)
            s=s+k.HocPhi()* k.soTC();
        return s;
    }

    @Override
    public String thongTin() {
        StringBuilder builder = new StringBuilder();
        builder.append(ten).append("\tSo TC: ").append(soTC())
                .append("\tHocPhi: ").append(HocPhi());
        for(KeHoachHocTap k: list){
            k.p = this.p+"\t";
            builder.append("\n").append(k.p)
                    .append(k.thongTin());
            k.p="";
        }
        return builder.toString();
    }

    @Override
    public void add(KeHoachHocTap k) {
    list.add(k);
    }

    @Override
    public void remove(KeHoachHocTap k) {
    list.remove(k);
    }
}
