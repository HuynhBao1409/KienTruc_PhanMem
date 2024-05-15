package f88;

public abstract class ChoVayF88 {
    String ten,chucvu;
    int hamMucXuLyVay;


    public ChoVayF88(String ten, String chucvu, int hamMucXuLyVay) {
        this.ten = ten;
        this.chucvu = chucvu;
        this.hamMucXuLyVay = hamMucXuLyVay;
    }

    public abstract ChoVayF88 capCaoHon(ChoVayF88 capCao);
    public abstract String xuLyVay(int soTienVay);
}
