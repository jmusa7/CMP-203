import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer(new RAM(), new processor(), new storage());
        System.out.println(computer);
    }
}