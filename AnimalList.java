
package assignment10;

import java.util.ArrayList;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AnimalList {
    public ArrayList<Animal> al;
    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

    public AnimalList(){
        this.al = new ArrayList<>();
    }

    public void addAnimal() {
    System.out.print("Enter Number of Animals: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    for (int i = 0; i < n; i++) {
        System.out.println("\n===== Enter Animal " + (i + 1) + " =====");
        System.out.print("Enter type (Dog/Cat): ");
        String type = sc.nextLine();

        System.out.print("Enter ID: ");
        String id = sc.nextLine();
        System.out.print("Enter Source: ");
        String source = sc.nextLine();
        System.out.print("Enter Date of Birth: ");
        Date dateOfBirth = null;
        try {
            dateOfBirth = df.parse(sc.nextLine());
        } catch (ParseException e) {
            System.out.println("Invalid date");
        }
        System.out.print("Enter Color: ");
        String color = sc.nextLine();

        if (type.equalsIgnoreCase("Dog")) {
            System.out.print("Enter Breed: ");
            String breed = sc.nextLine();
            Dog dog = new Dog(id, source, dateOfBirth, color, breed);
            al.add(dog);
        } else if (type.equalsIgnoreCase("Cat")) {
            Cat cat = new Cat(id, source, dateOfBirth, color);
            al.add(cat);
        } else {
            System.out.println("Invalid type.");
        }
    }
}
    
    public void displayAll() {
        for (Animal animal : al) {
            if (animal instanceof Dog dog) {
                System.out.println("Dog: " + dog);
            } else if (animal instanceof Cat cat) {
                System.out.println("Cat: " + cat);
            } else {
                System.out.println("Unknown Animal Type");
            }
            animal.makeSound();
        }
    }
}
