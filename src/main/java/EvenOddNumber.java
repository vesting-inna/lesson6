import java.util.Scanner;

public class EvenOddNumber {

    public static void evenodd() {
        System.out.println("Введите c клавиатуры  целое число, чтобы узнать четное оно или нечетное");
        Scanner inputInt = new Scanner(System.in);
        int t = inputInt.nextInt();
        String result = t % 2 == 0 ? "Вы ввели четное число" : "Вы ввели нечетное число";
        System.out.println(result);
    }
}
