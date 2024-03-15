public class Captain extends UltimatePlayer{
    boolean type;

    Captain(String firstName, String lastName, String position, boolean type){
        super(firstName, lastName, position);
        this.type = type;
    }
    @Override
    int throwDisc(int pow){
        return pow*5;
    }
    @Override
    public String toString(){
        return super.toString() + "\n    Captain: " + type;
    }
}
