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
    public void compute_fiz4() {
        assertThat(fiz.fizzBuzz(4), equalTo("4"));
    }
    @Test
    public void compute_fiz5() {
        assertThat(fiz.fizzBuzz(5), equalTo("buzz"));
    }
    @Test
    public void compute_fiz11() {
        assertThat(fiz.fizzBuzz(11), equalTo("fake deluxe"));
    }

    @Test
    public void compute_fiz13() {
        assertThat(fiz.fizzBuzz(13), equalTo("fizz"));
    }
    @Test
    public void compute_fiz15() {
        assertThat(fiz.fizzBuzz(15), equalTo("fizz buzz"));
    }

    @Test
    public void compute_fiz55() {
        assertThat(fiz.fizzBuzz(55), equalTo("buzz fake deluxe"));
    }

    @Test
    public void compute_fiz111() {
        assertThat(fiz.fizzBuzz(111), equalTo("fizz fake deluxe"));
    }

    @Test
    public void compute_fiz555() {
        assertThat(fiz.fizzBuzz(555), equalTo("fizz buzz fake deluxe"));
    }

    @Test
    public void compute_fiz666() {
        assertThat(fiz.fizzBuzz(666), equalTo("fizz deluxe"));
    }
}
