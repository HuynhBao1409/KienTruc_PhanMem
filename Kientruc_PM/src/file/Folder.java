package file;

import java.util.ArrayList;
import java.util.List;

public class Folder extends AbstractFlie{
    List<AbstractFlie> children = new ArrayList<>();
    public Folder(String tenFile, String ngayTao) {
        super(tenFile, ngayTao);
    }

    @Override
    public void add(AbstractFlie file) {
        children.add(file);
        file.duongDan = this.duongDan + "\\" + file.duongDan;
    }

    @Override
    public void remove(AbstractFlie file) {
        children.remove(file);
    }

    @Override
    public String getStringTreeFolder() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.tenFile).append("\n");
        //Ghep cay con vao
        for(var f: children)
            builder.append("\n").append(f.getStringTreeFolder());
        return  builder.toString();
    }
}
