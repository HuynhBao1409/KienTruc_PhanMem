package f88;

public class NhanVien extends ChoVayF88{
    ChoVayF88 capCaoHon;

    public NhanVien(String ten, String chucvu, int hamMucXuLyVay) {
        super(ten, chucvu, hamMucXuLyVay);

    }

    @Override
    public ChoVayF88 capCaoHon(ChoVayF88 capCao) {
          capCaoHon = capCao;
          return capCao;
    }

    @Override
    public String xuLyVay(int soTienVay) {
          if(soTienVay<=hamMucXuLyVay){
              StringBuilder builder = new StringBuilder();
              builder.append(chucvu).append(" ").append(ten).append(" duyệt số vay: ").append(soTienVay)
                      .append(" Nhớ trả tiền lãi đúng hạn");
              return builder.toString();
          }
        return capCaoHon.xuLyVay(soTienVay);
    }

}
