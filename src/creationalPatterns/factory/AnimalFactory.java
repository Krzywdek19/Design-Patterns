package creationalPatterns.factory;

public abstract class AnimalFactory {
    public abstract Animal getAnimal(String environment, String type);
}
