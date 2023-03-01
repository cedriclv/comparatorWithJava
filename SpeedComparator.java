import java.util.Comparator;

public class SpeedComparator implements Comparator<Player> {
    
    public int compare(Player player1, Player player2){
        if (player1.getSpeed() > player2.getSpeed()){
            return 1;
        } else if (player1.getSpeed() < player2.getSpeed()) {
            return -1;
        } else {
            return 0;
        }        
    }
}
