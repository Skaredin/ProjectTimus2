package lisen_1558;
import java.util.Scanner;
//https://acm.timus.ru/problem.aspx?space=1&num=1558
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num1 = scanner.nextLine();
        String num2 = scanner.nextLine();
        int periodLength = num1.indexOf(')') - num1.indexOf('(') - 1;
        num1 = num1.substring(num1.indexOf('(') + 1, num1.indexOf(')'));
        num2 = num2.substring(num2.indexOf('(') + 1, num2.indexOf(')'));


        while (num1.length() < periodLength) {
            num1 += num1;
        }
        while (num2.length() < periodLength) {
            num2 += num2;
        }


        String sum = sumPeriodicNumbers(num1, num2);
        System.out.println("(" + sum.substring(0, periodLength) + ")" + sum.substring(periodLength));
        scanner.close();
    }
    private static String sumPeriodicNumbers(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        for (int i = num1.length() - 1; i >= 0; i--) {
            int digit1 = num1.charAt(i) - '0';
            int digit2 = num2.charAt(i) - '0';
            int sum = digit1 + digit2 + carry;
            result.insert(0, sum % 10);
            carry = sum / 10;
        }
        if (carry > 0) {
            result.insert(0, carry);
        }
        return result.toString();
    }
}