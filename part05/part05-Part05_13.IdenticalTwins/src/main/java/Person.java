
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    // implement an equals method here for checking the equality of objects
    @Override
    public boolean equals(Object compared) {
        // If same location then true
        if (this == compared) {
            return true;
        }
        
        // If not data type Person then false
        if (!(compared instanceof Person)) {
            return false;
        }
        
        // Convert object to type Person
        Person comparedPerson = (Person) compared;
        
        // Compared fields
        if (this.name.equals(comparedPerson.name) &&
                this.height == comparedPerson.height &&
                this.weight == comparedPerson.weight &&
                this.birthday.equals(comparedPerson.birthday)) {
            return true;
        }
        
        // The not equals
        return false;
    }

}
