package programmers.level1;

public class PAndYInString {
    public boolean solution(String s) {
        int p = 0;
        int y = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'y' || c == 'Y') {
                y++;
                continue;
            }

            if (c == 'p' || c == 'P') {
                p++;
            }
        }

        return p == y;
    }
}
