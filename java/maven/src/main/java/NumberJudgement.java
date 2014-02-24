public class NumberJudgement {

    private final String initNumber;

    public NumberJudgement(String initNumber) {
        this.initNumber = initNumber;
    }

    public int judgeA(String input) {
        String[] inputCharacters = getSplit(input);
        String[] initNumCharacters = getSplit(initNumber);
        int result = 0;
        for (int index = 0; index < initNumber.length(); index ++) {
            if (initNumCharacters[index].equals(inputCharacters[index])) {
                result ++;
            }
        }
        return result;
    }

    public int judgeB(String input) {
        return judgeExist(input) - judgeA(input);
    }

    private int judgeExist(String input) {
        int result = 0;
        for (String s : getSplit(input)) {
            if (initNumber.contains(s)) {
                result ++;
            }
        }
        return result;
    }

    public String judgeResult(String input) {
        return String.format("%dA%dB", judgeA(input), judgeB(input));
    }

    private String[] getSplit(String input) {
        return input.split("(?!^)");
    }
}
