package btj4;

public class Mainbjt4 {
    public static  void main(String[] args){
        QuanLyChuyenXe qlcx = new QuanLyChuyenXe();
        qlcx.Them(new NoiThanh("001","Beo","79A-1234",10000000,1,12));
        qlcx.Them(new NgoaiThanh("002","Buynh","79A-4567",2000000,"NT",10));
    qlcx.inDSCX();
        System.out.println("Doanh thu noi thanh"+  qlcx.doanhThuNoiThanh());
        System.out.println("Doanh thu ngoai thanh"+ qlcx.doanhThuXeNgoaiThanh());
        System.out.println("Tong doanh thu"+ qlcx.tongDoanhThu());

    }

}

