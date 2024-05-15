package tokenize;

public class Main {
    public static void main(String[] args) {
        String s = "Sinh viên và giáo viên nghỉ lễ 5 thôi";
        Tokenize t = new TachTu(s);
        System.out.println(t.tokenize());
        t = new RemoveStopWord(t);
        System.out.println(t.tokenize());
        t = new RemovePunc(t);
        System.out.println(t.tokenize());
    }
}
