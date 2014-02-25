import org.junit.BeforeClass;
import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class JudgeNumberIntegrationTest {

    public static final String randomNumber = "1234";
    private static NumberGenerator numberGenerator;

    @BeforeClass
    public static void mock_number_generator() {
        numberGenerator = mock(NumberGenerator.class);
        when(numberGenerator.generate()).thenReturn(randomNumber);
    }

    @Test
    public void should_generate_random_number_1234_and_judge_it() {
        NumberJudgement numberJudgement = new NumberJudgement(numberGenerator.generate());
        assertThat(numberJudgement.judgeResult("1234")).isEqualTo("4A0B");
    }

    @Test
    public void should_generate_random_number_5678_and_judge_it() {
        NumberJudgement numberJudgement = new NumberJudgement(numberGenerator.generate());
        assertThat(numberJudgement.judgeResult("5678")).isEqualTo("0A0B");

    }

    @Test
    public void should_generate_random_number_1253_and_judge_it() {
        NumberJudgement numberJudgement = new NumberJudgement(numberGenerator.generate());
        assertThat(numberJudgement.judgeResult("1253")).isEqualTo("2A1B");
    }

}
