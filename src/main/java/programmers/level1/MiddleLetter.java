package programmers.level1;

public class MiddleLetter {
    public String solution(String s) {
        if (s.length() % 2 != 0) {
            return s.substring(s.length() / 2, s.length() / 2 + 1);
        }
        return s.substring(s.length() / 2 - 1, s.length() / 2 + 1);
    }
}
