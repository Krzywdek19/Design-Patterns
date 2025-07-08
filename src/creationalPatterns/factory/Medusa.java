package creationalPatterns.factory;

public class Medusa extends WaterAnimal{
    public Medusa(String environment) {
        super(environment);
    }

    @Override
    public void speak() {
        System.out.println("gulgulgugl bzbzbzbz");
    }

    @Override
    void swim() {
        System.out.println("Medusa swims");
    }
}
