import java.util.Scanner;

public class Main extends Prints {

    /**
     * Выключатель
     */
    private static boolean ON = true;

    /**
     * Выбор действия
     */
    public static int Choice = 0;

    /**
     * Ввод с клавиатуры
     */
    static Scanner sc = new Scanner(System.in);

    /**
     * Точка входа
     */
    public static void main(String[] args) {
        double a = 0, b = 0;
        while (ON) {
            println("""
                    Выберите действие:\s
                     1. +
                     2. -
                     3. ×
                     4. ÷
                     5. a^b
                     6 - Выход""");
            print("я выбираю действие....");

            Choice = sc.nextInt();
            if (Choice == 6) {
                println("бб юзер 👋");
                ON = !ON;
                return;
                //вот это реально гениальный выход из любой ситуации........
            }
            print("a = ");
            a = sc.nextDouble();

            System.out.print("b = ");
            b = sc.nextDouble();

            switch (Choice) {
                case 1:
                    System.out.println("a + b = ");
                    if (Summing(a, b) - Math.round(Summing(a, b)) == 0) {
                        println((int) Summing(a, b));
                    } else {
                        println(Summing(a, b));
                    }
                    break;
                case 2:
                    println("a - b = ");
                    if (Substracting(a, b) - Math.round(Substracting(a, b)) == 0) {
                        println((int) Substracting(a, b));
                    } else {
                        println(Substracting(a, b));
                    }
                    break;
                case 3:
                    if (Multiplying(a, b) - Math.round(Multiplying(a, b)) == 0) {
                        println("a × b = " + (int) Multiplying(a, b));
                    } else {
                        println("a × b = " + Multiplying(a, b));
                    }
                    break;
                case 4:
                    if (Dividing(a, b) - Math.round(Dividing(a, b)) == 0) {
                        println((int) Dividing(a, b));
                    } else {
                        System.out.printf("\na ÷ b = %s\n", Dividing(a, b));
                    }
                    break;
                case 5:
                    if (Math.pow(a, b) - Math.round(Math.pow(a, b)) == 0) {
                        println((int) Math.pow(a, b));
                    } else {
                        println("a^b =" + Math.pow(a, b));
                    }
                    break;
            }
        }
    }

    /**
     * Сложение
     * @param a Слагаемое 1
     * @param b Слагаемое 2
     * @return Сумму
     */
    public static double Summing(double a, double b) {
        return a + b;
    }

    /**
     * Вычитание
     * @param a Уменьшаемое
     * @param b Вычитаемое
     * @return Разность
     */
    static double Substracting(double a, double b) {
        return a - b;
    }

    /**
     * Деление
     * @param a Делимое
     * @param b Делитель
     * @return Частное
     */
    private static double Dividing(double a, double b) {
        return a / b;
    }

    /**
     * Умножение
     * @param a Множитель 1
     * @param b Множитель 2
     * @return Произведение
     */
    static double Multiplying(double a, double b) {
        return a * b;
    }

}
