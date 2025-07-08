package creationalPatterns.factory;

public abstract class Animal {
    private final String environment;

    public Animal(String environment) {
        this.environment = environment;
    }

    public String getEnvironment() {
        return environment;
    }

    public void speak(){
        System.out.println("Do a sound");
    }
}
