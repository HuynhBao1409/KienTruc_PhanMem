package MayTinh_builder;

public class UpgradeRam extends PCDecorator{
    String addedRam;
    int vAddedRam;

    public UpgradeRam(PC pc, String addedRam, int vAddedRaml) {
        super(pc);
        this.addedRam = addedRam;
        this.vAddedRam = vAddedRam;
    }


    @Override
    String build() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(pc.build()).append("\n")
                .append("Nang cap them: ").append(addedRam);
        return stringBuilder.toString();
    }

    @Override
    int value() {
        return pc.value() + vAddedRam;
    }

    @Override
    public String getRam() {
        return pc.getRam() + " , " + addedRam;
    }

    @Override
    public int getvRam() {
        return pc.getvRam() + vAddedRam;
    }
}
