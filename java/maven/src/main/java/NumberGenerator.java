import static java.lang.Math.random;

public class NumberGenerator {
    public String generate() {
        String result = "";
        while (result.length() < 4) {
            String random = randomDigit();
            if (! result.contains(random)){
                result = result.concat(random);
            }
        }
        return result;
    }

    private String randomDigit() {
        int random = (int)(random() * 10);
        return String.valueOf(random);
    }
}
