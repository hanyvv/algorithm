package programmers.level1;

public class Watermelon {
    private static final String PHRASE = "수박";
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        if (n % 2 == 0) {
            sb.append(PHRASE.repeat(Math.max(0, n / 2)));
            return sb.toString();
        }

        sb.append(PHRASE.repeat(Math.max(0, (n - 1) / 2)));
        return sb.append("수").toString();
    }
}
