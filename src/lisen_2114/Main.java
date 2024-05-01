package lisen_2114;
import java.util.*;
//https://acm.timus.ru/problem.aspx?space=1&num=2114
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] garden = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                garden[i][j] = scanner.nextInt();
            }
        }

        int q = scanner.nextInt();
        int[] windStrengths = new int[q];
        for (int i = 0; i < q; i++) {
            windStrengths[i] = scanner.nextInt();
        }


        for (int windStrength : windStrengths) {
            int maxWheat = 0;
            int wx = 0, wy = 0;


            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    int wheatSum = 0;

                    for (int x = i; x < n; x++) {
                        for (int y = j; y < m; y++) {
                            if (x + y <= i + j + windStrength) {
                                wheatSum += garden[x][y];
                            }
                        }
                    }

                    if (wheatSum > maxWheat) {
                        maxWheat = wheatSum;
                        wx = i + 1;
                        wy = j + 1;
                    }
                }
            }
            System.out.println(maxWheat + " " + wx + " " + wy);
        }
    }
}