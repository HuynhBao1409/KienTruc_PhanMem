package B1;

public class Tru extends Decorator{
    float toanHang;
    public Tru(BieuThuc bieuThuc, float toanHang) {
        super(bieuThuc);
        this.toanHang= toanHang;
    }

    @Override
    public float giaTri() {
        return bieuThuc.giaTri() - toanHang;
    }

    @Override
    public String bieuThuc() {
        return "(" + bieuThuc.bieuThuc() + " - " + String.valueOf(toanHang) + ")";
    }
}
