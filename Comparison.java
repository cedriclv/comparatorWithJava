import java.util.ArrayList;
import java.util.Collections;


public class Comparison {
    public static void main(String[] args) {
        //create player in a list

        ArrayList<Player> players = new ArrayList<>();
        players.add(new Player("Djoko", 198));
        players.add(new Player("Kirgios", 220));
        players.add(new Player("Fils", 212));
        players.add(new Player("Zverev", 225));
        players.add(new Player("Nadal", 204));

        Collections.sort(players, new SpeedComparator());
        System.out.println("List sorted by serve speed :");
        for (Player player : players) {
            System.out.println(player.getName() + " serve at " + player.getSpeed());
        }

        Collections.sort(players, new NameComparator());
        System.out.println("List sorted by name :");
        for (Player player : players) {
            System.out.println(player.getName() + " serve at " + player.getSpeed());
        }

    }
}