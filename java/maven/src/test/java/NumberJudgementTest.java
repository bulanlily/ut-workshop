import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class NumberJudgementTest {
    @Test
    public void should_judge_input_match_number() {
        NumberJudgement numberJudgement = new NumberJudgement("1234");

        assertThat(numberJudgement.judgeA("1253")).isEqualTo(2);
    }

    @Test
    public void should_judge_input_match_position() {
        NumberJudgement numberJudgement = new NumberJudgement("1234");

        assertThat(numberJudgement.judgeB("1253")).isEqualTo(1);
    }

    @Test
    public void should_judge_input_match_number_and_position() {
        NumberJudgement numberJudgement = new NumberJudgement("1234");

        assertThat(numberJudgement.judgeResult("1234")).isEqualTo("4A0B");
        assertThat(numberJudgement.judgeResult("5678")).isEqualTo("0A0B");
        assertThat(numberJudgement.judgeResult("1253")).isEqualTo("2A1B");
    }

}
