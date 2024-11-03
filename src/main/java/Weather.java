import java.util.Scanner;

public class Weather {
    public static void weathertoday() {
        System.out.println("Введите c клавиатуры текущую температуру целым числом");
        Scanner inputInt = new Scanner(System.in);
        int t = inputInt.nextInt();
        if (t < 0) {
            System.out.println("Сейчас очень холоднo!");
        } else if (t > 16) {
            System.out.println("Отличный летний денек!");
        } else {
            System.out.println("Сейчас прохладно!");
        }
    }
}