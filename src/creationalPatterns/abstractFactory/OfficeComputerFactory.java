package creationalPatterns.abstractFactory;

public class OfficeComputerFactory extends ComputerFactory{
    @Override
    ComputerPart create(String type) {
        if(type.equalsIgnoreCase("GPU")){
            return new OfficeGPU();
        }else {
            return null;
        }
    }
}
