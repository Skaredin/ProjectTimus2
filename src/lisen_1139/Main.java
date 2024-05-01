package lisen_1139;
import java.util.Scanner;
//https://acm.timus.ru/problem.aspx?space=1&num=1139
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int gcd = gcd(N, M);


        int quarters = gcd - 1;
        System.out.println(quarters);

        scanner.close();
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}