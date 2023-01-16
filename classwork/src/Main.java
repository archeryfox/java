import java.util.Scanner;

public class Main extends Prints {
    /**
      Выключатель
     */
    private static boolean ON = true;
    /**
     * Выбор действия
     */
    public static int Choice = 0;

    /**
     * Точка входа
     */
    public static void main(String[] args) {
        int a = 0, b = 0;
        var sc = new Scanner(System.in);
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
            if (Choice == 6){
                println("бб юзер 👋");
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
                    System.out.println("a + b = ");
                    println(Summing(a, b));
                    break;
                case 2:
                    println("a - b = ");
                    print(Substracting(a, b));
                    break;
                case 3:
                    println("a × b = "+Multiplying(a, b));
                    break;
                case 4:
                    System.out.printf("\na ÷ b = %s\n", Dividing(a,b));
                    break;
                case 5:
                    println("a^b ="+ Math.pow(a, b));
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
