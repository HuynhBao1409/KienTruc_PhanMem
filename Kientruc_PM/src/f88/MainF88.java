package f88;

public class MainF88 {
    public static void main(String[] args) {
        ChoVayF88 bv = new NhanVien("Beo 10 ngon","Con no",100_000);
        ChoVayF88 bv1 = new ChuTich("Buynh","truong phong",200_000);
        ChoVayF88 bv2 = new ChuTich("Nghia","giamdoc",500_000);
        bv.capCaoHon(bv1).capCaoHon(bv2);
        System.out.printf(bv.xuLyVay(45_000));
    }
}
