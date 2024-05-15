package btj4;

import java.util.ArrayList;
import java.util.List;

public class QuanLyChuyenXe {
    List<ChuyenXe> list = new ArrayList<>();
    public void Them(ChuyenXe c){
        //Kiem tra neu co chuyen trong danh sach thi dung
        for(ChuyenXe cx: list){
            if(cx.getMasoChuyen().equals(c.getMasoChuyen()))
                return;
        }
        //them chuyen neu chua co
        list.add(c);
    }
    public float doanhThuNoiThanh(){
        float dt = 0;
        for(ChuyenXe c:list) {
            if (c instanceof NoiThanh)
                dt += c.getDoanhthu();
        }
        return dt;
    }
    public  float doanhThuXeNgoaiThanh(){
        float dt = 0;
        for(ChuyenXe c:list) {
            if (c instanceof NgoaiThanh)
                dt += c.getDoanhthu();
        }
        return dt;
    }
    public float tongDoanhThu(){
        float dt = 0;
        for(ChuyenXe c:list)
                dt += c.getDoanhthu();
        return dt;
    }
    public void inDSCX(){
        for (ChuyenXe c:list) {
            System.out.println(c.toString());
        }
    }
}
