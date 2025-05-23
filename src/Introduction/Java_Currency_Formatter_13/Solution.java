package Introduction.Java_Currency_Formatter_13;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/*
Given a double-precision number, , denoting an amount of money, use the NumberFormat class' getCurrencyInstance method to convert  into the US, Indian, Chinese, and French currency formats. Then print the formatted values as follows:

US: formattedPayment
India: formattedPayment
China: formattedPayment
France: formattedPayment
where  is  formatted according to the appropriate Locale's currency.

Note: India does not have a built-in Locale, so you must construct one where the language is en (i.e., English).

Input Format

A single double-precision number denoting .

Constraints

Output Format

On the first line, print US: u where  is  formatted for US currency.
On the second line, print India: i where  is  formatted for Indian currency.
On the third line, print China: c where  is  formatted for Chinese currency.
On the fourth line, print France: f, where  is  formatted for French currency.

Sample Input

12324.134
Sample Output

US: $12,324.13
India: Rs.12,324.13
China: ￥12,324.13
France: 12 324,13 €
Explanation

Each line contains the value of  formatted according to the four countries' respective currencies.
*/

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double payment = scanner.nextDouble();
        scanner.close();

        String paymentUsFormtat = numberFormat(payment, Locale.US);
        String paymentIndiaFormat = paymentUsFormtat.replace("$", "Rs.");
        String paymenChinatFormat = numberFormat(payment, Locale.CHINA);
        paymenChinatFormat = paymenChinatFormat.replace("\u00A5", "\uFFE5");
        String paymentFranceFormat = numberFormat(payment, Locale.FRANCE);
        paymentFranceFormat = paymentFranceFormat.replace('\u202F', ' ');// Replace non-breaking space

        System.out.println("US: " + paymentUsFormtat);
        System.out.println("India: " + paymentIndiaFormat);
        System.out.println("China: " + paymenChinatFormat);
        System.out.println("France: " + paymentFranceFormat);
    }

    private static String numberFormat(double number, Locale locale) {
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
        if (locale == Locale.CHINA) {
            numberFormat = NumberFormat.getCurrencyInstance(new Locale("zh", "CN"));
        }
        return numberFormat.format(number);

    }

}