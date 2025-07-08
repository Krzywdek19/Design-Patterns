package creationalPatterns.prototype;

public class Dog implements Cloneable{
    private String name;
    private int age;
    private Person owner;

    public Dog(String name, int age, Person owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public Dog clone(){
        try {
            Dog dog = (Dog)super.clone();
            dog.owner = owner.clone();
            return dog;
        }catch (CloneNotSupportedException e) {
            throw  new AssertionError();
        }
    }
}
