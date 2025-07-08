package creationalPatterns.factory;

public abstract class TerrestrialAnimal extends Animal{
    public TerrestrialAnimal(String environment) {
        super(environment);
    }

    abstract void eat();
}
