public class Cat extends Pet implements Sound, Food{

    public Cat(String petName, String owner){
        super(petName, owner);
    }

    @Override
    public String eat() {
        return "tuna.";
    }

    @Override
    public String makeSound() {
        return "meow, meow";
    }
    
}
