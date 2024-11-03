import java.util.Scanner;

public class Factorial {
    public static void factorialn() {
        System.out.println("Введите c клавиатуры целoe число, чтобы узнать его факториал");
        Scanner inputInt = new Scanner(System.in);
        int res = inputInt.nextInt();
        int y = 1;
        for (int i = 1; i < res; i++) {
            y = y * (i + 1);
        }
        System.out.println("Факториал числа " + res + " = " + y);
    }
}
