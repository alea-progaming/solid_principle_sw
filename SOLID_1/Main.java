public class Main {
    public static void main(String[] args) {
        Pet dog = new Dog("Lucca", "Mika");
        System.out.println("Dog name: " + dog.getPetName());
        System.out.println("Owner name: " + dog.getOwner());
        System.out.println("Dog makes " + ((Sound)dog).makeSound() + " sound.");
        System.out.println("Dog eats " + ((Food)dog).eat());

        System.out.println();

        Pet cat = new Cat("Kairo", "Mika");
        System.out.println("Cat name: " + cat.getPetName());
        System.out.println("Owner name: " + cat.getOwner());
        System.out.println("Cat makes " + ((Sound)cat).makeSound() + " sound.");
        System.out.println("Cat eats " + ((Food)cat).eat());

        System.out.println();

        Pet bird = new Bird("Mikan", "Aimi");
        System.out.println("Bird name: " + bird.getPetName());
        System.out.println("Owner name: " + bird.getOwner());
        System.out.println("Bird makes " + ((Sound)bird).makeSound() + " sound.");
        System.out.println("Bird eats " + ((Food)bird).eat());
    }
}