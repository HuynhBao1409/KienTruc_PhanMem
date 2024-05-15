package CC2_sapxep;

public class Main {
    public static void main(String[]args){
        QLSV qlsv=new QLSV();
        qlsv.Them(new SinhVien("HaoBuynh","14/09",8.2f));
        qlsv.Them(new SinhVien("Bao","14/09",6));
        qlsv.setSoSanh(new SoSanhTheoDiem()).sapXep();
        qlsv.inDS();
    }
}
