package creationalPatterns.factory;

public class Main {
    private static final WaterAnimalFactory waterAnimalFactory = new WaterAnimalFactory();
    private static final LandAnimalFactory landAnimalFactory = new LandAnimalFactory();

    public static void main(String[] args) {
        try{
            Animal dogie =  landAnimalFactory.getAnimal("land","Dog");
            System.out.println(dogie.toString());
            Animal medusa = waterAnimalFactory.getAnimal("water","Medusa");
            System.out.println(medusa.toString());
            Animal swimmingDogie = landAnimalFactory.getAnimal("water","Dog");
            System.out.println(swimmingDogie.toString());
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}
