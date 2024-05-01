package lisen_1907;
import java.util.Scanner;
//https://acm.timus.ru/problem.aspx?space=1&num=1907
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long n = scanner.nextLong();
        long nSquare = n * n;
        int count = -1;
        for (long i = 1; i * i <= nSquare; i++) {

            if (nSquare % i == 0) {
                long size = nSquare / i;
                if (size % 2 == 0 && size >= a) {
                    count++;
                }
                if (i != nSquare / i) {
                    size = i;
                    if (size % 2 == 0 && size >= a) {
                        count++;
                    }
                }
            }
        }


        System.out.println(count);
    }
}