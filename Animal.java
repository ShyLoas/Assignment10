package assignment10;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Animal {

    String source;
    String id;
    Date dateOfBirth;
    String color;
    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    
    public Animal(String id, String source, Date dateOfBirth, String color) {
        this.id = id;
        this.source = source;
        this.dateOfBirth = dateOfBirth;
        this.color = color;
    }
    public Animal(){
    }

    void makeSound() {
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Source: " + source + ", Date of Birth: " + df.format(this.dateOfBirth) + ", Color: " + color;
    }
}
