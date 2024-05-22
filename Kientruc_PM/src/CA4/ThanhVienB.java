package CA4;

import java.util.ArrayList;
import java.util.List;

public class ThanhVienB implements TopicListener{
    private Topic topic;
    private List<TinTuc> list = new ArrayList<>();

    public ThanhVienB(Topic topic) {
        this.topic = topic;
        topic.dangKy(this);
    }

    @Override
    public void listen(TinTuc t) {
        for(int i=0;i<list.size();i++){
            if (list.get(i).getId() == t.getId()) {
                list.set(i, t);
                return;
            }
        }
        list.add(t);
    }
}
