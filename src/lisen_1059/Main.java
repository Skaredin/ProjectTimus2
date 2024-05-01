package lisen_1059;
import java.util.*;
//https://acm.timus.ru/problem.aspx?space=1&num=1059
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        List<String> operations = new ArrayList<>();

        for (int i = N; i >= 0; i--) {
            operations.add(Integer.toString(i));
            operations.add("X");
            if (i != 0) {
                operations.add("*");
            }

        }

        for (int i = 0; i < N; i++) {
            operations.add("+");
        }

        for (String operation : operations) {
            System.out.println(operation);
        }
        scanner.close();
    }
}