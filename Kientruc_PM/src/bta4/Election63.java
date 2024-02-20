package bta4;

public class Election63 {
    //Khai bao bien instance
    private static  Election63 instance;
    int trump = 0, joe_biden = 0;
    //phuong thuc khoi tao
    private  Election63(){
    }
    //phuong thuc getInstance de tra ve bien instance
    public static Election63 getInstance(){
        if(instance == null)
            instance = new Election63();
        return instance;
    }
    public  void vote (Candidate c){
        if(c == Candidate.BIDEN)
            joe_biden++;
        else if (c==Candidate.TRUMP)
            trump++;
    }
    public  void inKetQua(){
        System.out.println("Trump: "+ trump + "\n");
        System.out.println("Biden: "+ joe_biden + "\n");
    }
}
