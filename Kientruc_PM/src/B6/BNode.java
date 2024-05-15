package B6;

public abstract class BNode {
    int value;
    String p="";
    public BNode(int value) {
        this.value = value;
    }

    public abstract void addL(BNode n);
    public abstract void addR(BNode n);
    public abstract void removeL(BNode n);
    public abstract void removeR(BNode n);
    public abstract String duyet();

}
