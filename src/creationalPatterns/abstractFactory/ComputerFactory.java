package creationalPatterns.abstractFactory;

public abstract class ComputerFactory {
    abstract ComputerPart create(String type);
}
