package lisen_1798;
import java.util.Scanner;
//https://acm.timus.ru/problem.aspx?space=1&num=1798
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод радиуса огненного круга
        long R = scanner.nextLong();

        // Вычисление количества плит внутри круга
        long innerPlates = (long) Math.floor(Math.PI * R * R);

        // Вычисление количества плит на расстоянии от R до sqrt(2)*R
        long outerPlates = (4 * countPlatesInQuarter(R))+2;

        // Вычисление общего количества испорченных плит
        long totalPlates = innerPlates + outerPlates;

        // Вывод результата
        System.out.println(totalPlates);
    }

    // Метод для подсчёта количества плит в одной четверти круга
    private static long countPlatesInQuarter(long R) {
        long count = 0;
        for (long x = R + 1; x * x <= 2 * R * R; x++) {
            long y = (long) Math.sqrt(2 * R * R - x * x);
            count += y;
        }
        return count;
    }
}