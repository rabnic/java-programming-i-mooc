
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nicholas
 */
public class Room {
    
    private ArrayList<Person> persons;
    
    public Room() {
        this.persons = new ArrayList();
    }
    
    public void add(Person person) {
        this.persons.add(person);
    }
    
    public boolean isEmpty() {
        return this.persons.isEmpty();
    }
    
    public ArrayList<Person> getPersons() {
        return this.persons;
    }
    
    public Person shortest() {
        if(this.persons.isEmpty()) {
            return null;
        }
        
        Person shorty = this.persons.get(0);
        for (Person person: this.persons) {
            if (person.getHeight() < shorty.getHeight()) {
                shorty = person;
            }
        }
        
        return shorty;
    }
    
    public Person take() {
        if(this.persons.isEmpty()) {
            return null;
        }
        
        Person taken = this.shortest();
        this.persons.remove(taken);
        
        return taken;
    }
    
}
