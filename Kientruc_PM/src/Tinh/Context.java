package Tinh;

public class Context {
    //Su dung thanh phan tuy bien thong qua 1 doi tuong dai dien
    Tinh tinh;

    //Setter de gan 1 doi tuong cu the cho bien dai dien khi su dung
    public Context setTinh(Tinh tinh) {
        this.tinh = tinh;
        return this;
    }
    public  float tinh(float a, float b){
        return tinh.tinh(a, b);
    }
}
