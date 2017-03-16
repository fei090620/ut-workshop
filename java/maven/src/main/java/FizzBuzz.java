/**
 * Created by yangzhou on 16/03/2017.
 */
public class FizzBuzz {
    public static String fizzBuzz(int number) {
        if (isFuzzNumber(number) && isBuzzNumber(number)){
            return "FizzBuzz";
        }

        if (isFuzzNumber(number)) {
            return "Fizz";
        }

        if (isBuzzNumber(number)){
            return "Buzz";
        }

        return number + "";
    }

    private static boolean isBuzzNumber(int number) {
        return number % 5 == 0;
    }

    private static boolean isFuzzNumber(int number) {
        return number % 3 == 0;
    }
}
