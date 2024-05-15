package file;

public abstract class AbstractFlie {
    String tenFile, ngayTao;
    String duongDan;

    public AbstractFlie(String tenFile, String ngayTao) {
        this.tenFile = tenFile;
        this.ngayTao = ngayTao;
        this.duongDan = tenFile;
    }

    public abstract void add(AbstractFlie file);
    public abstract void remove(AbstractFlie file);
    public abstract String getStringTreeFolder();
    public String getPath(){
        return duongDan;
    }
}
