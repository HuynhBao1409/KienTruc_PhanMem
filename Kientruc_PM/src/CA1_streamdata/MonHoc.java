package CA1_streamdata;

public class MonHoc extends MyStream{
    String maMH;
    int sotc;

    public MonHoc(String maMH, int sotc) {
        this.maMH = maMH;
        this.sotc = sotc;
    }

    @Override
    public String toString() {
        return "MonHoc{" +
                "maMH='" + maMH + '\'' +
                ", sotc=" + sotc +
                '}';
    }
}
