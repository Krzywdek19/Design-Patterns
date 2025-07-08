package creationalPatterns.factory;

public class LandAnimalFactory extends AnimalFactory {
    @Override
    public Animal getAnimal(String environment, String type) {
        if(environment.equalsIgnoreCase("land")){
            switch (type){
                case "Dog":
                    return new Dog(environment);
                default:
                    throw new IllegalArgumentException("Invalid animal type");
            }
        }
        throw new IllegalArgumentException("Invalid environment");
    }
}
