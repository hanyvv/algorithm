package programmers.level1;

public class CaesarCipher {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        String[] arr = s.split("");


        for (String str : arr) {
            if (str.equals(" ")) {
                sb.append(" ");
                continue;
            }

            char ch = str.charAt(0);
            int point = ch + n;

            if (Character.isUpperCase(ch)) {
                appendChar(sb, point, Character.isUpperCase(point), 'A', 'Z');
            } else {
                appendChar(sb, point, Character.isLowerCase(point), 'a', 'z');
            }
        }
        return sb.toString();
    }

    private void appendChar(StringBuilder sb, int point, boolean chCase, char start, char last) {
        if (Character.isAlphabetic(point) && chCase) {
            sb.append((char) point);
        } else {
            int x = point - last;
            sb.append((char) (start + (x - 1)));
        }
    }
}
