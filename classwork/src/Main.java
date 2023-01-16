import java.util.Scanner;
import java.lang.System;

public class Main extends Prints {
    /**
     * Calculator looper
     */
    private static boolean ON = true;
    /**
     * Choice of act in meashings
     */
    public static int Choice = 0;

    public static void main(String[] args) {
        int a = 0, b = 0;
        println("Press any button to start calculating!");
        var sc = new Scanner(System.in);
        while (ON) {
            println("""
                    Выберите действие:\s
                     1. +
                     2. -
                     3. ×
                     4. ÷
                     5. a^b
                     6 - Выход
                    \s""");
            Choice = sc.nextInt();
            if (Choice == 6){
                ON = !ON;
                return;
                //вот это реально гениальный выход из любой ситуации........
            }
            print("a = ");
            a = sc.nextInt();
            System.out.print("b = ");
            b = sc.nextInt();
            switch (Choice) {
                case 1:
                    println(Summing(a, b));
                    break;
                case 2:
                    println(Substracting(a, b));
                    break;
                case 3:
                    println(Multiplying(a, b));
                    break;
                case 4:
                    System.out.printf("\n%s\n", Dividing(a,b));
                    break;
                case 5:
                    println(Math.pow(a, b));
                    break;
            }
        }
    }

    /**
     * @param a Слагаемое 1
     * @param b Слагаемое 2
     * @return Сумму
     */
    public static double Summing(double a, double b) {
        return a + b;
    }

    /**
     * @param a Уменьшаемое
     * @param b Вычитаемое
     * @return Разность
     */
    static double Substracting(double a, double b) {
        return a - b;
    }

    /**
     * @param a Делимое
     * @param b Делитель
     * @return Частное
     */
    private static double Dividing(double a, double b) {
        return a / b;
    }

    /**
     * Умножение
     *
     * @param a Множитель 1
     * @param b Множитель 2
     * @return Произведение
     */
    static double Multiplying(double a, double b) {
        return a * b;
    }
}
