package creational;

public class MainSingleton {
    public static  void main(String[]arg){
        Singleton s1= Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        s1.inCount();//1
        s1.inCount();//2
        s1.inCount();//1
        s1.inCount();//3
    }
}
