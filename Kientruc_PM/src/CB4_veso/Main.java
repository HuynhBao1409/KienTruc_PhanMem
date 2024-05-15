package CB4_veso;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> gdb = Arrays.asList("567251");
        GiaiThongThuong gtt = new GiaiThongThuong("Giai dac biet",gdb);
        List<String> gdb1 = Arrays.asList("98264");
        GiaiThongThuong gt1 = new GiaiThongThuong("Giai nhat",gdb1);

    }
}
