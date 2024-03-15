public class Coach extends Person{
    String role;
    public Coach(String firstName, String lastName, String role){
        super(firstName, lastName);
        this.role = role;
    }
    @Override
    public String toString(){
        return (super.toString() + "\n   Role: " + role);
    }
}
