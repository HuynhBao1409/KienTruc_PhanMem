package B1;

import java.nio.ByteBuffer;

public class Main {
    public static void main(String[] args) {
        BieuThuc  bieuThuc = new BieuThucDonGian(4);
        bieuThuc = new Cong(bieuThuc,6);
        bieuThuc = new Cong(bieuThuc,9);
        bieuThuc = new Nhan(bieuThuc, 8);
        bieuThuc = new Chia(bieuThuc,2);
        System.out.println(bieuThuc.bieuThuc()+ "="+ bieuThuc.giaTri());

    }
}
