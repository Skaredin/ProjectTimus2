package lisen_1917;
import java.util.*;
//https://acm.timus.ru/problem.aspx?space=1&num=1917
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int p = scanner.nextInt();

        int[] thresholds = new int[n];
        for (int i = 0; i < n; i++) {
            thresholds[i] = scanner.nextInt();
        }
        Arrays.sort(thresholds);
        int destroyed = 0;
        int spellCount = 0;
        for (int i = 0; i < n; i++) {
            if (destroyed * thresholds[i] <= p) {
                destroyed++;
            } else {
                break;
            }
        }
        spellCount = (int) Math.ceil((double) n / destroyed);
        System.out.println(destroyed + " " + spellCount);
    }
}
