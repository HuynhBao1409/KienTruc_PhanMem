package vd2;

public class Computer {
    //Cac thanh phan can xay dung, viec xay dung cac thanh phan nay la phuc tap
    String CPU,RAM,storage,screen;
    //Ham khoi, khoi tao doi tuong can xay dung tuw doi tuong builder
    private Computer(Builder b){
        this.CPU = b.CPU;
        this.RAM = b.RAM;
        this.storage = b.storage;
        this.screen = b.screen;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", RAM='" + RAM + '\'' +
                ", storage='" + storage + '\'' +
                ", screen='" + screen + '\'' +
                '}';
    }
    public static class Builder{
        String CPU,RAM,storage,screen;
        public Builder addCPU(String cpu){
            this.CPU = cpu;
            return this;
        }
        public Builder addRAM(String ram){
            this.RAM = ram;
            return this;
        }
        public Builder addstorage(String storage){
            this.storage = storage;
            return this;
        }
        public Builder addscreen(String screen){
            this.screen = screen;
            return this;
        }
        public Computer build(){
            return new Computer(this);
        }
    }

}
