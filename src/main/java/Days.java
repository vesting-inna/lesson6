
public class Days {
    enum Inputday {Monday, Tuesday, Wednessday, Thurday, Friday, Saturday, Sunday}

    public static void weekdays() {
        Inputday inputday = Inputday.Sunday;

        switch (inputday) {
            case Monday:
                System.out.println("Сейчас будний день");
                break;
            case Tuesday:
                System.out.println("Сейчас будний день");
                break;
            case Wednessday:
                System.out.println("Сейчас будний день");
                break;
            case Thurday:
                System.out.println("Сейчас будний день");
                break;
            case Friday:
                System.out.println("Сейчас будний день");
                break;
            case Saturday:
                System.out.println("Сейчас выходной день");
                break;
            case Sunday:
                System.out.println("Сейчас выходной день");
                break;
            default:
                System.out.println("Сейчас другой день");
                break;
        }
    }
}