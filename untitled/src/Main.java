import java.util.Random;
import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    static private Random r = new Random();
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {

        int task = 3;
        while (task != 0) {
            System.out.print("Введите № задачи(1/2). 0 для выхода: ");

            task = scanner.nextInt();
            if (task == 1) {
                Array9();
            } else if (task == 2) {
                Matrix20();
            }
            if (task == 0) {
                System.out.println(Colors.BLUE + "пока" + ANSI_RESET);
            }
        }
    }

    /**
     * Array9. Дан целочисленный массив размера N. Вывести все содержащиеся в
     * данном массиве четные числа в порядке убывания их индексов, а также
     * их количество K.
     */
    private static void Array9() {
        System.out.print("Размер массива: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        System.out.println("Массив: ");
        for (int i = 0; i < n; i++) {
            a[i] = r.nextInt(0,10);
            if (i!=n-1)  System.out.print(a[i]+", ");
            else System.out.println(a[i]);
        }
        int k = 0;
        System.out.println("Чётные: ");
        for (int i = n - 1; i > -1; i--) {
            if (a[i] % 2 == 0 && a[i]!=0) {
                k++;
                 System.out.println(a[i]);
            }
        }
        System.out.println("Количество чётных чисел в массиве - " + k);
    }

    /**
     * Matrix20. Дана матрица размера M × N.
     * Для каждого столбца матрицы найти
     * произведение его элементов.
     */
    private static void Matrix20() {
        System.out.print("Введите количество этажей массива: ");
        int m = scanner.nextInt();
        System.out.print("Введите количество квартир на этаже массива: ");
        int n = scanner.nextInt();
        int[][] mtrx = new int[m][n];
        System.out.println("Изначальный массив:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mtrx[i][j] = r.nextInt(1, 10);
                if (i != m - 1 || j != n - 2)
                    System.out.print(Colors.BLACK + Colors.GREEN_BACKGROUND + mtrx[i][j] + ", ");
                else System.out.print(mtrx[i][j] + " ");
            }
            System.out.println(Colors.RESET);
        }
        System.out.println("\nПроизведение столбцов: ");
        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) mtrx[i][j] = mtrx[i][j] * mtrx[i - 1][j];
            System.out.print(ANSI_RESET);
        }
        for (int i = m - 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(Colors.WHITE_BOLD_BRIGHT + Colors.BLUE_BACKGROUND + mtrx[i][j] + " ");
            }
        }
        System.out.println(ANSI_RESET);
    }
}