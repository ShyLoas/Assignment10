package assignment10;

import java.util.Date;

public class Dog extends Animal {
    String breed;
    public Dog(String id, String source, Date dateOfBirth, String color, String breed) {
        super(id, source, dateOfBirth, color);
        this.breed = breed;
    }

    @Override
    void makeSound() {
        System.out.println("Woof! Woof!");
    }
     @Override
    public String toString() {
        return super.toString() + ", Breed: " + breed;
    }
}
