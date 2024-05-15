package CB1;

public class MenhGiaThapNhat extends ATM{
    @Override
    public ATM thietLapMenhGiaThapHon(ATM atm) {
        return null;
    }

    @Override
    public void rutTien(int soTien) {
        int soTo = soTien / menhGia;
        System.out.println("- " + soTo + " tờ mệnh giá " + menhGia);
    }
}

