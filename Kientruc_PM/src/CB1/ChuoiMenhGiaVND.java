package CB1;

public class ChuoiMenhGiaVND extends ATM{
    private ATM menhGiaThapHon;

    public ChuoiMenhGiaVND(int menhGia, ATM menhGiaThapHon) {
        this.menhGia = menhGia;
        this.menhGiaThapHon = menhGiaThapHon;
    }

    @Override
    public ATM thietLapMenhGiaThapHon(ATM atm) {
        menhGiaThapHon = atm;
        return this;
    }

    @Override
    public void rutTien(int soTien) {
        int soTo = soTien / menhGia;
        if (soTo > 0) {
            System.out.println("- " + soTo + " tờ mệnh giá " + menhGia);
        }
        int soTienDu = soTien % menhGia;
        if (soTienDu > 0 && menhGiaThapHon != null) {
            menhGiaThapHon.rutTien(soTienDu);
        }
    }
}
