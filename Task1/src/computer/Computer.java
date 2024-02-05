package computer;

import computer.displey.Displey;
import computer.harddisk.HardDisk;
import computer.keyboard.Keyboard;
import computer.memory.Memori;
import computer.processor.Processor;

public class Computer {
    private Processor processor;
    private Memori memori;
    private HardDisk hardDisk;
    private Displey displey;
    private Keyboard keyboard;

    private final String vendor;
    private final String name;

    public Computer(Processor processor,
                    Memori memori,
                    HardDisk hardDisk,
                    Displey displey,
                    Keyboard keyboard,
                    String vendor,
                    String name) {
        this.processor = processor;
        this.memori = memori;
        this.hardDisk = hardDisk;
        this.displey = displey;
        this.keyboard = keyboard;
        this.vendor = vendor;
        this.name = name;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Memori getMemori() {
        return memori;
    }

    public void setMemori(Memori memori) {
        this.memori = memori;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public Displey getDispley() {
        return displey;
    }

    public void setDispley(Displey displey) {
        this.displey = displey;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public String getVendor() {
        return vendor;
    }

    public String getName() {
        return name;
    }

    public double getWeight(){
        return processor.getWeight() +
                memori.getWeight() +
                keyboard.getWeight() +
                hardDisk.getWeight() +
                displey.getWeight();
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor=" + processor +
                ", memori=" + memori +
                ", hardDisk=" + hardDisk +
                ", displey=" + displey +
                ", keyboard=" + keyboard +
                ", vendor='" + vendor + '\'' +
                ", name='" + name + '\'' +
                '}';
    }


}
