package introduction.Tag_Content_Extractor_24;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        String regex = "<([^>]+)>([^<>]+)</\\1>";
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Pattern pattern = Pattern.compile(regex);

        while(n-- >0) {
            String text = scanner.nextLine();
            Matcher m = pattern.matcher(text);

            boolean notFindMatch = true;

            while(m.find()) {
                System.out.println(m.group(2));
                notFindMatch = false;
            }
            if(notFindMatch) {
                System.out.println("None");
            }
        }
        scanner.close();
    }
}
