package befaster.solutions.FIZ;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class FizzBuzzSolutionTest {
    private FizzBuzzSolution fiz;

    @Before
    public void setUp() {

        fiz = new FizzBuzzSolution();
    }

    @Test
    public void compute_fiz() {
        assertThat(fiz.fizzBuzz(1), equalTo("1"));
    }

    @Test
    public void compute_fiz3() {
        assertThat(fiz.fizzBuzz(3), equalTo("fizz"));
    }

    @Test
    public void compute_fiz5() {
        assertThat(fiz.fizzBuzz(5), equalTo("buzz"));
    }

    @Test
    public void compute_fiz15() {
        assertThat(fiz.fizzBuzz(15), equalTo("fizz buzz"));
    }
}
