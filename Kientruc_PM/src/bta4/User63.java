package bta4;

public class User63 {
    String ten;
    public User63(String ten){
        this.ten = ten;
    }
    public void vote(Candidate c){
        Election63.getInstance().vote(c);
    }
}
