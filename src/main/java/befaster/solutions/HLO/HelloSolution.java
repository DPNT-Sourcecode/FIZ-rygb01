package befaster.solutions.HLO;

import befaster.runner.SolutionNotImplementedException;

import java.text.MessageFormat;
import java.util.Optional;

public class HelloSolution {
    public String hello(String friendName) {
        String name = Optional.ofNullable(friendName).orElse("World");
        return MessageFormat.format("Hello, {0}!", name);
    }
}
