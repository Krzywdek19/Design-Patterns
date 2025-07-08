package creationalPatterns.factory;

public class WaterAnimalFactory extends  AnimalFactory {
    @Override
    public Animal getAnimal(String environment, String type) {
        if(environment.equalsIgnoreCase("Water")){
            switch (type){
                case "Medusa":
                    return new Medusa(environment);
                default:
                    throw new IllegalArgumentException("Invalid animal type");
            }
        }else throw new IllegalArgumentException("Invalid environment");
    }
}
