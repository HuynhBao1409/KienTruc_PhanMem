package observer;

public class nhaDauTuB implements Tigia.TigiaObserver{
    Tigia t;

    public nhaDauTuB(Tigia t) {
        this.t = t;
    }

    public void dangKy(){
        t.attach(this);
    }
    public void huyDangKy(){
        t.detach(this);
    }
    @Override
    public void tigiaChanged(double delta) {
        if (delta<0)
            System.out.println("Nhà đầu tư B: Bán ra");
        else
            System.out.println("Nhà đầu tư B: Mua vào");
    }
}
