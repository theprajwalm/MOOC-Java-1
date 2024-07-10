import java.util.ArrayList;

public class Room {
    private ArrayList<Person> persons;

    //constructor
    public Room(){
        this.persons = new ArrayList<>();
    }

    public void add(Person person){
        this.persons.add(person);
    }

    public boolean isEmpty(){
        if (this.persons.isEmpty()) {
            return true;                                 
        }
        return false;
    }

    public ArrayList<Person> getPersons(){
        return this.persons;
    }

    public Person shortest(){

        if (this.persons.isEmpty()) {
            return null;
        }

        int shortestHeight = this.persons.get(0).getHeight();
        Person shortestPerson = this.persons.get(0);
        int index = 0;
        while (index < this.persons.size()) {
            if (shortestHeight > this.persons.get(index).getHeight()) {
                shortestHeight = this.persons.get(index).getHeight();
                shortestPerson = this.persons.get(index);
            }
            index++;
        }
        return shortestPerson;
    }

    public Person take(){
        if (this.persons.isEmpty()) {
            return null;
        }
        
        Person shortestPerson = shortest();
        this.persons.remove(shortestPerson);
        return shortestPerson;
    }
}