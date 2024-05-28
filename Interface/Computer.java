public class Computer implements Electronic{

    RAM ram;

    processor cpu;

    storage storage;

    public Computer(RAM ram, processor cpu, storage storage) {
        this.ram = ram;
        this.cpu = cpu;
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "ram=" + ram +
                ", cpu=" + cpu +
                ", storage=" + storage +
                '}';
    }

    @Override
    public boolean on() {
        return true;
    }

    @Override
    public boolean off() {
        return false;
    }
}