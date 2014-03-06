public class App {

    private final NumberJudgement numberJudgement;
    private int maxGuess;

    public App(int maxGuess) {
        String resultNumber = new NumberGenerator().generate();
        numberJudgement = new NumberJudgement(resultNumber);
        this.maxGuess = maxGuess;
    }

    public String guess(String guessNumber) {
        String result = numberJudgement.judgeResult(guessNumber);
        maxGuess--;
        return maxGuess == 0 ? "failure" : result;
    }
}
