public class Numtwo {
    public static void number1 () {
        int i = 1;
        while (i <= 512) {
            System.out.print(i + " ");
            i = i * 2;
        }
        System.out.println("Это был вывод заданной последовательности, метод 1");
    }
    public static void number2 (){
        int ii = 1;
        do {
            System.out.print(ii+" ");
            ii = ii * 2;
        }
        while (ii <= 512);
        System.out.println("Это был вывод заданной последовательности, метод 2");

    }
}
