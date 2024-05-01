package lisen_1769;
import java.util.Scanner;
//https://acm.timus.ru/problem.aspx?space=1&num=1769
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int smallestNumber = findSmallestNumber(s);

        System.out.println(smallestNumber);
    }


    private static int findSmallestNumber(String s) {
        for (int i = 1; i <= 9; i++) {
            String candidate = Integer.toString(i);
            if (!s.contains(candidate)) {
                return i;
            }
        }
        for (int len = 2; len <= s.length() + 1; len++) {
            for (int num = 1; num <= 9; num++) {
                String candidate = Integer.toString(num);
                boolean valid = true;
                for (int i = 0; i < len - 1; i++) {
                    candidate += candidate.charAt(i % candidate.length());
                }
                if (!s.contains(candidate)) {
                    return Integer.parseInt(candidate);
                }
            }
        }
        return -1;
    }
}
