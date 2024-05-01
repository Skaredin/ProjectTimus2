package lisen_1800;
import java.util.Scanner;
//https://acm.timus.ru/problem.aspx?space=1&num=1800
public class MAin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int l = scanner.nextInt();
        int h = scanner.nextInt();
        int omega = scanner.nextInt();
        double g = 9.81;
        double omega_rad_per_sec = Math.toRadians(omega) / 60.0;
        double height = (Math.pow(omega_rad_per_sec, 2) * Math.pow(l / 200.0, 2)) / (2 * g) + h;
        String result = (height > l / 200.0) ? "butter" : "bread";
        System.out.println(result);

        scanner.close();
    }
}