package observer;

public class Main {
    public static void main(String[] args) {
        Tigia t = new tigiaUSD();
        nhaDauTu a = new nhaDauTu(t);
        nhaDauTuB b = new nhaDauTuB(t);
        a.dangKy(); b.dangKy();
        System.out.println("Thông báo lần 1");
        t.notify(-1);
        a.huyDangKy();
        System.out.println("Thông báo lần 2");
        t.notify(3);
    }
}
