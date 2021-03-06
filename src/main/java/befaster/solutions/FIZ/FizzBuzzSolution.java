package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        List<String> resultText = new ArrayList<String>();
        if (isFizz(number)) {
            resultText.add("fizz");
        }
        if (isBuzz(number)) {
            resultText.add("buzz");
        }
        if (isDeluxe(number)) {
            if (isFake(number)) {
                resultText.add("fake");
            }
            resultText.add("deluxe");
        }
        if (!(isFizz(number)) && !(isBuzz(number)) && !(isDeluxe(number))) {
            String numAsText = Integer.toString(number);
            resultText.add(new String(numAsText));
        }
        return String.join(" ", resultText);

    }

    /**
     * can do both fizz and buzz tests here
     *
     * @param number
     * @param digit
     * @return
     */
    private boolean isDivisibleOrContainsDigit(Integer number, Integer digit) {
        if (isDivisible(number, digit) || isDigitPresent(number, digit)) return true;
        return false;
    }

    private boolean isDivisibleAndContainsDigit(Integer number, Integer digit) {
        if (isDivisible(number, digit) && isDigitPresent(number, digit)) return true;
        return false;
    }

    private boolean isDivisible(Integer number, Integer digit) {
        if (number % digit == 0) {
            return true;
        }
        return false;
    }

    private boolean isDigitPresent(Integer number, Integer digit) {
        String numAsText = Integer.toString(number);
        if (numAsText.contains(Integer.toString(digit))) {
            return true;
        }
        return false;
    }

    private boolean isFizz(Integer number) {
        return isDivisibleOrContainsDigit(number, 3);
    }

    private boolean isBuzz(Integer number) {
        return isDivisibleOrContainsDigit(number, 5);
    }

    private boolean isFake(Integer number) {
        return (number % 2) != 0;
    }

    private boolean isDeluxe(Integer number) {
        if (isDivisibleAndContainsDigit(number, 3) || isDivisibleAndContainsDigit(number, 5)) {
            return true;
        }
        return false;
    }

}
