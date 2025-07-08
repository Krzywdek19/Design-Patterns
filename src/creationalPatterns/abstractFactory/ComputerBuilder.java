package creationalPatterns.abstractFactory;

public class ComputerBuilder {
    public static void main(String[] args) {
        createComputer("office");
        createComputer("gaming");
    }

    public static void createComputer(String type) {
        ComputerFactory computerFactory = FactoryCreator.getFactory(type);
        GPU gpu = (GPU)computerFactory.create("GPU");
        //here should be more objects to create but I am lazy
    }
}
