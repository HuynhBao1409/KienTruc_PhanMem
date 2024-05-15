package B6;

public class InternalNode extends BNode {
    BNode left;
    BNode right;


    public InternalNode(int value, BNode left, BNode right) {
        super(value);
        this.left = left;
        this.right = right;
    }

    public InternalNode(int value) {
        super(value);
    }

    @Override
    public void addL(BNode n) {
    this.left = n;
    }

    @Override
    public void addR(BNode n) {
        this.right = n;
    }

    @Override
    public void removeL(BNode n) {
    this.left.removeL(n);
    }

    @Override
    public void removeR(BNode n) {
    this.right.removeR(n);
    }

    @Override
    public String duyet() {
        StringBuilder builder = new StringBuilder();
        builder.append(value);
        if(left!=null)
            left.p=this.p + "\t";
            builder.append("\n\t")
                    .append(left.duyet());
            left.p= "";
        if(right!=null)
            right.p=this.p + "\t";
            builder.append("\n\t").append(right.duyet());
            right.p="";
        return builder.toString();
    }
}
