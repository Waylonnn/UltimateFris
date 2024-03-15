public class Person {
    String firstName;
    String lastName;

    public Person (String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }



    int throwDisc(int pow){
        return pow*2;
    }
    @Override
    public String toString(){
        return lastName + ", " + firstName;
    }
}
