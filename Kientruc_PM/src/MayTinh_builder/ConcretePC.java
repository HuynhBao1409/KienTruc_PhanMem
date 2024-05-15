package MayTinh_builder;

public class ConcretePC extends PC{
    public ConcretePC(String mainboard, String cpu, String ram, String storage, String screen, int vMainboard,
                      int vCpu, int vRam, int vStorage, int vScreen) {
        this.mainboard = mainboard;
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.screen = screen;
        this.vMainboard = vMainboard;
        this.vCpu = vCpu;
        this.vRam = vRam;
        this.vStorage = vStorage;
        this.vScreen = vScreen;
    }

    @Override
    String build() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(mainboard).append("\n")
                .append(cpu).append("\n")
                .append(ram).append("\n")
                .append(storage).append("\n")
                .append(screen).append("\n");
        return stringBuilder.toString();
    }

    @Override
    int value() {
        return vMainboard+vCpu+vRam+vScreen+vStorage;
    }
}
