import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.fest.assertions.api.Assertions.assertThat;

public class NumberGeneratorTest {
    @Test
    public void should_generate_number() {
        NumberGenerator numberGenerator = new NumberGenerator();
        assertThat(numberGenerator.generate()).matches("^[0-9]+$");
    }

    @Test
    public void should_generate_4_number() {
        NumberGenerator numberGenerator = new NumberGenerator();
        assertThat(numberGenerator.generate()).hasSize(4);
    }

    @Test
    public void should_generate_number_with_no_repeat_content() {
        NumberGenerator numberGenerator = new NumberGenerator();
        assertThat(numberGenerator.generate()).matches("^(?:([0-9])(?!.*\\1))+$");
    }

    @Test
    public void should_generate_no_repeat_number_at_least_5_times() {
        //5 is just for practice, this number comes from the requirement for real
        //scope over closure
        //cost and known
        NumberGenerator numberGenerator = new NumberGenerator();
        List numbers = new ArrayList();
        for (int i = 0; i < 5; i++) {
            numbers.add(numberGenerator.generate());
        }
        assertThat(numbers).doesNotHaveDuplicates();
    }
}
