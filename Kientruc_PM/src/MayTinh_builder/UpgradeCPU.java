package MayTinh_builder;

public class UpgradeCPU extends PCDecorator{
    String ReplaceCPU;
    int vReplaceCPU;

    public UpgradeCPU(PC pc, String replaceCPU, int vReplaceCPU) {
        super(pc);
        ReplaceCPU = replaceCPU;
        this.vReplaceCPU = vReplaceCPU;
    }

    @Override
    String build() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(pc.build()).append("\n")
                .append("Nang cap them: ").append(ReplaceCPU);
        return stringBuilder.toString();
    }

    @Override
    int value() {
        return pc.value() + vReplaceCPU - pc.getvCpu();
    }
    @Override
    public int getvCpu() {
        return vReplaceCPU;
    }
}
