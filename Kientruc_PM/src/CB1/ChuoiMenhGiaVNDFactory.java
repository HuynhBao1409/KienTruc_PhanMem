package CB1;

public class ChuoiMenhGiaVNDFactory extends ChuoiMenhGiaFactory{
    @Override
    public ATM getChuoiMenhGia(int menhGiaCaoNhat) {
        ATM chuoiMenhGia = new MenhGiaThapNhat();
        chuoiMenhGia.menhGia = 1;

        chuoiMenhGia = new ChuoiMenhGiaVND(10, chuoiMenhGia).thietLapMenhGiaThapHon(chuoiMenhGia);
        if (menhGiaCaoNhat >= 50) {
            chuoiMenhGia = new ChuoiMenhGiaVND(50, chuoiMenhGia).thietLapMenhGiaThapHon(chuoiMenhGia);
        }
        if (menhGiaCaoNhat >= 100) {
            chuoiMenhGia = new ChuoiMenhGiaVND(100, chuoiMenhGia).thietLapMenhGiaThapHon(chuoiMenhGia);
        }
        if (menhGiaCaoNhat >= 500) {
            chuoiMenhGia = new ChuoiMenhGiaVND(500, chuoiMenhGia).thietLapMenhGiaThapHon(chuoiMenhGia);
        }

        return chuoiMenhGia;
    }
}
