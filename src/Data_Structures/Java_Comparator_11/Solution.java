package Data_Structures.Java_Comparator_11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);

        int n = scanner.nextInt();
        List<Player> players = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            players.add(new Player(scanner.next(), scanner.nextInt()));
        }
        scanner.close();

        Comparator<Player>  playerComparator = (p1, p2) -> {
            if(p1.getScore() != p2.getScore()) {
                return p2.getScore() - p1.getScore(); // Descending order
            } else {
                return p1.getName().compareTo(p2.getName()); //Ascending  order
            }
        };
        players.sort(playerComparator);
        players.forEach(player -> System.out.println(player.getName() + " " + player.getScore()));

    }

    public static class Player {
        private String name;
        private int score;

        Player(String name, int score) {
            this.name = name;
            this.score = score;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }
    }


}
