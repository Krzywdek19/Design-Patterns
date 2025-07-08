package creationalPatterns.factory;

public abstract class WaterAnimal extends Animal {
    public WaterAnimal(String environment) {
        super(environment);
    }

    abstract void swim();
}
