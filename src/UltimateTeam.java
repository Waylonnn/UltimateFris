import java.util.ArrayList;

public class UltimateTeam {
    ArrayList<UltimatePlayer> players;
    ArrayList<Coach> coaches;

    UltimateTeam(ArrayList<UltimatePlayer> players, ArrayList<Coach> coaches){
        this.players = players;
        this.coaches = coaches;
    }

    String getCutters(){
        StringBuilder str = new StringBuilder();
        for (UltimatePlayer i: players){
            if(i.getPosition().equals("cutter")){
                str.append(i.toString());
            }
        }
        return str.toString();
    }

    String getHandlers(){
        StringBuilder str = new StringBuilder();
        for (UltimatePlayer i: players){
            if(i.getPosition().equals("handler")){
                str.append(i.toString());
            }
        }
        return str.toString();
    }
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (Coach i : coaches) {
            str.append(i.toString());
        }
        for (UltimatePlayer i : players) {
            str.append(i.toString());
        }
        return str.toString();
    }
}
