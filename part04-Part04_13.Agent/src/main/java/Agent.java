

public class Agent {

    private String firstName;
    private String lastName;
    
    public Agent(String initFirstName, String initLastName) {
        this.firstName = initFirstName;
        this.lastName = initLastName;
    }
    
    public String toString(){
        String toprint = "My name is " +  lastName + ", " + firstName + " " + lastName;
        return toprint;
    }
    
}
