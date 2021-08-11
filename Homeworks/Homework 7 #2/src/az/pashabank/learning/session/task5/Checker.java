package az.pashabank.learning.session.task5;

import java.util.Comparator;

public class Checker implements Comparator<Player> {

    @Override
    public int compare(Player player1, Player player2) {
        int nameCompare = player1.name.compareTo(player2.name);
        int scoreCompare = player2.score - player1.score;

        return scoreCompare == 0 ? nameCompare : scoreCompare;
    }
}
