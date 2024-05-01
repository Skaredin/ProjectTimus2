package lisen_1413;
import java.util.Scanner;
//https://acm.timus.ru/problem.aspx?space=1&num=1413
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = 0;
        double y = 0;

        String moves = scanner.nextLine();
        for (int i = 0; i < moves.length(); i++) {
            char move = moves.charAt(i);
            switch (move) {
                case '0':
                    System.out.println(x + " " + y);
                    return;
                case '2':// Прыжок на юг
                    y--;
                    break;
                case '4':// Прыжок на запад
                    x--;
                    break;
                case '6':// Прыжок на восток
                    x++;
                    break;
                case '8':// Прыжок на север
                    y++;
                    break;
                case '1':// Прыжок на юго-запад
                    x--;
                    y--;
                    break;
                case '3':// Прыжок на юго-восток
                    x++;
                    y--;
                    break;
                case '7':// Прыжок на северо-запад
                    x--;
                    y++;
                    break;
                case '9':// Прыжок на северо-восток
                    x++;
                    y++;
                    break;
            }
        }
        System.out.println(x + " " + y);
        scanner.close();
    }
}