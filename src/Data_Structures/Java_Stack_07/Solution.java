package Data_Structures.Java_Stack_07;

import java.util.Scanner;
import java.util.Stack;

public class Solution {

    private static final char KEY_OPENS_BRACKET = '{';
    private static final char KEY_CLOSES_BRACKET = '}';
    private static final char PARENTHESIS_OPENS_BRACKET = '(';
    private static final char PARENTHESIS_CLOSES_BRACKET = ')';
    private static final char SQUARE_PARENTHESIS_OPENS_BRACKET = '[';
    private static final char SQUARE_PARENTHESIS_CLOSES_BRACKET = ']';

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()){
            Stack<Character> stack = new Stack<>();
            String input = scanner.nextLine();
            System.out.println(isValid(input, stack));
        }
        scanner.close();
    }

    private static boolean isValid(String input, Stack<Character> stack) {
        for(char chr : input.toCharArray()) {
            if(isOpenBracket(chr)) {
                stack.push(chr);
                continue;
            }
            if(chr == KEY_CLOSES_BRACKET  && !stack.isEmpty() && stack.peek() == KEY_OPENS_BRACKET) {
                stack.pop();
                continue;
            }
            if(chr == PARENTHESIS_CLOSES_BRACKET && !stack.isEmpty() && stack.peek() == PARENTHESIS_OPENS_BRACKET) {
                stack.pop();
                continue;
            }
            if (chr == SQUARE_PARENTHESIS_CLOSES_BRACKET &&!stack.isEmpty() && stack.peek() == SQUARE_PARENTHESIS_OPENS_BRACKET) {
                stack.pop();
                continue;
            }
            if (isCloseBracket(chr)) {
                stack.push(chr);
                break;
            }
        }
        return stack.isEmpty();
    }

    private static boolean isOpenBracket(char chr) {
        return switch (chr) {
            case KEY_OPENS_BRACKET, PARENTHESIS_OPENS_BRACKET, SQUARE_PARENTHESIS_OPENS_BRACKET -> true;
            default -> false;
        };
    }

    private static boolean isCloseBracket(char chr) {
        return switch (chr) {
            case KEY_CLOSES_BRACKET, PARENTHESIS_CLOSES_BRACKET, SQUARE_PARENTHESIS_CLOSES_BRACKET -> true;
            default -> false;
        };
    }
}
