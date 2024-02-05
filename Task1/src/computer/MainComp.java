package computer;

import computer.displey.Displey;
import computer.displey.MonitorType;
import computer.harddisk.HardDisk;
import computer.harddisk.HardDiskType;
import computer.keyboard.Illuminate;
import computer.keyboard.Keyboard;
import computer.keyboard.KeyboardType;
import computer.memory.Memori;
import computer.memory.MemoriType;
import computer.processor.Chastota;
import computer.processor.CoreCount;
import computer.processor.Creator;
import computer.processor.Processor;

public class MainComp {

    public static void main(String[] args) {

        Processor processor = new Processor(Chastota.TWO_THAUSEN, CoreCount.FOUR, Creator.AMD, 500);
        Memori memori = new Memori(MemoriType.DDR4, 32, 300);
        Keyboard keyboard = new Keyboard(KeyboardType.WERELLESS, Illuminate.YES, 500);
        HardDisk hardDisk = new HardDisk(HardDiskType.HDD, 400, 700);
        Displey displey = new Displey(18, MonitorType.QLED, 2000);

        Computer computer = new Computer(processor, memori, hardDisk, displey, keyboard, "INTEL", "Romashka");

        System.out.println("Ну вот мы и собрали первый компьютер - УРА!!!");
        System.out.println(computer);
        System.out.println("Общая масса компа равна:");
        System.out.println(computer.getWeight());
    }
}
