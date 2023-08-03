package dailyTask;

public class SquareNumber {
    public static boolean isSquare(int number) {
        if (number < 0) {
            return false;
        }
        double sqrt = Math.sqrt(number);
        return sqrt == (int) sqrt;
    }
}

