package vd2;

import java.util.Arrays;

public class MainComputer {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder()
                .addCPU("Intel 149000k")
                .addRAM(" 128GB ASUS")
                .addstorage("SDD 8TB")
                .addscreen("50inch 360Hz")
                .build();
        System.out.println(computer.toString());
    }
}
