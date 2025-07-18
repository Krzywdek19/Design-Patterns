package creationalPatterns.prototype;

public class Person implements Cloneable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    public Person clone() {
        try {
            return (Person)super.clone();
        }catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
