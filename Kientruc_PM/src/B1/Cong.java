package B1;

public class Cong extends Decorator{
    float toanHang;
    public Cong(BieuThuc bieuThuc,float toanHang) {
        super(bieuThuc);
        this.toanHang= toanHang;
    }

    @Override
    public float giaTri() {
        return bieuThuc.giaTri() + toanHang;
    }

    @Override
    public String bieuThuc() {
        return "(" + bieuThuc.bieuThuc() + " + " + String.valueOf(toanHang) + ")";
    }
}
