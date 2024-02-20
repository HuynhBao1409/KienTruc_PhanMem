package bta4;

public class MainVote {
    public static void main(String[] args) {
        User63 bao = new User63("Bao");
        User63 beo = new User63("Beo");
        bao.vote(Candidate.TRUMP);
        beo.vote(Candidate.BIDEN);
        Election63.getInstance().inKetQua();
    }
}
