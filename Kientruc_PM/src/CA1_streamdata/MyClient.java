package CA1_streamdata;

import java.util.List;

public class MyClient implements MyStream.MyListener<List<MonHoc>> {
    MyStream<List<MonHoc>> myStream;

    public MyClient(MyStream<List<MonHoc>> myStream) {
        this.myStream = myStream;
        myStream.addListener(this);
    }

    @Override
    public void listen(List<MonHoc> monHocs) {
        System.out.println("So mon hoc"+monHocs.size());
        for(MonHoc m :monHocs){
            System.out.println(m.toString());
        }
    }
}
