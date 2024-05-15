package CB4_veso;

import java.util.List;

public abstract class IDoVeSo {
    String tenGiai;
    List<String> soTrungThuong;

    public IDoVeSo(String tenGiai, List<String> soTrungThuong) {
        this.tenGiai = tenGiai;
        this.soTrungThuong = soTrungThuong;
    }
    public abstract IDoVeSo giaiKeTiep(IDoVeSo giaiKT);
    public abstract void doVeSo(String veSo);

}
