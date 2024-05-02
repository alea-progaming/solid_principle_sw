public class Dog extends Pet implements Sound, Food{

    public Dog(String petName, String owner) {
        super(petName, owner);
    }

    @Override
    public String eat() {
        return "beef.";
    }

    @Override
    public String makeSound() {
        return "woof, woof";
    }
    
}
