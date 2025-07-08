package creationalPatterns.factory;

public class Dog extends TerrestrialAnimal{
    public Dog(String environment) {
        super(environment);
    }

    @Override
    void eat() {
        System.out.println("Dog eats");
    }

    @Override
    public void speak() {
        System.out.println("wooof wooof");
    }
}
