package MayTinh_builder;

public abstract class PCDecorator extends PC{
    PC pc;

    public PCDecorator(PC pc) {
        this.pc = pc;
    }

    @Override
    String build() {
        return null;
    }

    @Override
    int value() {
        return 0;
    }
}
