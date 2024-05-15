package Tinh;

public class MainTinh {
    public static void main(String[] args){
        Context c= new Context();
        System.out.println( c.setTinh(new Cong()).tinh(3, 5));
        System.out.println(c.setTinh(new Tru()).tinh(6,2));
        float tq1=c.setTinh(new Cong()).tinh(3, 5);
        float kq= c.setTinh(new Nhan()).tinh(tq1,5);
        float kq1= c.setTinh(new Chia()).tinh(kq,2);
        System.out.println( kq1);

    }
}
