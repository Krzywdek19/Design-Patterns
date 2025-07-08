package creationalPatterns.abstractFactory;

public class FactoryCreator {
    public static ComputerFactory getFactory(String type){
        if(type.equalsIgnoreCase("gaming")){
            return new GamingComputerFactory();
        }else if(type.equalsIgnoreCase("office")){
            return new OfficeComputerFactory();
        }
        throw new IllegalArgumentException("No such computer type");
    }
}
