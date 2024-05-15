package CB4_veso;

import java.util.List;

public class GiaiThongThuong extends IDoVeSo{
    public GiaiThongThuong(String tenGiai, List<String> soTrungThuong) {
        super(tenGiai, soTrungThuong);
    }
    @Override
    public IDoVeSo giaiKeTiep(IDoVeSo giaiKT) {
        return giaiKT;
    }

    @Override
    public void doVeSo(String veSo) {
        for(String s : soTrungThuong){
            if (veSo.equals(s)){
                System.out.println("Trung Giai");
                return;
            }
        }
        giaiKeTiep(this).doVeSo(veSo);
    }
}
