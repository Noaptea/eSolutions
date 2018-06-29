package p12facade.Computer;

public class ComputerFacade {

    private static final Integer BOOT_ADDRESS = 0;
    private Cpu cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFacade() {
        this.cpu = new Cpu();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void start() {
        cpu.freeze();
        memory.load(BOOT_ADDRESS, hardDrive.read(0, 20000));
        cpu.jump(BOOT_ADDRESS);

    }

    public void stop() {

        memory.unload();
        hardDrive.stop();
    }
}
