public class Main{
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Ayo");
        person1.displayName();
        Person student = new Person("Ayomide", "12345", "Bingham university", "BHU/22/04/05/0002");
        Person staff = new Person("Bingham university", "Boss Barka", "54321", "021");
        System.out.println();
        System.out.println(student);
        System.out.println(staff);

        physics velocity = new physics();
        System.out .println(velocity.calVelocity(120.0f, 2));
        physics velocity1 = new physics();
        System.out.println(velocity1.calVelocity(2.00f, 3.00f,4));

    }
}
