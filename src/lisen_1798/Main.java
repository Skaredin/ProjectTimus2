package lisen_1798;
import java.util.Scanner;
//https://acm.timus.ru/problem.aspx?space=1&num=1798
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long R = scanner.nextLong();

        long innerPlates = (long) Math.floor(Math.PI * R * R);
        long outerPlates = (4 * countPlatesInQuarter(R))+2;
        long totalPlates = innerPlates + outerPlates;

        System.out.println(totalPlates);
    }


    private static long countPlatesInQuarter(long R) {
        long count = 0;
        for (long x = R + 1; x * x <= 2 * R * R; x++) {
            long y = (long) Math.sqrt(2 * R * R - x * x);
            count += y;
        }
        return count;
    }
}