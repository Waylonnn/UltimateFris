public class UltimatePlayer extends Person{
    int jerseyNumber;
    static int jerseyNumberCounter;
    String position;
    UltimatePlayer(String firstName, String lastName, String position){
        super(firstName, lastName);
        this.position = position;
        jerseyNumber = jerseyNumberCounter;
        jerseyNumberCounter++;
    }

    String getPosition(){
        return position;
    }

    int throwDisc(int pow){
        return pow*4;
    }
    @Override
    public String toString(){
        return (super.toString() + "\n   Jersey #: " + jerseyNumber + "\n   Position: " + position);
    }
}
