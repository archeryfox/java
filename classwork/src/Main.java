import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("""
                1 - For 9
                2 - While 20
                """);
        switch (s.nextInt()) {
            case 1:
                For9();
                break;
            case 2:
                While20();
                break;
        }
    }

    static Scanner s = new Scanner(System.in);

    /**
     * For 9
     * <p>
     * Даны два целых числа A и B (A < B). Найти сумму квадратов всех целых
     * чисел от A до B включительно.
     */
    private static void For9() {
        System.out.print("Введите начало диапазона: ");
        int a = s.nextInt();
        System.out.print("Введите конец диапазона: ");
        int b = s.nextInt();
        if (b <= a) For9();
        for (int i = a; i < b; i++) {
            System.out.print("Квадрат " + i + "=" + (i * i) + "\n");
        }
    }

    /**
     * While 20
     * <p>
     * Дано целое число N (> 0). С помощью операций деления нацело
     * и взятия остатка от деления определить, имеется ли в записи числа N
     * цифра «2». Если имеется, то вывести TRUE, если нет — вывести FALSE.
     */
    private static void While20() {
        int n = s.nextInt();
        String[] l = (n + "").split("");
        int i = 0;
        System.out.println();
        while (i != l.length) {
            if (l[i].equals("2")) {
                System.out.println("TRUE");
                break;
            } else if (i == l.length-1) {
                System.out.println("FALSE");
            }
            i++;
        }
    }
}
