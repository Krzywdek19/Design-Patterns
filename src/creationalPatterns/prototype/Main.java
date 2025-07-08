package creationalPatterns.prototype;

public class Main {
    public static void main(String[] args) {
        Person owner = new Person("Luke",22);
        Dog dog = new Dog("dogie", 2, owner);
        Dog copiedDog = dog.clone();
        dog.getOwner().setName("Andrew");
        System.out.println(dog.getOwner().getName());
        System.out.println(copiedDog.getOwner().getName());
    }
}
