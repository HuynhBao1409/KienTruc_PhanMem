package CB1;

public class Main {
    public static void main(String[] args) {
        ChuoiMenhGiaFactory factory = new ChuoiMenhGiaVNDFactory();
        System.out.println("Rút tiền với mệnh giá cao nhất là 500:");
        factory.rutTien(293, 500);
        System.out.println();
        System.out.println("Rút tiền với mệnh giá cao nhất là 50:");
        factory.rutTien(293, 50);
    }
}
