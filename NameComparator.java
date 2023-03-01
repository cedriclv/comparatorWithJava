import java.util.Comparator;

public class NameComparator implements Comparator<Player> {

    public int compare(Player player1, Player player2) {
        return (player1.getName().compareTo(player2.getName()));
    }

}
