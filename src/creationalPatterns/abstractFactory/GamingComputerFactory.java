package creationalPatterns.abstractFactory;

public class GamingComputerFactory extends  ComputerFactory {

    @Override
    ComputerPart create(String type) {
        if(type.equalsIgnoreCase("GPU")) {
            return new GamingGPU();
        }else {
            return null;
        }
    }
}
