package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

import java.util.stream.IntStream;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        StringBuilder sb = new StringBuilder();
        if (isFizz(number)) {
            sb.append("fizz");
        }
        if ((isFizz(number)) && (isBuzz(number)) ){
            sb.append(" ");
        }
        if (isBuzz(number)) {
            sb.append("buzz");
        }
        if (!(isFizz(number)) && !(isBuzz(number)) ){
            sb.append(number);
        }
        return sb.toString();

    }

    /**
     * can do both fizz and buzz tests here
     * @param number
     * @param digit
     * @return
     */
    private boolean isDivisibleOrContainsDigit(Integer number, Integer digit) {

        if (number % digit == 0) {
            return true;
        }
        else {
            String numAsText = Integer.toString(number);
            if (numAsText.contains(Integer.toString(digit))) {
                return true;
            }
        }
        return false;
    }

    private boolean isFizz(Integer number) {
       return isDivisibleOrContainsDigit(number,3);
    }

    private boolean isBuzz(Integer number) {
        return isDivisibleOrContainsDigit(number,5);
    }


    private boolean isDeluxe(Integer number) {

        if (number < 10) {
            return false;
        }
        else {
            String numAsText = Integer.toString(number);
            if (numAsText.chars().distinct().count() == 1) {
                return true;
            }
        }
        return false;
    }

}
