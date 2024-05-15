package CC2_sapxep;

import java.util.ArrayList;
import java.util.List;

public class QLSV {
    private ISoSanh soSanh;
    private List<SinhVien> list = new ArrayList<>();

    public QLSV setSoSanh(ISoSanh soSanh) {
        this.soSanh = soSanh;
        return this;
    }

    public void sapXep(){
        for(int i=0; i<list.size()-1; i++)
        for (int j=i+1; j<list.size();j++)
            //Neu ptu i lon hon ptu j
            if(soSanh.soSanh(list.get(i),list.get(j))>0){
                //Chuyen j ve i
                SinhVien s = list.get(i);//Lay ptu i
                list.set(i,list.get(j));//lay ptu j vao ptu i
                list.set(j,s);
            }
    }
    public void sapxep2(){
        list.sort((o1, o2) -> soSanh.soSanh(o1,o2));
    }
    public void Them(SinhVien sv){
        list.add(sv);
    }
    public void inDS(){
        for(SinhVien s: list)
            System.out.println(s.toString());
    }
}
