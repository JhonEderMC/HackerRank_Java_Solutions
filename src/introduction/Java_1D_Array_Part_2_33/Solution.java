package introduction.Java_1D_Array_Part_2_33;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfQuerys = Integer.parseInt(scanner.nextLine());

        while (numberOfQuerys-- > 0) {
            List<Integer> list = getInputListNumbers(scanner);
            int leap = list.get(1);

            List<Integer> game = getInputListNumbers(scanner);
            System.out.println(canWin(game, leap, 0) ? "YES" : "NO");

        }
    }

    private static List<Integer> getInputListNumbers(Scanner scanner) {
        return Stream.of(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(toList());
    }

    private static boolean canWin(List<Integer> game, int leap, int position) {
        //you win by jumping over the last index
        if(position > game.size()-1){ // last index
            return true;
        }
        //you reverse out of bounds or meet a obstacle
        if(position < 0 || game.get(position) == 1){
            return false;
        }
        //Mark the position as explored
        game.set(position, 1);
        return canWin(game, leap, position - 1) ||canWin(game, leap, position + 1) || canWin(game, leap, position + leap);
    }


}
