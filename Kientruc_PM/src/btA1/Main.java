package btA1;

public class Main {
    public static void main(String[] args){
        hoaDonHeader header = new hoaDonHeader("123","14/2","Bao");
        CTHD c1= new CTHD("Laptop",2,1000,2);
        CTHD c2= new CTHD("Mouse",4,2000,1);
        hoaDon hoaDon =new hoaDon.Builder()
                .sethoaDonHeader(header)
                .addCTHD(c1)
                .build();

    }
}
