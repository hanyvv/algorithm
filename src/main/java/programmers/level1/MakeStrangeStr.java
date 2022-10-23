package programmers.level1;

public class MakeStrangeStr {
    private static final String BLANK_SPACE = " ";
    public String solution(String s) {
        String[] spl = s.split("");

        StringBuilder sb = new StringBuilder();
        int index = 0;
        for (String value : spl) {
            if (value.equals(BLANK_SPACE)) {
                index = 0;
                sb.append(BLANK_SPACE);
            } else {
                if (index % 2 == 0) {
                    sb.append(value.toUpperCase());
                } else {
                    sb.append(value.toLowerCase());
                }
                index++;
            }
        }
        return sb.toString();
    }
}
