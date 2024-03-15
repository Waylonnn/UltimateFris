public class Coach extends Person{
    String role;
    public Coach(String firstName, String lastName, String role){
        super.firstName = firstName;
        super.lastName = lastName;
        this.role = role;
    }

    String toString(){
        return super.toString() + "\n   Role: " + role;
    }
}
