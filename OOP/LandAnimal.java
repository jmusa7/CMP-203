package OOP;

public class LandAnimal extends Animal {
    @Override
    String move() {
        return "Moves on Land";
    }

    public static void main(String[] args) {
        LandAnimal Dog = new LandAnimal();
        LandAnimal Chimpanzee = new LandAnimal();
        Dog.name = "Rex";
        Chimpanzee.move();
        System.out.println(Dog.name);
        System.out.println(Chimpanzee.move());
    }
}