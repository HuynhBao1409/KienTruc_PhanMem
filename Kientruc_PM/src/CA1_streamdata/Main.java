package CA1_streamdata;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyStream<List<MonHoc>> stream =new MyStream<>();
        DataAccess dataAccess=new DataAccess(stream);
        MyClient client=new MyClient(stream);
        dataAccess.add(new MonHoc("001",3));
        dataAccess.add(new MonHoc("002",3));
        dataAccess.remove("002");
    }
}
