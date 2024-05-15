package CB1;

public abstract class ChuoiMenhGiaFactory {
    public abstract ATM getChuoiMenhGia(int menhGia);

    public void rutTien(int soTien, int menhGiaCaoNhat) {
        ATM chuoiMenhGia = getChuoiMenhGia(menhGiaCaoNhat);
        chuoiMenhGia.rutTien(soTien);
    }

}
