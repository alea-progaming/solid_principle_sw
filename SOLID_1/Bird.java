public class Bird extends Pet implements Sound, Food{
    public Bird(String petName, String owner) {
        super(petName, owner);
    }

    @Override
    public String eat() {
        return "seeds.";
    }

    @Override
    public String makeSound() {
        return "tweet, tweet";
    }
}
