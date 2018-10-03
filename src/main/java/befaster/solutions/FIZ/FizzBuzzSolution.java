package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        StringBuilder sb = new StringBuilder();
        if (number % 3 == 0) {
            sb.append("fizz");
        }
        if (number % 15 == 0) {
            sb.append(" ");
        }

        if (number % 5 == 0) {
            sb.append("buzz");
        }
        return sb.toString();

    }

}
