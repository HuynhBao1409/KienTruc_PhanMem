package B4;

public class Main {
    public static void main(String[] args) {
        KeHoachChung kh = new KeHoachChung("2024");
        KeHoachChung hk = new KeHoachChung("HK1");
        MonHoc mh = new MonHoc("Toan",2,1000000);
        MonHoc mh2 = new MonHoc("Web",4,150000);
        kh.add(hk);
        hk.add(mh);
        hk.add(mh2);
        System.out.println(kh.thongTin());
    }
}
